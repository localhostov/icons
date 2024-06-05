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

public val Icons.Filled.Sandwich: ImageVector
    get() {
        if (_sandwich != null) {
            return _sandwich!!
        }
        _sandwich = Builder(name = "Sandwich", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.5f, 24.0f)
                lineTo(2.5f, 24.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                horizontalLineToRelative(19.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.0f, 21.5f)
                close()
                moveTo(22.8f, 5.375f)
                lineTo(19.686f, 1.75f)
                arcToRelative(4.974f, 4.974f, 0.0f, false, false, -5.8f, -1.327f)
                lineTo(2.394f, 5.447f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.887f)
                curveToRelative(0.0f, 0.037f, 0.0f, 0.324f, 0.006f, 0.373f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                curveTo(24.482f, 11.942f, 24.728f, 7.461f, 22.8f, 5.375f)
                close()
                moveTo(23.588f, 15.21f)
                lineTo(22.788f, 14.584f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.557f, 0.0f)
                arcToRelative(2.031f, 2.031f, 0.0f, false, true, -2.443f, 0.0f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, false, -3.558f, 0.0f)
                curveToRelative(-0.243f, 0.189f, -0.815f, 0.611f, -0.816f, 0.612f)
                arcTo(1.741f, 1.741f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 1.584f, 0.789f)
                curveToRelative(0.4f, -0.242f, 1.3f, -1.207f, 1.972f, -0.623f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, false, 4.889f, 0.0f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, true, 1.111f, 0.0f)
                arcToRelative(4.061f, 4.061f, 0.0f, false, false, 4.889f, 0.0f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, true, 1.111f, 0.0f)
                arcToRelative(4.012f, 4.012f, 0.0f, false, false, 4.889f, 0.0f)
                curveToRelative(0.665f, -0.586f, 1.591f, 0.391f, 1.971f, 0.624f)
                arcTo(0.982f, 0.982f, 0.0f, false, false, 23.584f, 15.21f)
                close()
            }
        }
        .build()
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
