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

public val Icons.Bold.ReservationSmartphone: ImageVector
    get() {
        if (_reservationSmartphone != null) {
            return _reservationSmartphone!!
        }
        _reservationSmartphone = Builder(name = "ReservationSmartphone", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.115f, 11.0f)
                horizontalLineToRelative(-5.198f)
                lineToRelative(1.714f, 6.0f)
                horizontalLineToRelative(3.484f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.747f)
                lineToRelative(-2.571f, -9.0f)
                horizontalLineToRelative(-4.182f)
                curveToRelative(-0.747f, 0.0f, -1.44f, -0.536f, -1.56f, -1.273f)
                curveToRelative(-0.153f, -0.94f, 0.568f, -1.739f, 1.479f, -1.739f)
                lineToRelative(7.388f, 0.013f)
                lineToRelative(-0.835f, -1.152f)
                curveToRelative(-0.722f, -0.866f, -0.604f, -2.153f, 0.261f, -2.874f)
                curveToRelative(0.866f, -0.722f, 2.153f, -0.605f, 2.874f, 0.261f)
                lineToRelative(2.891f, 3.766f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.288f, 13.0f)
                lineToRelative(1.712f, 5.991f)
                verticalLineToRelative(2.009f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.288f)
                close()
                moveTo(10.006f, 20.006f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.003f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.003f)
                close()
            }
        }
        .build()
        return _reservationSmartphone!!
    }

private var _reservationSmartphone: ImageVector? = null
