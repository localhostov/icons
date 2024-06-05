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

public val Icons.Bold.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 12.5f)
                close()
                moveTo(8.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 16.0f)
                close()
                moveTo(14.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 11.0f)
                close()
                moveTo(13.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 16.0f)
                close()
                moveTo(7.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 21.0f)
                close()
                moveTo(12.5f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 21.0f)
                close()
                moveTo(19.077f, 19.884f)
                curveTo(26.03f, 16.9f, 25.44f, 6.489f, 17.809f, 4.922f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, true, -0.322f, -0.242f)
                arcTo(8.24f, 8.24f, 0.0f, false, false, 8.558f, 0.14f)
                arcTo(8.128f, 8.128f, 0.0f, false, false, 2.025f, 6.793f)
                arcToRelative(8.289f, 8.289f, 0.0f, false, false, 0.034f, 2.952f)
                arcTo(0.433f, 0.433f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(5.823f, 5.823f, 0.0f, false, false, 0.768f, 9.149f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.668f, -2.494f)
                arcToRelative(2.806f, 2.806f, 0.0f, false, true, -0.418f, -4.436f)
                arcTo(3.417f, 3.417f, 0.0f, false, false, 5.0f, 9.173f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, true, -0.02f, -1.888f)
                arcToRelative(5.183f, 5.183f, 0.0f, false, true, 9.792f, -1.32f)
                arcToRelative(3.418f, 3.418f, 0.0f, false, false, 2.447f, 1.9f)
                curveToRelative(4.732f, 0.95f, 4.94f, 7.45f, 0.7f, 9.252f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.154f, 2.768f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
