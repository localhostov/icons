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

public val Icons.Outline.ParkingSlash: ImageVector
    get() {
        if (_parkingSlash != null) {
            return _parkingSlash!!
        }
        _parkingSlash = Builder(name = "ParkingSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.239f, 0.0f, 0.0f, 2.239f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(19.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.463f, -0.105f, 0.901f, -0.293f, 1.293f)
                lineToRelative(-6.592f, -6.593f)
                curveToRelative(1.686f, -0.65f, 2.886f, -2.288f, 2.886f, -4.2f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.226f, 0.0f, -2.359f, 0.563f, -3.105f, 1.48f)
                lineTo(3.708f, 2.293f)
                curveToRelative(0.392f, -0.188f, 0.83f, -0.293f, 1.292f, -0.293f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(13.414f, 12.0f)
                lineToRelative(-4.091f, -4.091f)
                curveToRelative(0.364f, -0.557f, 0.992f, -0.909f, 1.677f, -0.909f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.086f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -0.463f, 0.105f, -0.901f, 0.293f, -1.293f)
                lineTo(20.292f, 21.707f)
                curveToRelative(-0.392f, 0.188f, -0.83f, 0.293f, -1.292f, 0.293f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _parkingSlash!!
    }

private var _parkingSlash: ImageVector? = null
