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

public val Icons.Bold.ArrowsHCopy: ImageVector
    get() {
        if (_arrowsHCopy != null) {
            return _arrowsHCopy!!
        }
        _arrowsHCopy = Builder(name = "ArrowsHCopy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.768f, 23.268f)
                lineToRelative(3.75f, -3.75f)
                lineTo(15.4f, 17.4f)
                lineToRelative(-1.9f, 1.9f)
                verticalLineTo(4.707f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(2.122f, -2.122f)
                lineTo(13.768f, 0.732f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                lineToRelative(-3.75f, 3.75f)
                lineTo(8.6f, 6.6f)
                lineToRelative(1.9f, -1.9f)
                verticalLineTo(19.293f)
                lineTo(8.6f, 17.4f)
                lineTo(6.482f, 19.518f)
                lineToRelative(3.75f, 3.75f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.768f, 23.268f)
                close()
            }
        }
        .build()
        return _arrowsHCopy!!
    }

private var _arrowsHCopy: ImageVector? = null
