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

public val Icons.Outline.Garlic: ImageVector
    get() {
        if (_garlic != null) {
            return _garlic!!
        }
        _garlic = Builder(name = "Garlic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.466f)
                lineTo(16.0f, 3.5f)
                curveTo(15.959f, 1.006f, 13.82f, -0.265f, 11.5f, 0.0f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 8.0f, 3.5f)
                lineTo(8.0f, 5.466f)
                curveTo(6.251f, 6.681f, 0.333f, 11.278f, 0.006f, 17.934f)
                arcTo(4.726f, 4.726f, 0.0f, false, false, 4.428f, 23.0f)
                arcToRelative(4.972f, 4.972f, 0.0f, false, false, 3.33f, -1.417f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 8.508f, 0.029f)
                arcToRelative(4.544f, 4.544f, 0.0f, false, false, 7.728f, -3.678f)
                curveTo(23.667f, 11.278f, 17.749f, 6.681f, 16.0f, 5.466f)
                close()
                moveTo(10.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 3.5f)
                lineTo(14.0f, 5.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.851f, 1.74f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, false, -2.308f, 0.007f)
                arcTo(5.705f, 5.705f, 0.0f, false, false, 10.0f, 5.63f)
                close()
                moveTo(7.0f, 18.5f)
                arcTo(2.521f, 2.521f, 0.0f, false, true, 4.458f, 21.0f)
                arcToRelative(2.687f, 2.687f, 0.0f, false, true, -2.453f, -2.968f)
                curveToRelative(0.259f, -5.261f, 4.84f, -9.209f, 6.721f, -10.617f)
                arcToRelative(7.805f, 7.805f, 0.0f, false, true, 0.557f, 2.369f)
                arcTo(20.812f, 20.812f, 0.0f, false, false, 7.0f, 18.5f)
                close()
                moveTo(13.927f, 21.3f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, -2.491f, 0.646f)
                curveTo(6.565f, 20.732f, 10.079f, 12.087f, 12.0f, 8.995f)
                curveTo(13.8f, 11.884f, 16.609f, 18.877f, 13.924f, 21.3f)
                close()
                moveTo(21.201f, 20.24f)
                curveToRelative(-1.314f, 1.6f, -4.294f, 0.428f, -4.195f, -1.743f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, false, -2.288f, -8.72f)
                arcToRelative(6.951f, 6.951f, 0.0f, false, true, 0.557f, -2.366f)
                curveTo(17.153f, 8.821f, 21.736f, 12.77f, 22.0f, 18.031f)
                arcTo(3.062f, 3.062f, 0.0f, false, true, 21.2f, 20.243f)
                close()
            }
        }
        .build()
        return _garlic!!
    }

private var _garlic: ImageVector? = null
