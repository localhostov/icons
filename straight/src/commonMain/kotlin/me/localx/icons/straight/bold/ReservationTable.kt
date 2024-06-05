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

public val Icons.Bold.ReservationTable: ImageVector
    get() {
        if (_reservationTable != null) {
            return _reservationTable!!
        }
        _reservationTable = Builder(name = "ReservationTable", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.311f, 10.987f)
                lineToRelative(-0.5f, -3.0f)
                horizontalLineToRelative(6.583f)
                lineToRelative(0.5f, 3.0f)
                horizontalLineToRelative(-6.583f)
                close()
                moveTo(11.144f, 15.987f)
                horizontalLineToRelative(6.583f)
                lineToRelative(-0.5f, -3.0f)
                horizontalLineToRelative(-6.583f)
                lineToRelative(0.5f, 3.0f)
                close()
                moveTo(5.147f, 10.134f)
                lineToRelative(-1.565f, 8.866f)
                horizontalLineToRelative(1.119f)
                lineToRelative(0.5f, 3.0f)
                lineTo(0.007f, 22.0f)
                lineTo(3.026f, 4.892f)
                curveToRelative(0.295f, -1.675f, 1.745f, -2.892f, 3.446f, -2.892f)
                horizontalLineToRelative(11.029f)
                curveToRelative(1.701f, 0.0f, 3.15f, 1.216f, 3.447f, 2.891f)
                lineToRelative(3.02f, 17.109f)
                lineTo(7.242f, 22.0f)
                lineToRelative(-2.094f, -11.866f)
                close()
                moveTo(7.288f, 5.0f)
                lineToRelative(2.47f, 14.0f)
                horizontalLineToRelative(10.633f)
                lineToRelative(-2.397f, -13.587f)
                curveToRelative(-0.042f, -0.239f, -0.25f, -0.413f, -0.493f, -0.413f)
                lineTo(7.288f, 5.0f)
                close()
            }
        }
        .build()
        return _reservationTable!!
    }

private var _reservationTable: ImageVector? = null
