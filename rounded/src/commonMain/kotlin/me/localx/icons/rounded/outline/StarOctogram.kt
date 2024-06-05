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

public val Icons.Outline.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.77f, 8.948f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, -0.7f, -1.7f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, -4.315f, -4.316f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, -1.7f, -0.7f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, -6.1f, 0.0f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, -1.7f, 0.7f)
                arcTo(3.239f, 3.239f, 0.0f, false, false, 2.934f, 7.249f)
                arcToRelative(1.237f, 1.237f, 0.0f, false, true, -0.7f, 1.7f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, 0.0f, 6.1f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, 0.705f, 1.7f)
                arcTo(3.238f, 3.238f, 0.0f, false, false, 7.25f, 21.066f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, 1.7f, 0.7f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, 6.1f, 0.0f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, 1.7f, -0.7f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, 4.316f, -4.315f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, 0.7f, -1.7f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, 0.0f, -6.1f)
                close()
                moveTo(21.1f, 13.167f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, -1.84f, 4.442f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, -1.652f, 1.651f)
                arcToRelative(3.238f, 3.238f, 0.0f, false, false, -4.441f, 1.84f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, -2.334f, 0.0f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -4.442f, -1.84f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, -1.65f, -1.652f)
                arcTo(3.238f, 3.238f, 0.0f, false, false, 2.9f, 13.167f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, true, 0.0f, -2.334f)
                arcTo(3.237f, 3.237f, 0.0f, false, false, 4.74f, 6.391f)
                arcTo(1.239f, 1.239f, 0.0f, false, true, 6.391f, 4.74f)
                arcTo(3.239f, 3.239f, 0.0f, false, false, 10.833f, 2.9f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, 2.334f, 0.0f)
                arcToRelative(3.239f, 3.239f, 0.0f, false, false, 4.442f, 1.84f)
                arcTo(1.239f, 1.239f, 0.0f, false, true, 19.26f, 6.392f)
                arcToRelative(3.238f, 3.238f, 0.0f, false, false, 1.84f, 4.441f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, true, 0.0f, 2.334f)
                close()
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
