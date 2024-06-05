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

public val Icons.Bold.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 3.0f)
                lineTo(2.0f, 19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 6.5f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(8.0f, 3.0f)
                lineTo(8.0f, 15.0f)
                lineTo(6.5f, 15.0f)
                arcToRelative(4.445f, 4.445f, 0.0f, false, false, -1.5f, 0.276f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(6.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(19.0f, 18.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                lineTo(19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
