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
                moveTo(16.5f, 0.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 2.0f, 6.5f)
                verticalLineToRelative(13.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 6.5f, 24.0f)
                horizontalLineToRelative(10.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 22.0f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 16.5f, 0.0f)
                close()
                moveTo(8.0f, 3.051f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.5f)
                arcToRelative(4.445f, 4.445f, 0.0f, false, false, -1.5f, 0.276f)
                verticalLineTo(6.5f)
                arcTo(3.494f, 3.494f, 0.0f, false, true, 8.0f, 3.051f)
                close()
                moveTo(19.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 21.0f)
                horizontalLineTo(6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 5.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
