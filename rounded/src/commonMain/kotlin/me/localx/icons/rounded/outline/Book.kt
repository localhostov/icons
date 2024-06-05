package me.localx.icons.rounded.outline

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

public val Icons.Outline.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 2.0f, 5.0f)
                lineTo(2.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 17.0f, 0.0f)
                close()
                moveTo(20.0f, 5.0f)
                lineTo(20.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 5.0f)
                close()
                moveTo(6.0f, 2.172f)
                lineTo(6.0f, 16.0f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -2.0f, 0.537f)
                lineTo(4.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 2.172f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                lineTo(20.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 22.0f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null
