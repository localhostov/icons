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

public val Icons.Bold.ArrowsH: ImageVector
    get() {
        if (_arrowsH != null) {
            return _arrowsH!!
        }
        _arrowsH = Builder(name = "ArrowsH", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 10.232f)
                lineToRelative(-3.75f, -3.75f)
                lineTo(17.4f, 8.6f)
                lineToRelative(1.9f, 1.9f)
                horizontalLineTo(4.707f)
                lineTo(6.6f, 8.6f)
                lineTo(4.482f, 6.482f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.536f)
                lineToRelative(3.75f, 3.75f)
                lineTo(6.6f, 15.4f)
                lineToRelative(-1.9f, -1.9f)
                horizontalLineTo(19.293f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.75f, -3.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 23.268f, 10.232f)
                close()
            }
        }
        .build()
        return _arrowsH!!
    }

private var _arrowsH: ImageVector? = null
