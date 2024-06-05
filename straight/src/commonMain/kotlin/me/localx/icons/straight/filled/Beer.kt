package me.localx.icons.straight.filled

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

public val Icons.Filled.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 8.0f)
                lineTo(11.0f, 8.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineTo(5.0f, 8.0f)
                lineTo(1.0f, 8.0f)
                lineTo(1.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(16.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(19.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(21.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.765f, 2.007f)
                arcToRelative(4.515f, 4.515f, 0.0f, false, true, 7.508f, 0.061f)
                arcTo(4.012f, 4.012f, 0.0f, false, true, 18.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
