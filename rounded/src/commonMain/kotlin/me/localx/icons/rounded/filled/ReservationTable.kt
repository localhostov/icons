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

public val Icons.Filled.ReservationTable: ImageVector
    get() {
        if (_reservationTable != null) {
            return _reservationTable!!
        }
        _reservationTable = Builder(name = "ReservationTable", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.938f, 17.305f)
                lineToRelative(-1.972f, -11.174f)
                curveToRelative(-0.422f, -2.389f, -2.498f, -4.131f, -4.924f, -4.131f)
                lineTo(6.958f, 2.0f)
                curveToRelative(-3.458f, 0.0f, -4.664f, 2.655f, -4.924f, 4.131f)
                lineTo(0.072f, 17.244f)
                curveToRelative(-0.122f, 0.694f, -0.096f, 1.417f, 0.146f, 2.078f)
                curveToRelative(0.608f, 1.665f, 2.129f, 2.678f, 3.783f, 2.678f)
                curveToRelative(0.0f, 0.0f, 1.122f, -0.006f, 1.184f, -0.018f)
                curveToRelative(0.441f, -0.083f, 0.745f, -0.447f, 0.794f, -0.871f)
                curveToRelative(-0.6f, -0.82f, -1.048f, -1.765f, -1.246f, -2.817f)
                lineToRelative(-1.191f, -6.323f)
                curveToRelative(-0.175f, -0.929f, -0.171f, -1.881f, 0.011f, -2.809f)
                curveToRelative(0.282f, -1.436f, 0.695f, -3.474f, 0.805f, -3.664f)
                lineToRelative(2.339f, 12.426f)
                curveToRelative(0.445f, 2.363f, 2.509f, 4.075f, 4.914f, 4.075f)
                horizontalLineToRelative(8.242f)
                curveToRelative(0.909f, 0.0f, 1.821f, -0.245f, 2.545f, -0.796f)
                curveToRelative(1.231f, -0.936f, 1.798f, -2.436f, 1.54f, -3.899f)
                close()
                moveTo(9.0f, 8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(9.731f, 12.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(18.5f, 17.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _reservationTable!!
    }

private var _reservationTable: ImageVector? = null
