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

public val Icons.Outline.ParkingCircleSlash: ImageVector
    get() {
        if (_parkingCircleSlash != null) {
            return _parkingCircleSlash!!
        }
        _parkingCircleSlash = Builder(name = "ParkingCircleSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, 2.398f, -0.849f, 4.601f, -2.261f, 6.325f)
                lineToRelative(-4.625f, -4.625f)
                curveToRelative(1.686f, -0.65f, 2.886f, -2.288f, 2.886f, -4.2f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.976f, 0.0f, -1.845f, 0.469f, -2.393f, 1.193f)
                lineToRelative(-1.932f, -1.932f)
                curveToRelative(1.725f, -1.412f, 3.928f, -2.261f, 6.325f, -2.261f)
                curveToRelative(5.514f, 0.0f, 10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(13.414f, 12.0f)
                lineToRelative(-4.351f, -4.351f)
                curveToRelative(0.142f, -0.379f, 0.508f, -0.649f, 0.936f, -0.649f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.086f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, -2.398f, 0.849f, -4.601f, 2.261f, -6.325f)
                lineToRelative(14.065f, 14.065f)
                curveToRelative(-1.725f, 1.412f, -3.928f, 2.261f, -6.325f, 2.261f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                close()
                moveTo(7.0f, 11.242f)
                lineToRelative(2.758f, 2.758f)
                horizontalLineToRelative(-0.758f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.758f)
                close()
            }
        }
        .build()
        return _parkingCircleSlash!!
    }

private var _parkingCircleSlash: ImageVector? = null
