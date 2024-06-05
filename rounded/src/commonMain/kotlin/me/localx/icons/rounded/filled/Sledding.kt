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

public val Icons.Filled.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 21.729f)
                arcToRelative(3.889f, 3.889f, 0.0f, false, true, -5.24f, 1.877f)
                lineTo(0.566f, 14.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.868f, -1.8f)
                lineToRelative(18.093f, 8.7f)
                arcToRelative(1.894f, 1.894f, 0.0f, false, false, 2.572f, -0.939f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.8f, 0.865f)
                close()
                moveTo(16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 2.5f)
                close()
                moveTo(3.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineToRelative(7.927f)
                arcToRelative(4.991f, 4.991f, 0.0f, false, true, 2.691f, 0.786f)
                reflectiveCurveToRelative(1.454f, 0.936f, 1.5f, 0.98f)
                arcToRelative(3.105f, 3.105f, 0.0f, false, true, 0.127f, 4.211f)
                lineTo(13.615f, 14.0f)
                horizontalLineToRelative(1.767f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, true, 2.933f, 2.373f)
                lineToRelative(0.3f, 1.418f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.768f, 1.187f)
                arcToRelative(1.013f, 1.013f, 0.0f, false, true, -0.21f, 0.022f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.977f, -0.791f)
                lineToRelative(-0.3f, -1.418f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.382f, 16.0f)
                horizontalLineTo(11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.29f, -4.939f)
                lineTo(11.974f, 6.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.0f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
