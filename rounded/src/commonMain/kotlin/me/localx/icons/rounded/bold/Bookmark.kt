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

public val Icons.Bold.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 0.0f)
                horizontalLineTo(6.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 1.0f, 5.5f)
                verticalLineTo(20.472f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 6.044f, 2.4f)
                lineToRelative(4.912f, -5.2f)
                lineToRelative(5.013f, 5.25f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 23.0f, 20.51f)
                verticalLineTo(5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 17.5f, 0.0f)
                close()
                moveTo(20.0f, 20.51f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.861f, 0.345f)
                lineToRelative(-6.1f, -6.391f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.95f, 14.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.086f, 0.47f)
                lineToRelative(-6.0f, 6.345f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, true, -0.549f, 0.122f)
                arcTo(0.471f, 0.471f, 0.0f, false, true, 4.0f, 20.472f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 3.0f)
                horizontalLineToRelative(11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 20.0f, 5.5f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
