package me.localx.icons.straight.filled

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

public val Icons.Filled.Chocolate: ImageVector
    get() {
        if (_chocolate != null) {
            return _chocolate!!
        }
        _chocolate = Builder(name = "Chocolate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.121f, 7.243f)
                lineTo(16.758f, 0.879f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, false, -4.243f, 0.0f)
                lineTo(0.879f, 12.515f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.242f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                lineTo(23.121f, 11.485f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.242f)
                close()
                moveTo(18.994f, 12.784f)
                lineTo(15.78f, 9.57f)
                lineToRelative(-2.4f, 2.4f)
                lineTo(16.6f, 15.182f)
                lineTo(15.182f, 16.6f)
                lineToRelative(-3.214f, -3.214f)
                lineToRelative(-2.341f, 2.34f)
                lineToRelative(3.215f, 3.215f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(8.213f, 17.136f)
                lineTo(6.15f, 19.2f)
                lineTo(4.736f, 17.786f)
                lineTo(6.8f, 15.722f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(3.149f, 3.15f)
                lineToRelative(2.341f, -2.34f)
                lineTo(7.4f, 8.818f)
                lineTo(8.818f, 7.4f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(-3.15f, -3.15f)
                lineTo(12.63f, 3.592f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(2.006f, -2.006f)
                lineTo(19.2f, 6.15f)
                lineTo(17.194f, 8.156f)
                lineToRelative(3.214f, 3.214f)
                close()
            }
        }
        .build()
        return _chocolate!!
    }

private var _chocolate: ImageVector? = null
