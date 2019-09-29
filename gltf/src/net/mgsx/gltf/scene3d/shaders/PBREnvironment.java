package net.mgsx.gltf.scene3d.shaders;

import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.environment.ShadowMap;
import com.badlogic.gdx.utils.Array;

public class PBREnvironment extends Environment
{
	public final Array<ShadowMap> shadowMaps = new Array<ShadowMap>();
}
