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

public val Icons.Outline.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, -4.815f, -3.652f)
                arcToRelative(5.074f, 5.074f, 0.0f, false, true, -4.819f, -8.4f)
                curveToRelative(-3.4f, -3.511f, 0.009f, -9.6f, 4.834f, -8.349f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, true, 9.6f, 0.0f)
                curveTo(21.7f, 2.383f, 25.0f, 8.412f, 21.629f, 11.991f)
                curveToRelative(3.408f, 3.538f, 0.011f, 9.442f, -4.814f, 8.357f)
                arcTo(5.007f, 5.007f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(8.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.506f, -0.863f)
                curveToRelative(3.466f, 1.675f, 6.4f, -3.182f, 3.016f, -5.259f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, true, 0.0f, -1.756f)
                curveToRelative(3.313f, -2.009f, 0.522f, -7.219f, -3.019f, -5.254f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.5f, 0.868f)
                curveTo(4.0f, 3.908f, 1.138f, 9.08f, 4.478f, 11.07f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.0f, 1.757f)
                curveTo(1.13f, 14.94f, 3.964f, 19.8f, 7.494f, 18.137f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 18.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
