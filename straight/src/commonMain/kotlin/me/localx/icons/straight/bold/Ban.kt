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

public val Icons.Bold.Ban: ImageVector
    get() {
        if (_ban != null) {
            return _ban!!
        }
        _ban = Builder(name = "Ban", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(8.947f, 8.947f, 0.0f, false, true, 5.207f, 1.672f)
                lineTo(4.672f, 17.206f)
                arcTo(8.986f, 8.986f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(8.942f, 8.942f, 0.0f, false, true, -5.206f, -1.672f)
                lineTo(19.328f, 6.793f)
                arcTo(8.986f, 8.986f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _ban!!
    }

private var _ban: ImageVector? = null
