package utils

import (
	"github.com/stretchr/testify/assert"
	"k8s.io/apimachinery/pkg/types"
	"testing"
)

func TestPrepareModuleDeployment(t *testing.T) {
	moduleDeploymentName := "testModuleDeploymentName"
	moduleDeployment := PrepareModuleDeployment("default", moduleDeploymentName)
	assert.Equal(t, moduleDeploymentName, moduleDeployment.Name)
}

func TestMockClient(t *testing.T) {
	mockClient := MockClient{}
	assert.True(t, mockClient.Scheme() == nil)
	assert.Equal(t, nil, mockClient.RESTMapper())
	_, err := mockClient.GroupVersionKindFor(nil)
	assert.Equal(t, nil, err)
	_, err = mockClient.IsObjectNamespaced(nil)
	assert.Equal(t, nil, err)
	assert.Equal(t, nil, mockClient.Get(nil, types.NamespacedName{}, nil))
	assert.Equal(t, nil, mockClient.List(nil, nil))
	assert.Equal(t, nil, mockClient.Create(nil, nil))
	assert.Equal(t, nil, mockClient.Delete(nil, nil))
	assert.Equal(t, nil, mockClient.Update(nil, nil))
	assert.Equal(t, nil, mockClient.Patch(nil, nil, nil))
	assert.Equal(t, nil, mockClient.DeleteAllOf(nil, nil))
	assert.Equal(t, nil, mockClient.Status())
	assert.Equal(t, nil, mockClient.SubResource(""))
}
