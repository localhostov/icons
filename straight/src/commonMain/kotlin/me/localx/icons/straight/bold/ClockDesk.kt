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

public val Icons.Bold.ClockDesk: ImageVector
    get() {
        if (_clockDesk != null) {
            return _clockDesk!!
        }
        _clockDesk = Builder(name = "ClockDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-14.0f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineToRelative(-3.866f)
                curveToRelative(1.805f, 1.772f, 4.277f, 2.866f, 7.0f, 2.866f)
                reflectiveCurveToRelative(5.195f, -1.095f, 7.0f, -2.866f)
                verticalLineToRelative(3.866f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(9.244f, 13.302f)
                lineToRelative(-1.488f, -2.604f)
                lineToRelative(2.744f, -1.568f)
                verticalLineToRelative(-4.129f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.871f)
                lineToRelative(-4.256f, 2.432f)
                close()
            }
        }
        .build()
        return _clockDesk!!
    }

private var _clockDesk: ImageVector? = null
