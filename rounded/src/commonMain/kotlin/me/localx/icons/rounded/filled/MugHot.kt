package me.localx.icons.rounded.filled

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

public val Icons.Filled.MugHot: ImageVector
    get() {
        if (_mugHot != null) {
            return _mugHot!!
        }
        _mugHot = Builder(name = "MugHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 10.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(4.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.0f, 9.0f)
                lineTo(1.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, 4.9f, -4.0f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 23.0f, 16.5f)
                verticalLineToRelative(-3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.5f, 10.0f)
                close()
                moveTo(21.0f, 16.5f)
                arcTo(1.621f, 1.621f, 0.0f, false, true, 19.0f, 18.0f)
                lineTo(19.0f, 12.0f)
                arcToRelative(1.621f, 1.621f, 0.0f, false, true, 2.0f, 1.5f)
                close()
                moveTo(9.0f, 3.0f)
                lineTo(9.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 3.0f)
                close()
                moveTo(13.0f, 3.0f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(15.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 3.0f)
                close()
                moveTo(5.0f, 3.0f)
                lineTo(5.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 1.0f)
                lineTo(7.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _mugHot!!
    }

private var _mugHot: ImageVector? = null
