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

public val Icons.Outline.Hotdog: ImageVector
    get() {
        if (_hotdog != null) {
            return _hotdog!!
        }
        _hotdog = Builder(name = "Hotdog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.044f, 12.9f)
                curveToRelative(3.077f, -3.35f, -1.8f, -8.01f, -5.046f, -4.851f)
                curveToRelative(-2.533f, 2.553f, -9.457f, 2.541f, -11.982f, 0.015f)
                curveToRelative(-4.236f, -3.652f, -8.827f, 2.888f, -3.811f, 5.9f)
                arcTo(4.426f, 4.426f, 0.0f, false, false, 1.256f, 18.5f)
                curveTo(2.434f, 21.775f, 7.683f, 22.9f, 12.0f, 23.0f)
                curveToRelative(4.328f, -0.107f, 9.553f, -1.218f, 10.744f, -4.5f)
                arcToRelative(4.428f, 4.428f, 0.0f, false, false, -0.949f, -4.53f)
                arcTo(9.828f, 9.828f, 0.0f, false, false, 23.044f, 12.9f)
                close()
                moveTo(20.858f, 17.827f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, -1.278f, 1.424f)
                arcTo(16.307f, 16.307f, 0.0f, false, true, 12.0f, 21.0f)
                curveToRelative(-3.693f, -0.071f, -10.371f, -1.25f, -8.755f, -5.079f)
                arcTo(2.506f, 2.506f, 0.0f, false, true, 6.58f, 14.745f)
                arcTo(11.36f, 11.36f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(11.36f, 11.36f, 0.0f, false, false, 5.42f, -1.255f)
                arcTo(2.516f, 2.516f, 0.0f, false, true, 20.858f, 17.831f)
                close()
                moveTo(21.589f, 11.527f)
                arcToRelative(9.377f, 9.377f, 0.0f, false, true, -1.578f, 1.234f)
                curveTo(16.962f, 11.714f, 15.56f, 14.24f, 12.0f, 14.0f)
                curveToRelative(-3.557f, 0.241f, -4.966f, -2.286f, -8.012f, -1.234f)
                arcTo(9.347f, 9.347f, 0.0f, false, true, 2.41f, 11.531f)
                arcTo(1.492f, 1.492f, 0.0f, false, true, 2.0f, 10.458f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, true, 2.594f, -0.984f)
                curveToRelative(3.43f, 3.416f, 11.62f, 3.224f, 14.819f, -0.007f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.589f, 11.532f)
                close()
                moveTo(11.0f, 5.0f)
                lineTo(11.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 5.0f)
                close()
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(17.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 4.0f)
                close()
                moveTo(7.0f, 3.989f)
                lineTo(7.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 2.0f)
                lineTo(9.0f, 3.989f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.989f)
                close()
            }
        }
        .build()
        return _hotdog!!
    }

private var _hotdog: ImageVector? = null
