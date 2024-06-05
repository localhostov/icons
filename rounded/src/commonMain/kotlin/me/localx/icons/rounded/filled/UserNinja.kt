package me.localx.icons.rounded.filled

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

public val Icons.Filled.UserNinja: ImageVector
    get() {
        if (_userNinja != null) {
            return _userNinja!!
        }
        _userNinja = Builder(name = "UserNinja", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.608f, 6.017f)
                curveToRelative(-0.42f, -0.296f, -0.943f, -0.443f, -1.449f, -0.517f)
                curveToRelative(0.506f, -0.074f, 1.029f, -0.222f, 1.449f, -0.517f)
                curveToRelative(0.725f, -0.51f, 1.141f, -1.444f, 1.359f, -2.117f)
                curveToRelative(0.137f, -0.421f, -0.173f, -0.855f, -0.615f, -0.864f)
                curveToRelative(-0.72f, -0.015f, -1.761f, 0.07f, -2.491f, 0.583f)
                curveToRelative(-0.545f, 0.384f, -0.909f, 1.005f, -1.152f, 1.577f)
                curveToRelative(-0.778f, -2.412f, -3.042f, -4.162f, -5.709f, -4.162f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.897f, 0.0f, 5.321f, -2.064f, 5.879f, -4.798f)
                curveToRelative(0.236f, 0.458f, 0.552f, 0.911f, 0.982f, 1.214f)
                curveToRelative(0.729f, 0.514f, 1.771f, 0.598f, 2.491f, 0.583f)
                curveToRelative(0.443f, -0.009f, 0.752f, -0.443f, 0.615f, -0.864f)
                curveToRelative(-0.219f, -0.674f, -0.635f, -1.607f, -1.359f, -2.117f)
                close()
                moveTo(13.984f, 7.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.994f, 20.903f)
                curveToRelative(-1.64f, -2.294f, -2.853f, -4.473f, -3.635f, -6.018f)
                curveToRelative(1.094f, -0.562f, 2.329f, -0.885f, 3.641f, -0.885f)
                reflectiveCurveToRelative(2.536f, 0.321f, 3.626f, 0.878f)
                curveToRelative(-0.711f, 1.497f, -1.871f, 3.63f, -3.631f, 6.025f)
                close()
                moveTo(19.0f, 24.0f)
                horizontalLineToRelative(-4.546f)
                curveToRelative(-0.42f, -0.474f, -0.823f, -0.953f, -1.207f, -1.436f)
                curveToRelative(1.945f, -2.568f, 3.236f, -4.869f, 4.051f, -6.542f)
                curveToRelative(1.653f, 1.467f, 2.701f, 3.599f, 2.701f, 5.977f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(6.693f, 16.03f)
                curveToRelative(1.038f, 2.029f, 2.752f, 5.012f, 5.141f, 7.97f)
                horizontalLineToRelative(-6.835f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.374f, 1.046f, -4.504f, 2.693f, -5.97f)
                close()
            }
        }
        .build()
        return _userNinja!!
    }

private var _userNinja: ImageVector? = null
