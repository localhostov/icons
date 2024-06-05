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

public val Icons.Outline.Soup: ImageVector
    get() {
        if (_soup != null) {
            return _soup!!
        }
        _soup = Builder(name = "Soup", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.861f, 24.0f)
                horizontalLineTo(10.139f)
                arcToRelative(8.922f, 8.922f, 0.0f, false, true, -6.268f, -2.534f)
                arcTo(14.759f, 14.759f, 0.0f, false, true, 0.164f, 15.15f)
                arcTo(4.011f, 4.011f, 0.0f, false, true, 4.0f, 10.0f)
                horizontalLineTo(20.0f)
                arcToRelative(4.012f, 4.012f, 0.0f, false, true, 3.838f, 5.15f)
                arcToRelative(14.741f, 14.741f, 0.0f, false, true, -3.708f, 6.316f)
                arcTo(8.918f, 8.918f, 0.0f, false, true, 13.861f, 24.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.981f, 1.981f, 0.0f, false, false, -1.6f, 0.8f)
                arcToRelative(2.019f, 2.019f, 0.0f, false, false, -0.322f, 1.791f)
                arcToRelative(12.933f, 12.933f, 0.0f, false, false, 3.2f, 5.46f)
                arcTo(6.907f, 6.907f, 0.0f, false, false, 10.139f, 22.0f)
                horizontalLineToRelative(3.722f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 4.856f, -1.951f)
                arcToRelative(12.919f, 12.919f, 0.0f, false, false, 3.2f, -5.46f)
                arcToRelative(2.019f, 2.019f, 0.0f, false, false, -0.322f, -1.791f)
                arcTo(1.978f, 1.978f, 0.0f, false, false, 20.0f, 12.0f)
                close()
                moveTo(16.0f, 6.0f)
                arcToRelative(4.381f, 4.381f, 0.0f, false, false, -1.293f, -3.121f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 14.0f, 1.168f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 12.0f, 1.0f)
                verticalLineToRelative(0.168f)
                arcToRelative(4.385f, 4.385f, 0.0f, false, false, 1.293f, 3.122f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 14.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 7.0f)
                verticalLineTo(6.692f)
                arcToRelative(4.387f, 4.387f, 0.0f, false, false, -1.292f, -3.121f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 10.0f, 1.864f)
                verticalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 1.0f)
                verticalLineToRelative(0.864f)
                arcTo(4.386f, 4.386f, 0.0f, false, false, 9.293f, 4.985f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 10.0f, 6.692f)
                verticalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _soup!!
    }

private var _soup: ImageVector? = null
