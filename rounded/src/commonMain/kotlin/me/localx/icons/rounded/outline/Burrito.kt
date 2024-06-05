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

public val Icons.Outline.Burrito: ImageVector
    get() {
        if (_burrito != null) {
            return _burrito!!
        }
        _burrito = Builder(name = "Burrito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                arcToRelative(3.015f, 3.015f, 0.0f, false, false, -4.136f, -2.776f)
                arcTo(4.031f, 4.031f, 0.0f, false, false, 12.0f, 0.545f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, -4.868f, 0.678f)
                curveTo(3.875f, -0.024f, 1.618f, 4.078f, 4.0f, 6.467f)
                lineTo(4.0f, 18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(20.0f, 6.467f)
                arcTo(3.682f, 3.682f, 0.0f, false, false, 21.0f, 4.0f)
                close()
                moveTo(6.4f, 3.086f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.168f, -0.47f)
                arcToRelative(2.009f, 2.009f, 0.0f, false, true, 2.759f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.338f, 0.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 2.759f, 0.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.167f, 0.471f)
                curveToRelative(1.282f, -0.428f, 1.807f, 1.1f, 1.019f, 1.936f)
                arcToRelative(9.564f, 9.564f, 0.0f, false, false, -6.226f, 3.013f)
                curveToRelative(-0.448f, -0.33f, -0.9f, -0.627f, -1.354f, -0.909f)
                curveToRelative(0.639f, -0.948f, 2.51f, -1.342f, 1.8f, -2.671f)
                curveToRelative(-1.17f, -1.365f, -2.656f, 0.8f, -3.6f, 1.684f)
                arcTo(10.868f, 10.868f, 0.0f, false, false, 5.389f, 5.025f)
                curveTo(4.6f, 4.2f, 5.117f, 2.664f, 6.4f, 3.086f)
                close()
                moveTo(14.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(6.0f, 7.1f)
                curveToRelative(4.125f, 0.8f, 10.688f, 6.1f, 11.825f, 12.069f)
                arcTo(4.009f, 4.009f, 0.0f, false, true, 14.0f, 22.0f)
                close()
                moveTo(18.0f, 14.166f)
                arcTo(20.427f, 20.427f, 0.0f, false, false, 13.951f, 9.3f)
                arcTo(7.84f, 7.84f, 0.0f, false, true, 18.0f, 7.089f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(10.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                close()
                moveTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 18.0f)
                close()
            }
        }
        .build()
        return _burrito!!
    }

private var _burrito: ImageVector? = null
