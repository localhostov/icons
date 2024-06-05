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

public val Icons.Bold.HundredPoints: ImageVector
    get() {
        if (_hundredPoints != null) {
            return _hundredPoints!!
        }
        _hundredPoints = Builder(name = "HundredPoints", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 6.559f)
                lineTo(0.121f, 4.724f)
                lineToRelative(2.66f, -2.724f)
                horizontalLineToRelative(2.219f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.441f)
                close()
                moveTo(15.0f, 8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                close()
                moveTo(18.0f, 8.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(23.493f, 12.979f)
                lineTo(-0.007f, 17.065f)
                lineToRelative(0.514f, 2.956f)
                lineToRelative(23.5f, -4.087f)
                lineToRelative(-0.514f, -2.956f)
                close()
                moveTo(8.995f, 21.002f)
                lineToRelative(0.51f, 2.956f)
                lineToRelative(14.5f, -2.5f)
                lineToRelative(-0.51f, -2.956f)
                lineToRelative(-14.5f, 2.5f)
                close()
            }
        }
        .build()
        return _hundredPoints!!
    }

private var _hundredPoints: ImageVector? = null
