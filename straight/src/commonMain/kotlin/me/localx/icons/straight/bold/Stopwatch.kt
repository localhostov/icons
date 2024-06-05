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

public val Icons.Bold.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 11.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.0f, 0.0f)
                verticalLineToRelative(-4.69f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.4f, 5.911f)
                arcToRelative(11.0f, 11.0f, 0.0f, true, true, -16.8f, 0.0f)
                lineToRelative(-0.66f, -0.732f)
                lineToRelative(-0.756f, 0.757f)
                lineToRelative(-2.12f, -2.122f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(-0.869f, 0.868f)
                lineToRelative(0.762f, 0.846f)
                arcToRelative(10.927f, 10.927f, 0.0f, false, true, 4.671f, -1.785f)
                verticalLineToRelative(-2.115f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.115f)
                arcToRelative(10.927f, 10.927f, 0.0f, false, true, 4.671f, 1.785f)
                lineToRelative(0.762f, -0.846f)
                lineToRelative(-0.869f, -0.868f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(-0.756f, -0.757f)
                close()
                moveTo(20.0f, 13.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
