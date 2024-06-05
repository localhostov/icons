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
                lineTo(0.0f, 18.324f)
                verticalLineTo(24.0f)
                horizontalLineTo(5.676f)
                lineTo(22.824f, 6.852f)
                arcTo(4.018f, 4.018f, 0.0f, false, false, 22.824f, 1.176f)
                close()
                moveTo(4.434f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.566f)
                lineTo(15.653f, 6.914f)
                lineToRelative(1.434f, 1.433f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
