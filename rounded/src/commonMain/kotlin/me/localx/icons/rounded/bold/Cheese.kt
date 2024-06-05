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

public val Icons.Bold.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 15.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 12.0f)
                close()
                moveTo(24.0f, 11.007f)
                lineTo(24.0f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                lineTo(6.025f, 24.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.21f, -3.732f)
                arcTo(14.366f, 14.366f, 0.0f, false, true, 0.8f, 10.78f)
                arcTo(19.446f, 19.446f, 0.0f, false, true, 7.744f, 1.06f)
                arcTo(5.458f, 5.458f, 0.0f, false, true, 14.029f, 0.933f)
                lineToRelative(7.289f, 4.816f)
                arcTo(6.561f, 6.561f, 0.0f, false, true, 24.0f, 11.007f)
                close()
                moveTo(6.051f, 7.0f)
                lineTo(17.772f, 7.0f)
                lineToRelative(-5.4f, -3.567f)
                arcToRelative(2.455f, 2.455f, 0.0f, false, false, -2.83f, 0.03f)
                arcTo(16.683f, 16.683f, 0.0f, false, false, 6.051f, 7.0f)
                close()
                moveTo(21.0f, 11.007f)
                arcTo(3.512f, 3.512f, 0.0f, false, false, 20.851f, 10.0f)
                lineTo(6.026f, 10.0f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, -2.371f, 1.7f)
                arcToRelative(11.37f, 11.37f, 0.0f, false, false, 0.0f, 7.6f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.025f, 21.0f)
                lineTo(9.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineToRelative(3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
