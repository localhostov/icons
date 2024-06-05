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

public val Icons.Bold.RedoAlt: ImageVector
    get() {
        if (_redoAlt != null) {
            return _redoAlt!!
        }
        _redoAlt = Builder(name = "RedoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3f, 15.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 0.0f)
                lineToRelative(4.726f, -4.725f)
                arcToRelative(2.934f, 2.934f, 0.0f, false, false, 0.0f, -4.145f)
                lineTo(18.416f, 1.412f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.3f, 3.533f)
                lineTo(19.532f, 6.7f)
                lineTo(5.319f, 6.7f)
                arcTo(5.326f, 5.326f, 0.0f, false, false, 0.0f, 12.019f)
                verticalLineTo(18.7f)
                arcToRelative(5.324f, 5.324f, 0.0f, false, false, 5.318f, 5.318f)
                horizontalLineTo(18.682f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(5.318f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 3.0f, 18.7f)
                verticalLineTo(12.019f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 5.319f, 9.7f)
                lineToRelative(14.159f, 0.0f)
                lineTo(16.3f, 12.886f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.3f, 15.007f)
                close()
            }
        }
        .build()
        return _redoAlt!!
    }

private var _redoAlt: ImageVector? = null
