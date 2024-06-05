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

public val Icons.Bold.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.824f, 1.176f)
                arcToRelative(4.108f, 4.108f, 0.0f, false, false, -5.676f, 0.0f)
                lineTo(1.611f, 16.713f)
                arcTo(5.464f, 5.464f, 0.0f, false, false, 0.0f, 20.6f)
                verticalLineToRelative(1.9f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 24.0f)
                horizontalLineTo(3.4f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, false, 3.889f, -1.611f)
                lineTo(22.824f, 6.852f)
                arcTo(4.018f, 4.018f, 0.0f, false, false, 22.824f, 1.176f)
                close()
                moveTo(5.166f, 20.268f)
                arcTo(2.519f, 2.519f, 0.0f, false, true, 3.4f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.4f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, true, 0.732f, -1.768f)
                lineTo(15.3f, 7.267f)
                lineTo(16.733f, 8.7f)
                close()
                moveTo(20.7f, 4.731f)
                lineTo(18.854f, 6.58f)
                lineTo(17.42f, 5.146f)
                lineTo(19.27f, 3.3f)
                arcToRelative(1.037f, 1.037f, 0.0f, false, true, 1.433f, 0.0f)
                arcTo(1.015f, 1.015f, 0.0f, false, true, 20.7f, 4.731f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
