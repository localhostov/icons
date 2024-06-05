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

public val Icons.Filled.TicketAirline: ImageVector
    get() {
        if (_ticketAirline != null) {
            return _ticketAirline!!
        }
        _ticketAirline = Builder(name = "TicketAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.899f)
                curveTo(1.721f, 3.566f, 0.0f, 5.586f, 0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.434f, 4.0f, 4.899f)
                verticalLineToRelative(-1.899f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 10.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.911f, 2.421f)
                curveToRelative(-0.195f, 0.357f, -0.569f, 0.579f, -0.975f, 0.579f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.382f, 0.0f, -0.644f, -0.384f, -0.506f, -0.74f)
                lineToRelative(0.879f, -2.26f)
                horizontalLineToRelative(-1.32f)
                curveToRelative(-0.442f, 0.0f, -0.862f, -0.195f, -1.147f, -0.533f)
                lineToRelative(-1.096f, -1.3f)
                curveToRelative(-0.297f, -0.52f, 0.078f, -1.167f, 0.677f, -1.167f)
                curveToRelative(0.207f, 0.0f, 0.405f, 0.082f, 0.551f, 0.228f)
                lineToRelative(1.11f, 0.772f)
                horizontalLineToRelative(1.241f)
                lineToRelative(-0.891f, -2.258f)
                curveToRelative(-0.141f, -0.356f, 0.122f, -0.742f, 0.505f, -0.742f)
                horizontalLineToRelative(0.298f)
                curveToRelative(0.407f, 0.0f, 0.781f, 0.222f, 0.975f, 0.579f)
                lineToRelative(1.929f, 2.421f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _ticketAirline!!
    }

private var _ticketAirline: ImageVector? = null
