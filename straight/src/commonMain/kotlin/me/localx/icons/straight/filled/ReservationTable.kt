package me.localx.icons.straight.filled

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
                moveToRelative(7.456f, 22.0f)
                horizontalLineToRelative(16.515f)
                lineToRelative(-3.075f, -17.424f)
                curveToRelative(-0.263f, -1.493f, -1.554f, -2.576f, -3.07f, -2.576f)
                lineTo(6.148f, 2.0f)
                curveToRelative(-1.516f, 0.0f, -2.807f, 1.083f, -3.07f, 2.576f)
                lineTo(0.003f, 22.0f)
                horizontalLineToRelative(5.198f)
                lineToRelative(-0.333f, -2.0f)
                lineToRelative(-1.148f, -7.553f)
                lineToRelative(1.025f, -5.808f)
                lineToRelative(2.711f, 15.361f)
                close()
                moveTo(19.026f, 17.0f)
                horizontalLineToRelative(-8.391f)
                lineToRelative(-0.353f, -2.0f)
                horizontalLineToRelative(8.391f)
                lineToRelative(0.353f, 2.0f)
                close()
                moveTo(17.967f, 11.0f)
                lineToRelative(0.353f, 2.0f)
                horizontalLineToRelative(-8.391f)
                lineToRelative(-0.353f, -2.0f)
                horizontalLineToRelative(8.391f)
                close()
                moveTo(17.261f, 7.0f)
                lineToRelative(0.353f, 2.0f)
                horizontalLineToRelative(-8.391f)
                lineToRelative(-0.353f, -2.0f)
                horizontalLineToRelative(8.391f)
                close()
            }
        }
        .build()
        return _reservationTable!!
    }

private var _reservationTable: ImageVector? = null
