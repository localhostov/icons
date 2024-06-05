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

public val Icons.Bold.ChartLineUpDown: ImageVector
    get() {
        if (_chartLineUpDown != null) {
            return _chartLineUpDown!!
        }
        _chartLineUpDown = Builder(name = "ChartLineUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.5f, 21.0f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(3.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(20.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(22.909f, 2.0f)
                horizontalLineToRelative(-5.909f)
                lineToRelative(2.439f, 2.439f)
                lineToRelative(-4.939f, 4.939f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-5.561f, 5.561f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.439f, -3.439f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.061f, -7.061f)
                lineToRelative(2.439f, 2.439f)
                lineTo(23.999f, 3.091f)
                curveToRelative(0.0f, -0.602f, -0.488f, -1.091f, -1.091f, -1.091f)
                close()
                moveTo(19.06f, 11.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-2.439f, 2.439f)
                horizontalLineToRelative(5.909f)
                curveToRelative(0.603f, 0.0f, 1.091f, -0.488f, 1.091f, -1.091f)
                verticalLineToRelative(-5.909f)
                lineToRelative(-2.439f, 2.439f)
                lineToRelative(-2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _chartLineUpDown!!
    }

private var _chartLineUpDown: ImageVector? = null
