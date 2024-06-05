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

public val Icons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 6.0f)
                curveToRelative(-2.972f, 0.0f, -4.943f, 2.227f, -6.0f, 3.882f)
                curveToRelative(-1.057f, -1.655f, -3.028f, -3.882f, -6.0f, -3.882f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(2.972f, 0.0f, 4.943f, -2.227f, 6.0f, -3.882f)
                curveToRelative(1.057f, 1.655f, 3.028f, 3.882f, 6.0f, 3.882f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(6.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                curveToRelative(2.693f, 0.0f, 4.382f, 2.945f, 4.9f, 4.0f)
                curveToRelative(-0.514f, 1.06f, -2.192f, 4.0f, -4.9f, 4.0f)
                close()
                moveTo(18.0f, 16.0f)
                curveToRelative(-2.693f, 0.0f, -4.382f, -2.945f, -4.9f, -4.0f)
                curveToRelative(0.515f, -1.058f, 2.193f, -4.0f, 4.9f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
