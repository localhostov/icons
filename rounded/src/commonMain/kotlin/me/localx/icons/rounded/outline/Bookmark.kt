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

public val Icons.Outline.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.137f, 24.0f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -1.987f, -0.835f)
                lineTo(12.0f, 17.051f)
                lineTo(5.85f, 23.169f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -3.095f, 0.609f)
                arcTo(2.8f, 2.8f, 0.0f, false, true, 1.0f, 21.154f)
                verticalLineTo(5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineTo(18.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineTo(21.154f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -1.751f, 2.624f)
                arcTo(2.867f, 2.867f, 0.0f, false, true, 20.137f, 24.0f)
                close()
                moveTo(6.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(21.154f)
                arcToRelative(0.843f, 0.843f, 0.0f, false, false, 1.437f, 0.6f)
                horizontalLineToRelative(0.0f)
                lineTo(11.3f, 14.933f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                lineToRelative(6.855f, 6.819f)
                arcToRelative(0.843f, 0.843f, 0.0f, false, false, 1.437f, -0.6f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
