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

public val Icons.Filled.Pumpkin: ImageVector
    get() {
        if (_pumpkin != null) {
            return _pumpkin!!
        }
        _pumpkin = Builder(name = "Pumpkin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.541f, 23.972f)
                curveTo(-2.13f, 23.037f, -2.141f, 7.0f, 6.51f, 6.03f)
                curveTo(2.027f, 10.6f, 1.8f, 19.844f, 6.541f, 23.972f)
                close()
                moveTo(9.151f, 6.342f)
                arcTo(11.608f, 11.608f, 0.0f, false, false, 5.0f, 15.0f)
                curveToRelative(0.0f, 4.569f, 2.88f, 8.8f, 4.308f, 8.982f)
                arcTo(26.324f, 26.324f, 0.0f, false, true, 8.0f, 15.0f)
                curveTo(8.0f, 11.021f, 8.383f, 8.154f, 9.151f, 6.342f)
                close()
                moveTo(17.49f, 6.03f)
                curveToRelative(4.483f, 4.574f, 4.708f, 13.814f, -0.031f, 17.942f)
                curveTo(26.13f, 23.037f, 26.141f, 7.0f, 17.49f, 6.03f)
                close()
                moveTo(14.849f, 6.342f)
                curveTo(15.617f, 8.154f, 16.0f, 11.021f, 16.0f, 15.0f)
                arcToRelative(26.324f, 26.324f, 0.0f, false, true, -1.308f, 8.982f)
                curveTo(16.12f, 23.8f, 19.0f, 19.569f, 19.0f, 15.0f)
                arcTo(11.608f, 11.608f, 0.0f, false, false, 14.849f, 6.342f)
                close()
                moveTo(16.0f, 0.0f)
                arcToRelative(4.771f, 4.771f, 0.0f, false, false, -3.99f, 2.563f)
                curveToRelative(-0.582f, -1.046f, -2.8f, -3.664f, -3.9f, -2.01f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.553f, 1.9f)
                curveTo(10.2f, 2.718f, 11.0f, 4.41f, 11.0f, 7.022f)
                curveTo(9.591f, 9.214f, 9.531f, 24.211f, 12.0f, 24.0f)
                curveToRelative(2.478f, 0.2f, 2.4f, -14.816f, 1.0f, -17.0f)
                curveToRelative(-0.03f, -5.352f, 3.922f, -5.886f, 4.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                curveTo(20.467f, 4.678f, 18.926f, -0.176f, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pumpkin!!
    }

private var _pumpkin: ImageVector? = null
