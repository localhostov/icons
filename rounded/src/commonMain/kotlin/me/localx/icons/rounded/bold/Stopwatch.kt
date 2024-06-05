package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(13.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(3.19f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                curveToRelative(-0.841f, 0.0f, -1.0f, -0.159f, -1.0f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(4.861f, 4.861f, 0.0f, false, false, 0.289f, 1.715f)
                lineToRelative(-0.618f, 0.685f)
                arcToRelative(10.927f, 10.927f, 0.0f, false, false, -4.671f, -1.785f)
                verticalLineToRelative(-0.615f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.615f)
                arcToRelative(10.927f, 10.927f, 0.0f, false, false, -4.671f, 1.785f)
                lineToRelative(-0.618f, -0.685f)
                arcToRelative(4.861f, 4.861f, 0.0f, false, false, 0.289f, -1.715f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                curveToRelative(0.0f, 0.841f, -0.159f, 1.0f, -1.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcToRelative(4.953f, 4.953f, 0.0f, false, false, 1.523f, -0.232f)
                lineToRelative(0.579f, 0.643f)
                arcToRelative(11.0f, 11.0f, 0.0f, true, false, 16.8f, 0.0f)
                lineToRelative(0.579f, -0.643f)
                arcToRelative(4.953f, 4.953f, 0.0f, false, false, 1.519f, 0.232f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
