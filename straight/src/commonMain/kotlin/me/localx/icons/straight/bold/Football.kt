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

public val Icons.Bold.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(10.642f, 20.886f)
                lineTo(9.076f, 16.0f)
                lineTo(3.947f, 15.993f)
                arcToRelative(8.878f, 8.878f, 0.0f, false, true, -0.832f, -2.628f)
                lineToRelative(4.153f, -2.927f)
                lineToRelative(-1.515f, -4.9f)
                arcToRelative(9.087f, 9.087f, 0.0f, false, true, 2.128f, -1.531f)
                lineToRelative(4.119f, 2.993f)
                lineToRelative(4.119f, -2.993f)
                arcToRelative(9.087f, 9.087f, 0.0f, false, true, 2.128f, 1.528f)
                lineToRelative(-1.515f, 4.9f)
                lineToRelative(4.153f, 2.927f)
                arcToRelative(8.894f, 8.894f, 0.0f, false, true, -0.832f, 2.629f)
                lineToRelative(-5.129f, 0.009f)
                lineToRelative(-1.566f, 4.886f)
                arcToRelative(8.939f, 8.939f, 0.0f, false, true, -1.358f, 0.114f)
                arcToRelative(8.939f, 8.939f, 0.0f, false, true, -1.358f, -0.114f)
                close()
                moveTo(14.924f, 16.0f)
                horizontalLineToRelative(-5.848f)
                lineToRelative(-1.808f, -5.562f)
                lineToRelative(4.732f, -3.438f)
                lineToRelative(4.732f, 3.438f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
