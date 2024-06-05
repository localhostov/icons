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

public val Icons.Filled.TicketsAirline: ImageVector
    get() {
        if (_ticketsAirline != null) {
            return _ticketsAirline!!
        }
        _ticketsAirline = Builder(name = "TicketsAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 24.0f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-2.404f, 0.0f, -4.664f, -0.937f, -6.364f, -2.636f)
                curveTo(0.936f, 19.664f, 0.0f, 17.403f, 0.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.87f, 0.728f, 3.628f, 2.05f, 4.949f)
                curveToRelative(1.322f, 1.322f, 3.081f, 2.051f, 4.95f, 2.051f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.929f, -2.421f)
                curveToRelative(-0.195f, -0.357f, -0.569f, -0.579f, -0.975f, -0.579f)
                horizontalLineToRelative(-0.117f)
                curveToRelative(-0.383f, 0.0f, -0.646f, 0.386f, -0.505f, 0.742f)
                lineToRelative(0.891f, 2.258f)
                horizontalLineToRelative(-1.423f)
                lineToRelative(-1.11f, -0.772f)
                curveToRelative(-0.146f, -0.146f, -0.345f, -0.228f, -0.551f, -0.228f)
                curveToRelative(-0.599f, 0.0f, -0.974f, 0.647f, -0.677f, 1.167f)
                lineToRelative(1.096f, 1.3f)
                curveToRelative(0.285f, 0.338f, 0.705f, 0.533f, 1.147f, 0.533f)
                horizontalLineToRelative(1.501f)
                lineToRelative(-0.879f, 2.26f)
                curveToRelative(-0.138f, 0.356f, 0.124f, 0.74f, 0.506f, 0.74f)
                horizontalLineToRelative(0.138f)
                curveToRelative(0.407f, 0.0f, 0.781f, -0.222f, 0.975f, -0.579f)
                lineToRelative(1.911f, -2.421f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _ticketsAirline!!
    }

private var _ticketsAirline: ImageVector? = null
