package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Wreath: ImageVector
    get() {
        if (_wreath != null) {
            return _wreath!!
        }
        _wreath = Builder(name = "Wreath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 7.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.693f, -0.174f, 1.373f, -0.502f, 1.964f)
                curveToRelative(-0.348f, 0.627f, -0.817f, 1.135f, -1.396f, 1.508f)
                curveToRelative(-0.407f, 0.263f, -0.613f, 0.733f, -0.514f, 1.173f)
                curveToRelative(0.156f, 0.688f, 0.133f, 1.395f, -0.069f, 2.098f)
                curveToRelative(-0.148f, 0.518f, -0.398f, 0.994f, -0.741f, 1.418f)
                curveToRelative(-0.197f, 0.244f, -0.486f, 0.371f, -0.778f, 0.371f)
                curveToRelative(-0.221f, 0.0f, -0.443f, -0.073f, -0.628f, -0.223f)
                curveToRelative(-0.43f, -0.348f, -0.496f, -0.978f, -0.148f, -1.406f)
                curveToRelative(0.172f, -0.212f, 0.301f, -0.458f, 0.374f, -0.713f)
                curveToRelative(0.107f, -0.375f, 0.122f, -0.747f, 0.041f, -1.103f)
                curveToRelative(-0.285f, -1.255f, 0.27f, -2.58f, 1.38f, -3.296f)
                curveToRelative(0.299f, -0.192f, 0.545f, -0.461f, 0.732f, -0.798f)
                curveToRelative(0.163f, -0.295f, 0.25f, -0.639f, 0.25f, -0.993f)
                reflectiveCurveToRelative(-0.087f, -0.698f, -0.25f, -0.993f)
                curveToRelative(-0.188f, -0.337f, -0.434f, -0.605f, -0.732f, -0.799f)
                curveToRelative(-1.11f, -0.715f, -1.665f, -2.04f, -1.379f, -3.296f)
                curveToRelative(0.08f, -0.354f, 0.065f, -0.727f, -0.042f, -1.104f)
                curveToRelative(-0.19f, -0.663f, -0.742f, -1.215f, -1.406f, -1.405f)
                curveToRelative(-0.375f, -0.107f, -0.747f, -0.121f, -1.104f, -0.041f)
                curveToRelative(-1.257f, 0.286f, -2.578f, -0.269f, -3.296f, -1.379f)
                curveToRelative(-0.193f, -0.301f, -0.461f, -0.546f, -0.796f, -0.731f)
                curveToRelative(-0.605f, -0.336f, -1.386f, -0.335f, -1.988f, 0.0f)
                curveToRelative(-0.336f, 0.187f, -0.604f, 0.433f, -0.798f, 0.731f)
                curveToRelative(-0.717f, 1.111f, -2.04f, 1.67f, -3.297f, 1.379f)
                curveToRelative(-0.354f, -0.08f, -0.726f, -0.065f, -1.101f, 0.042f)
                curveToRelative(-0.665f, 0.19f, -1.217f, 0.742f, -1.407f, 1.406f)
                curveToRelative(-0.108f, 0.376f, -0.122f, 0.747f, -0.042f, 1.103f)
                curveToRelative(0.285f, 1.256f, -0.27f, 2.58f, -1.38f, 3.297f)
                curveToRelative(-0.299f, 0.192f, -0.545f, 0.461f, -0.731f, 0.797f)
                curveToRelative(-0.165f, 0.297f, -0.251f, 0.64f, -0.251f, 0.994f)
                reflectiveCurveToRelative(0.087f, 0.697f, 0.251f, 0.993f)
                curveToRelative(0.187f, 0.337f, 0.433f, 0.605f, 0.732f, 0.799f)
                curveToRelative(1.11f, 0.716f, 1.665f, 2.04f, 1.379f, 3.296f)
                curveToRelative(-0.081f, 0.355f, -0.067f, 0.727f, 0.042f, 1.104f)
                curveToRelative(0.072f, 0.252f, 0.202f, 0.498f, 0.374f, 0.712f)
                curveToRelative(0.347f, 0.429f, 0.28f, 1.059f, -0.149f, 1.406f)
                curveToRelative(-0.43f, 0.347f, -1.059f, 0.28f, -1.406f, -0.15f)
                curveToRelative(-0.344f, -0.425f, -0.593f, -0.901f, -0.741f, -1.417f)
                curveToRelative(-0.202f, -0.704f, -0.225f, -1.41f, -0.069f, -2.098f)
                curveToRelative(0.1f, -0.438f, -0.107f, -0.91f, -0.514f, -1.172f)
                curveToRelative(-0.58f, -0.375f, -1.049f, -0.883f, -1.397f, -1.51f)
                curveToRelative(-0.328f, -0.591f, -0.501f, -1.27f, -0.501f, -1.963f)
                reflectiveCurveToRelative(0.174f, -1.372f, 0.502f, -1.964f)
                curveToRelative(0.347f, -0.626f, 0.817f, -1.134f, 1.396f, -1.508f)
                curveToRelative(0.407f, -0.263f, 0.614f, -0.734f, 0.514f, -1.173f)
                curveToRelative(-0.156f, -0.688f, -0.133f, -1.394f, 0.069f, -2.098f)
                curveToRelative(0.382f, -1.332f, 1.447f, -2.396f, 2.778f, -2.776f)
                curveToRelative(0.702f, -0.203f, 1.407f, -0.226f, 2.095f, -0.07f)
                curveToRelative(0.441f, 0.099f, 0.911f, -0.106f, 1.174f, -0.514f)
                curveToRelative(0.374f, -0.579f, 0.881f, -1.049f, 1.508f, -1.396f)
                curveToRelative(1.209f, -0.673f, 2.715f, -0.673f, 3.928f, 0.0f)
                curveToRelative(0.627f, 0.347f, 1.134f, 0.817f, 1.507f, 1.396f)
                curveToRelative(0.263f, 0.405f, 0.729f, 0.609f, 1.173f, 0.513f)
                curveToRelative(0.687f, -0.157f, 1.394f, -0.133f, 2.097f, 0.069f)
                curveToRelative(1.332f, 0.381f, 2.396f, 1.445f, 2.777f, 2.776f)
                curveToRelative(0.202f, 0.703f, 0.226f, 1.409f, 0.07f, 2.097f)
                curveToRelative(-0.101f, 0.44f, 0.105f, 0.911f, 0.513f, 1.173f)
                curveToRelative(0.579f, 0.374f, 1.049f, 0.882f, 1.396f, 1.509f)
                curveToRelative(0.328f, 0.591f, 0.502f, 1.271f, 0.502f, 1.964f)
                close()
                moveTo(16.996f, 21.0f)
                curveToRelative(0.0f, 1.657f, 0.157f, 3.0f, -1.5f, 3.0f)
                curveToRelative(-1.03f, 0.0f, -2.519f, -1.16f, -3.498f, -2.038f)
                curveToRelative(-0.979f, 0.877f, -2.468f, 2.038f, -3.498f, 2.038f)
                curveToRelative(-1.657f, 0.0f, -1.5f, -1.343f, -1.5f, -3.0f)
                reflectiveCurveToRelative(-0.157f, -3.0f, 1.5f, -3.0f)
                curveToRelative(1.03f, 0.0f, 2.519f, 1.16f, 3.498f, 2.038f)
                curveToRelative(0.979f, -0.877f, 2.468f, -2.038f, 3.498f, -2.038f)
                curveToRelative(1.657f, 0.0f, 1.5f, 1.343f, 1.5f, 3.0f)
                close()
            }
        }
        .build()
        return _wreath!!
    }

private var _wreath: ImageVector? = null
