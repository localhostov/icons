package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Pear: ImageVector
    get() {
        if (_pear != null) {
            return _pear!!
        }
        _pear = Builder(name = "Pear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.68f, 3.926f)
                curveToRelative(0.868f, -0.893f, 1.82f, -2.251f, 1.82f, -3.926f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 0.997f, -0.615f, 1.87f, -1.208f, 2.486f)
                curveToRelative(-0.86f, -0.671f, -1.872f, -1.153f, -2.979f, -1.36f)
                curveToRelative(-2.832f, -0.533f, -5.668f, 0.667f, -7.233f, 3.049f)
                curveToRelative(-0.41f, 0.624f, -0.997f, 1.011f, -1.609f, 1.061f)
                curveToRelative(-2.248f, 0.184f, -4.363f, 1.163f, -5.958f, 2.758f)
                curveTo(0.728f, 9.78f, -0.156f, 12.095f, 0.023f, 14.513f)
                curveToRelative(0.17f, 2.282f, 1.269f, 4.545f, 3.094f, 6.37f)
                curveToRelative(2.066f, 2.067f, 4.556f, 3.112f, 6.969f, 3.112f)
                curveToRelative(2.151f, 0.0f, 4.242f, -0.83f, 5.919f, -2.508f)
                curveToRelative(1.595f, -1.595f, 2.574f, -3.711f, 2.758f, -5.957f)
                curveToRelative(0.05f, -0.612f, 0.437f, -1.199f, 1.061f, -1.609f)
                curveToRelative(2.382f, -1.565f, 3.579f, -4.404f, 3.049f, -7.233f)
                curveToRelative(-0.19f, -1.014f, -0.609f, -1.95f, -1.193f, -2.761f)
                close()
                moveTo(18.725f, 12.249f)
                curveToRelative(-1.142f, 0.751f, -1.854f, 1.888f, -1.955f, 3.117f)
                curveToRelative(-0.146f, 1.775f, -0.919f, 3.447f, -2.179f, 4.707f)
                curveToRelative(-2.785f, 2.781f, -6.92f, 2.535f, -10.06f, -0.604f)
                curveToRelative(-1.487f, -1.487f, -2.379f, -3.3f, -2.514f, -5.104f)
                curveToRelative(-0.138f, -1.856f, 0.522f, -3.57f, 1.909f, -4.957f)
                curveToRelative(1.26f, -1.26f, 2.931f, -2.033f, 4.707f, -2.179f)
                curveToRelative(1.23f, -0.101f, 2.366f, -0.813f, 3.117f, -1.956f)
                curveToRelative(0.945f, -1.437f, 2.54f, -2.271f, 4.235f, -2.271f)
                curveToRelative(0.317f, 0.0f, 0.639f, 0.029f, 0.959f, 0.089f)
                curveToRelative(1.965f, 0.367f, 3.595f, 1.997f, 3.963f, 3.963f)
                curveToRelative(0.381f, 2.034f, -0.476f, 4.072f, -2.183f, 5.194f)
                close()
                moveTo(15.0f, 13.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 17.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pear!!
    }

private var _pear: ImageVector? = null
