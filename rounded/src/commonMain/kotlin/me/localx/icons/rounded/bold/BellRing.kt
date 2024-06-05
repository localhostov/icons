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

public val Icons.Bold.BellRing: ImageVector
    get() {
        if (_bellRing != null) {
            return _bellRing!!
        }
        _bellRing = Builder(name = "BellRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.221f, 4.283f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.5f, -2.062f)
                lineToRelative(3.268f, -2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.563f, 2.558f)
                lineToRelative(-3.269f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.062f, -0.5f)
                close()
                moveTo(23.288f, 17.983f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.064f, 0.489f)
                lineToRelative(-2.0f, 3.241f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.552f, 1.576f)
                lineToRelative(2.0f, -3.241f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.488f, -2.066f)
                close()
                moveTo(20.835f, 15.483f)
                lineTo(17.235f, 21.348f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, -4.086f, 2.611f)
                arcToRelative(5.91f, 5.91f, 0.0f, false, true, -0.663f, 0.039f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.386f, -1.183f)
                arcToRelative(4.183f, 4.183f, 0.0f, false, true, -5.956f, -5.872f)
                lineToRelative(-1.494f, -1.5f)
                arcToRelative(5.54f, 5.54f, 0.0f, false, true, -1.6f, -4.589f)
                arcToRelative(5.483f, 5.483f, 0.0f, false, true, 2.587f, -4.054f)
                lineToRelative(5.487f, -3.387f)
                arcToRelative(8.982f, 8.982f, 0.0f, false, true, 10.076f, 0.267f)
                lineToRelative(1.24f, -1.241f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, 2.122f)
                lineToRelative(-1.239f, 1.239f)
                arcToRelative(9.054f, 9.054f, 0.0f, false, true, 0.512f, 9.686f)
                close()
                moveTo(17.235f, 6.776f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, false, -7.519f, -0.823f)
                lineToRelative(-5.5f, 3.4f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, -1.18f, 1.853f)
                arcToRelative(2.559f, 2.559f, 0.0f, false, false, 0.742f, 2.12f)
                lineToRelative(6.912f, 6.928f)
                arcToRelative(2.563f, 2.563f, 0.0f, false, false, 3.991f, -0.473f)
                lineToRelative(3.573f, -5.818f)
                arcToRelative(6.025f, 6.025f, 0.0f, false, false, -1.018f, -7.184f)
                close()
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
