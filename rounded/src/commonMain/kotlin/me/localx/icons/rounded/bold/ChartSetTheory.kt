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

public val Icons.Bold.ChartSetTheory: ImageVector
    get() {
        if (_chartSetTheory != null) {
            return _chartSetTheory!!
        }
        _chartSetTheory = Builder(name = "ChartSetTheory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.42f, 9.592f)
                arcTo(7.426f, 7.426f, 0.0f, false, false, 19.5f, 8.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -15.0f, 0.0f)
                arcToRelative(7.426f, 7.426f, 0.0f, false, false, 0.08f, 1.092f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 12.0f, 22.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 7.42f, -12.9f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 4.5f, 4.5f)
                arcToRelative(4.583f, 4.583f, 0.0f, false, true, -0.028f, 0.5f)
                arcTo(7.463f, 7.463f, 0.0f, false, false, 12.0f, 10.5f)
                arcTo(7.463f, 7.463f, 0.0f, false, false, 7.528f, 9.0f)
                arcTo(4.583f, 4.583f, 0.0f, false, true, 7.5f, 8.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(3.0f, 16.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 2.607f, -4.082f)
                arcToRelative(7.548f, 7.548f, 0.0f, false, false, 3.473f, 2.99f)
                arcTo(7.494f, 7.494f, 0.0f, false, false, 10.0f, 20.24f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 3.0f, 16.5f)
                close()
                moveTo(16.5f, 21.0f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, true, -2.5f, -0.76f)
                arcToRelative(7.494f, 7.494f, 0.0f, false, false, 0.92f, -4.832f)
                arcToRelative(7.548f, 7.548f, 0.0f, false, false, 3.473f, -2.99f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _chartSetTheory!!
    }

private var _chartSetTheory: ImageVector? = null
