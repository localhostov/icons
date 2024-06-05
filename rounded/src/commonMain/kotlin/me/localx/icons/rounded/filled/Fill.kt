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

public val Icons.Filled.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.45f, 13.864f)
                lineToRelative(-8.672f, 8.672f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -7.071f, 0.0f)
                lineToRelative(-4.242f, -4.243f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -7.071f)
                lineToRelative(5.9f, -5.9f)
                lineToRelative(-2.854f, -2.893f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.422f, -1.4f)
                lineToRelative(8.97f, 9.081f)
                lineToRelative(0.009f, 0.013f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 1.376f, -1.436f)
                lineToRelative(-7.21f, -7.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.629f, -1.094f)
                lineToRelative(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                close()
                moveTo(20.692f, 18.431f)
                curveToRelative(-0.731f, 1.061f, -1.692f, 2.294f, -1.692f, 3.069f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -0.849f, -0.945f, -2.044f, -1.673f, -3.078f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.635f, 0.009f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
