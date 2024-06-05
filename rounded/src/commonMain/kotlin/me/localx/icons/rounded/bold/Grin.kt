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

public val Icons.Bold.Grin: ImageVector
    get() {
        if (_grin != null) {
            return _grin!!
        }
        _grin = Builder(name = "Grin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, -9.0f)
                curveTo(3.452f, 0.077f, 20.549f, 0.08f, 21.0f, 12.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(6.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 9.0f)
                close()
                moveTo(17.848f, 14.542f)
                arcTo(6.824f, 6.824f, 0.0f, false, true, 12.007f, 18.0f)
                arcToRelative(6.84f, 6.84f, 0.0f, false, true, -5.849f, -3.458f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.053f, -1.518f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 14.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 4.793f, -0.976f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.848f, 14.542f)
                close()
            }
        }
        .build()
        return _grin!!
    }

private var _grin: ImageVector? = null
