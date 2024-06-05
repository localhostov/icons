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

public val Icons.Bold.RegistrationPaper: ImageVector
    get() {
        if (_registrationPaper != null) {
            return _registrationPaper!!
        }
        _registrationPaper = Builder(name = "RegistrationPaper", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.738f)
                curveToRelative(-0.64f, 0.165f, -1.308f, 0.262f, -2.0f, 0.262f)
                curveToRelative(-0.339f, 0.0f, -0.672f, -0.028f, -1.0f, -0.069f)
                verticalLineToRelative(2.069f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(8.0f, 4.0f)
                curveToRelative(0.0f, -0.345f, -0.044f, -0.68f, -0.127f, -1.0f)
                horizontalLineToRelative(2.714f)
                curveToRelative(0.471f, -1.162f, 1.208f, -2.185f, 2.134f, -3.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.262f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 20.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.127f)
                curveToRelative(0.083f, -0.32f, 0.127f, -0.655f, 0.127f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveTo(21.314f, 0.0f, 18.0f, 0.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(15.13f, 4.716f)
                lineToRelative(2.216f, 2.301f)
                lineToRelative(3.614f, -3.703f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.607f, 3.696f)
                lineToRelative(-0.004f, 0.004f)
                curveToRelative(-0.744f, 0.744f, -2.058f, 0.746f, -2.823f, -0.019f)
                lineToRelative(-2.182f, -2.268f)
                lineToRelative(1.387f, -1.441f)
                close()
            }
        }
        .build()
        return _registrationPaper!!
    }

private var _registrationPaper: ImageVector? = null
