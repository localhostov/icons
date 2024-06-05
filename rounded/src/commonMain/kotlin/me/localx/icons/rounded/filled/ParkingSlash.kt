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

public val Icons.Filled.ParkingSlash: ImageVector
    get() {
        if (_parkingSlash != null) {
            return _parkingSlash!!
        }
        _parkingSlash = Builder(name = "ParkingSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.386f, 23.383f)
                curveToRelative(-0.154f, 0.374f, -0.52f, 0.617f, -0.924f, 0.617f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 6.539f)
                curveToRelative(0.0f, -0.404f, 0.243f, -0.769f, 0.617f, -0.924f)
                curveToRelative(0.374f, -0.153f, 0.804f, -0.07f, 1.09f, 0.217f)
                lineToRelative(5.293f, 5.37f)
                verticalLineToRelative(6.799f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.799f)
                lineToRelative(9.169f, 9.092f)
                curveToRelative(0.286f, 0.286f, 0.372f, 0.716f, 0.217f, 1.09f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.336f, -0.521f, 2.592f, -1.465f, 3.536f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.292f, -0.707f, 0.292f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(11.293f, 12.707f)
                lineTo(3.515f, 4.929f)
                horizontalLineToRelative(0.0f)
                lineTo(1.465f, 2.878f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(0.944f, -0.944f, 2.199f, -1.464f, 3.535f, -1.464f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(18.0f, 9.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.765f, 0.0f, -1.508f, 0.216f, -2.148f, 0.626f)
                curveToRelative(-0.466f, 0.297f, -0.602f, 0.916f, -0.305f, 1.381f)
                curveToRelative(0.298f, 0.466f, 0.915f, 0.601f, 1.381f, 0.305f)
                curveToRelative(0.319f, -0.204f, 0.69f, -0.312f, 1.072f, -0.312f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.886f, -0.476f, 1.714f, -1.242f, 2.161f)
                curveToRelative(-0.477f, 0.278f, -0.638f, 0.891f, -0.36f, 1.368f)
                curveToRelative(0.187f, 0.318f, 0.521f, 0.496f, 0.865f, 0.496f)
                curveToRelative(0.171f, 0.0f, 0.345f, -0.044f, 0.503f, -0.136f)
                curveToRelative(1.378f, -0.804f, 2.234f, -2.293f, 2.234f, -3.889f)
                close()
            }
        }
        .build()
        return _parkingSlash!!
    }

private var _parkingSlash: ImageVector? = null
