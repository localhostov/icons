package me.localx.icons.rounded.bold

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

public val Icons.Bold.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) {
            return _chartScatter!!
        }
        _chartScatter = Builder(name = "ChartScatter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 24.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 1.5f)
                curveTo(0.033f, -0.472f, 2.967f, -0.471f, 3.0f, 1.5f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                lineTo(22.5f, 21.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                close()
                moveTo(14.0f, 12.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                close()
                moveTo(20.0f, 6.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                close()
                moveTo(11.0f, 17.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                close()
                moveTo(20.0f, 16.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                close()
                moveTo(9.0f, 4.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                close()
                moveTo(5.0f, 11.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
