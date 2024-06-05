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
                moveTo(9.758f, 14.0f)
                horizontalLineToRelative(-0.758f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.758f)
                lineToRelative(2.758f, 2.758f)
                close()
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.0f, 2.0f)
                lineTo(3.414f, 2.0f)
                lineTo(7.607f, 6.193f)
                curveToRelative(0.548f, -0.724f, 1.417f, -1.193f, 2.393f, -1.193f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.913f, -1.199f, 3.55f, -2.886f, 4.2f)
                lineToRelative(6.886f, 6.886f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.428f, 0.0f, -0.794f, 0.271f, -0.936f, 0.649f)
                lineToRelative(4.351f, 4.351f)
                horizontalLineToRelative(0.086f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(20.586f, 22.0f)
                lineTo(2.0f, 3.414f)
                lineTo(2.0f, 22.0f)
                close()
            }
        }
        .build()
        return _parkingSlash!!
    }

private var _parkingSlash: ImageVector? = null
