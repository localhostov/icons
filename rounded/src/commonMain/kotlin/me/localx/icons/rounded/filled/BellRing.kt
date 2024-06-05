package me.localx.icons.rounded.filled

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

public val Icons.Filled.BellRing: ImageVector
    get() {
        if (_bellRing != null) {
            return _bellRing!!
        }
        _bellRing = Builder(name = "BellRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.31f, 17.192f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, true, -5.5f, -5.5f)
                close()
                moveTo(7.327f, 1.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.4f, -1.96f)
                arcToRelative(10.689f, 10.689f, 0.0f, false, false, -6.714f, 4.125f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.607f, 1.189f)
                arcToRelative(8.641f, 8.641f, 0.0f, false, true, 5.507f, -3.354f)
                close()
                moveTo(23.2f, 16.023f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.191f, 0.762f)
                arcToRelative(8.638f, 8.638f, 0.0f, false, true, -3.317f, 5.407f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.18f, 1.616f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, 4.09f, -6.593f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.762f, -1.192f)
                close()
                moveTo(20.167f, 5.247f)
                lineTo(21.707f, 3.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                lineToRelative(-1.542f, 1.542f)
                arcToRelative(8.456f, 8.456f, 0.0f, false, false, -9.822f, -0.5f)
                lineToRelative(-5.5f, 3.4f)
                arcToRelative(5.026f, 5.026f, 0.0f, false, false, -0.912f, 7.829f)
                lineToRelative(6.959f, 6.959f)
                arcToRelative(5.026f, 5.026f, 0.0f, false, false, 7.839f, -0.926f)
                lineToRelative(3.6f, -5.876f)
                arcToRelative(8.543f, 8.543f, 0.0f, false, false, -0.748f, -9.474f)
                close()
            }
        }
        .build()
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
