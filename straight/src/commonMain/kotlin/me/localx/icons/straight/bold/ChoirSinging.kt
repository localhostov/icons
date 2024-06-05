package me.localx.icons.straight.bold

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

public val Icons.Bold.ChoirSinging: ImageVector
    get() {
        if (_choirSinging != null) {
            return _choirSinging!!
        }
        _choirSinging = Builder(name = "ChoirSinging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24.0f, 24.0f)
                horizontalLineToRelative(-2.625f)
                reflectiveCurveToRelative(-1.162f, -7.008f, -1.774f, -10.619f)
                lineToRelative(-0.726f, -3.792f)
                curveToRelative(-0.375f, -1.459f, -1.051f, -2.657f, -1.946f, -3.576f)
                curveToRelative(2.434f, 0.067f, 4.133f, 1.518f, 4.784f, 4.123f)
                curveToRelative(0.512f, 2.047f, 2.287f, 13.864f, 2.287f, 13.864f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(16.955f, 10.136f)
                curveToRelative(-0.667f, -2.667f, -2.426f, -4.136f, -4.955f, -4.136f)
                reflectiveCurveToRelative(-4.289f, 1.469f, -4.955f, 4.136f)
                curveToRelative(-0.512f, 2.047f, -2.287f, 13.864f, -2.287f, 13.864f)
                horizontalLineToRelative(14.483f)
                reflectiveCurveToRelative(-1.775f, -11.817f, -2.287f, -13.864f)
                close()
                moveTo(9.0f, 9.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
                verticalLineToRelative(4.276f)
                lineToRelative(-3.0f, 2.0f)
                lineToRelative(-3.0f, -2.0f)
                verticalLineToRelative(-4.276f)
                close()
                moveTo(8.245f, 21.0f)
                curveToRelative(0.202f, -1.317f, 0.457f, -2.949f, 0.712f, -4.529f)
                lineToRelative(3.043f, 2.029f)
                lineToRelative(3.043f, -2.029f)
                curveToRelative(0.255f, 1.58f, 0.51f, 3.211f, 0.712f, 4.529f)
                horizontalLineToRelative(-7.51f)
                close()
                moveTo(5.124f, 9.589f)
                lineToRelative(-0.726f, 3.792f)
                curveToRelative(-0.613f, 3.614f, -1.663f, 10.619f, -1.663f, 10.619f)
                lineTo(0.0f, 24.0f)
                reflectiveCurveToRelative(1.775f, -11.817f, 2.287f, -13.864f)
                curveToRelative(0.651f, -2.604f, 2.35f, -4.056f, 4.784f, -4.123f)
                curveToRelative(-0.895f, 0.919f, -1.571f, 2.117f, -1.946f, 3.576f)
                close()
                moveTo(5.999f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(7.381f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _choirSinging!!
    }

private var _choirSinging: ImageVector? = null
