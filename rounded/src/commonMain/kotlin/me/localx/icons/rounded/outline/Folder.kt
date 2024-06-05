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

public val Icons.Outline.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(12.472f)
                arcToRelative(1.019f, 1.019f, 0.0f, false, true, -0.447f, -0.1f)
                lineTo(8.869f, 1.316f)
                arcTo(3.014f, 3.014f, 0.0f, false, false, 7.528f, 1.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 3.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(7.528f)
                arcToRelative(1.019f, 1.019f, 0.0f, false, true, 0.447f, 0.1f)
                lineToRelative(3.156f, 1.579f)
                arcTo(3.014f, 3.014f, 0.0f, false, false, 12.472f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.779f, 1.882f)
                lineTo(2.0f, 6.994f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(8.994f)
                lineToRelative(20.0f, -0.113f)
                verticalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
