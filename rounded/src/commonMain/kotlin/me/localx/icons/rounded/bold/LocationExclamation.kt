package me.localx.icons.rounded.bold

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

public val Icons.Bold.LocationExclamation: ImageVector
    get() {
        if (_locationExclamation != null) {
            return _locationExclamation!!
        }
        _locationExclamation = Builder(name = "LocationExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.78f, 3.238f)
                curveToRelative(-2.077f, -2.088f, -4.84f, -3.238f, -7.78f, -3.238f)
                reflectiveCurveToRelative(-5.703f, 1.149f, -7.781f, 3.237f)
                curveTo(-0.065f, 7.543f, -0.065f, 14.548f, 4.262f, 18.895f)
                lineToRelative(3.734f, 3.465f)
                curveToRelative(1.076f, 1.058f, 2.498f, 1.641f, 4.004f, 1.641f)
                reflectiveCurveToRelative(2.928f, -0.583f, 3.973f, -1.61f)
                lineToRelative(3.808f, -3.536f)
                curveToRelative(4.284f, -4.306f, 4.284f, -11.311f, 0.0f, -15.615f)
                close()
                moveTo(17.696f, 16.695f)
                lineToRelative(-3.796f, 3.525f)
                curveToRelative(-1.021f, 1.006f, -2.748f, 1.036f, -3.832f, -0.03f)
                lineToRelative(-3.723f, -3.454f)
                curveToRelative(-3.124f, -3.138f, -3.124f, -8.244f, 0.0f, -11.382f)
                curveToRelative(1.511f, -1.519f, 3.519f, -2.354f, 5.654f, -2.354f)
                reflectiveCurveToRelative(4.144f, 0.836f, 5.653f, 2.354f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.124f, 3.139f, 3.124f, 8.245f, 0.043f, 11.342f)
                close()
                moveTo(13.5f, 6.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 15.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _locationExclamation!!
    }

private var _locationExclamation: ImageVector? = null
