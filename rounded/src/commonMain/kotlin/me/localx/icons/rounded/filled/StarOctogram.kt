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

public val Icons.Filled.StarOctogram: ImageVector
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
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
