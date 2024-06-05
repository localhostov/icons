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
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(2.398f, 0.0f, 4.601f, -0.849f, 6.325f, -2.261f)
                lineTo(4.261f, 5.675f)
                curveToRelative(-1.412f, 1.725f, -2.261f, 3.928f, -2.261f, 6.325f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.685f, 0.0f, -1.313f, 0.352f, -1.677f, 0.909f)
                lineToRelative(4.091f, 4.091f)
                horizontalLineToRelative(0.086f)
                close()
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-2.398f, 0.0f, -4.601f, 0.849f, -6.325f, 2.261f)
                lineToRelative(2.22f, 2.22f)
                curveToRelative(0.746f, -0.917f, 1.88f, -1.48f, 3.106f, -1.48f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.913f, -1.199f, 3.55f, -2.886f, 4.2f)
                lineToRelative(4.625f, 4.625f)
                curveToRelative(1.412f, -1.725f, 2.261f, -3.928f, 2.261f, -6.325f)
                close()
            }
        }
        .build()
        return _parkingCircleSlash!!
    }

private var _parkingCircleSlash: ImageVector? = null
