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

public val Icons.Bold.ChartGantt: ImageVector
    get() {
        if (_chartGantt != null) {
            return _chartGantt!!
        }
        _chartGantt = Builder(name = "ChartGantt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 15.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.0f, 9.0f)
                lineTo(10.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                lineTo(13.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chartGantt!!
    }

private var _chartGantt: ImageVector? = null
