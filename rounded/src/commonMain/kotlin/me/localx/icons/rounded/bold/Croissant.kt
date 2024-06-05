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

public val Icons.Bold.Croissant: ImageVector
    get() {
        if (_croissant != null) {
            return _croissant!!
        }
        _croissant = Builder(name = "Croissant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.258f, 4.947f)
                arcToRelative(11.019f, 11.019f, 0.0f, false, false, -9.317f, -3.911f)
                arcTo(3.263f, 3.263f, 0.0f, false, false, 13.3f, 0.5f)
                arcTo(3.344f, 3.344f, 0.0f, false, false, 10.534f, 0.155f)
                arcTo(15.717f, 15.717f, 0.0f, false, false, 1.153f, 8.109f)
                arcTo(15.939f, 15.939f, 0.0f, false, false, 0.147f, 10.6f)
                arcTo(3.318f, 3.318f, 0.0f, false, false, 0.5f, 13.337f)
                arcToRelative(3.227f, 3.227f, 0.0f, false, false, 0.551f, 0.651f)
                arcToRelative(11.009f, 11.009f, 0.0f, false, false, 3.907f, 9.269f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 2.7f, 0.677f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, false, 2.3f, -1.742f)
                lineToRelative(3.21f, -6.275f)
                arcToRelative(4.444f, 4.444f, 0.0f, false, false, 2.762f, -2.76f)
                lineToRelative(6.257f, -3.209f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, false, 1.741f, -2.3f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 23.258f, 4.947f)
                close()
                moveTo(3.015f, 11.484f)
                arcToRelative(12.828f, 12.828f, 0.0f, false, true, 8.42f, -8.467f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, true, 0.282f, 0.031f)
                arcToRelative(0.274f, 0.274f, 0.0f, false, true, 0.132f, 0.2f)
                lineToRelative(1.316f, 8.2f)
                arcToRelative(1.509f, 1.509f, 0.0f, false, true, -1.713f, 1.72f)
                lineToRelative(-8.2f, -1.282f)
                arcToRelative(0.283f, 0.283f, 0.0f, false, true, -0.2f, -0.136f)
                arcTo(0.308f, 0.308f, 0.0f, false, true, 3.015f, 11.484f)
                close()
                moveTo(7.293f, 20.825f)
                arcToRelative(0.325f, 0.325f, 0.0f, false, true, -0.224f, 0.169f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.182f, -0.038f)
                arcToRelative(7.936f, 7.936f, 0.0f, false, true, -2.846f, -5.913f)
                lineToRelative(5.75f, 0.9f)
                close()
                moveTo(20.824f, 7.279f)
                lineTo(15.936f, 9.785f)
                lineToRelative(-0.925f, -5.768f)
                arcTo(7.934f, 7.934f, 0.0f, false, true, 20.956f, 6.87f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.038f, 0.183f)
                arcTo(0.327f, 0.327f, 0.0f, false, true, 20.824f, 7.279f)
                close()
            }
        }
        .build()
        return _croissant!!
    }

private var _croissant: ImageVector? = null
