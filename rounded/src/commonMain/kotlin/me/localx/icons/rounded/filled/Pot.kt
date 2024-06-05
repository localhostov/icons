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

public val Icons.Filled.Pot: ImageVector
    get() {
        if (_pot != null) {
            return _pot!!
        }
        _pot = Builder(name = "Pot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                lineTo(22.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(2.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 9.0f)
                close()
                moveTo(23.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(9.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 4.0f)
                lineTo(1.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 6.0f)
                lineTo(23.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pot!!
    }

private var _pot: ImageVector? = null
