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

public val Icons.Filled.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 1.863f, -0.522f, 3.603f, -1.412f, 5.098f)
                lineToRelative(-7.588f, -7.588f)
                lineTo(13.0f, 2.051f)
                curveToRelative(5.046f, 0.503f, 9.0f, 4.773f, 9.0f, 9.949f)
                close()
                moveTo(11.0f, 2.051f)
                verticalLineToRelative(7.421f)
                lineToRelative(-7.602f, 7.602f)
                curveToRelative(-0.882f, -1.49f, -1.398f, -3.22f, -1.398f, -5.073f)
                curveTo(2.0f, 6.823f, 5.954f, 2.554f, 11.0f, 2.051f)
                close()
                moveTo(4.599f, 18.701f)
                lineToRelative(6.401f, -6.401f)
                verticalLineToRelative(9.65f)
                curveToRelative(-2.532f, -0.253f, -4.781f, -1.461f, -6.401f, -3.249f)
                close()
                moveTo(13.0f, 21.95f)
                verticalLineToRelative(-9.611f)
                lineToRelative(6.383f, 6.383f)
                curveToRelative(-1.619f, 1.777f, -3.86f, 2.976f, -6.383f, 3.228f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
