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

public val Icons.Outline.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 21.73f)
                arcToRelative(3.889f, 3.889f, 0.0f, false, true, -5.24f, 1.877f)
                lineTo(0.566f, 14.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.867f, -1.8f)
                lineToRelative(18.094f, 8.7f)
                arcToRelative(1.894f, 1.894f, 0.0f, false, false, 2.571f, -0.939f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.8f, 0.865f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineToRelative(7.566f)
                lineTo(8.714f, 11.062f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 16.0f)
                horizontalLineToRelative(4.379f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.978f, 0.792f)
                lineToRelative(0.3f, 1.417f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.955f, -0.417f)
                lineToRelative(-0.3f, -1.418f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 15.382f, 14.0f)
                horizontalLineTo(11.0f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, true, -0.907f, -0.579f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, true, 0.177f, -1.108f)
                lineToRelative(4.388f, -5.764f)
                lineToRelative(1.131f, 0.722f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, true, -0.118f, 1.468f)
                lineToRelative(-1.285f, 1.647f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.579f, 1.229f)
                lineToRelative(1.276f, -1.637f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -0.127f, -4.211f)
                arcToRelative(1.083f, 1.083f, 0.0f, false, false, -0.151f, -0.119f)
                lineToRelative(-1.348f, -0.861f)
                arcTo(4.988f, 4.988f, 0.0f, false, false, 12.927f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                close()
                moveTo(18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 5.0f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
