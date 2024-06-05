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

public val Icons.Filled.HeartPartnerHandshake: ImageVector
    get() {
        if (_heartPartnerHandshake != null) {
            return _heartPartnerHandshake!!
        }
        _heartPartnerHandshake = Builder(name = "HeartPartnerHandshake", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.729f, 17.831f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.586f, 0.586f, -1.536f, 0.586f, -2.121f, 0.0f)
                lineToRelative(-4.634f, -4.634f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.024f, 0.0f, 1.414f)
                lineToRelative(4.211f, 4.211f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.586f, 0.586f, -1.536f, 0.586f, -2.121f, 0.0f)
                lineToRelative(-4.673f, -4.673f)
                curveTo(3.021f, 15.507f, 0.0f, 11.662f, 0.0f, 8.0f)
                curveTo(0.0f, 4.14f, 2.916f, 1.0f, 6.5f, 1.0f)
                curveToRelative(1.773f, 0.0f, 3.131f, 0.662f, 4.165f, 1.397f)
                lineToRelative(-3.639f, 3.608f)
                curveToRelative(-0.662f, 0.661f, -1.026f, 1.541f, -1.026f, 2.476f)
                reflectiveCurveToRelative(0.364f, 1.814f, 1.024f, 2.474f)
                curveToRelative(0.661f, 0.662f, 1.54f, 1.026f, 2.476f, 1.026f)
                curveToRelative(0.426f, 0.0f, 0.837f, -0.085f, 1.225f, -0.229f)
                lineToRelative(6.005f, 6.08f)
                close()
                moveTo(14.421f, 8.525f)
                lineToRelative(-2.092f, 2.078f)
                lineToRelative(6.11f, 6.018f)
                curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.121f, 0.0f)
                curveToRelative(0.896f, -0.896f, 0.129f, -1.888f, 0.129f, -1.888f)
                lineToRelative(-6.269f, -6.208f)
                close()
                moveTo(17.457f, 1.058f)
                curveToRelative(-1.634f, 0.01f, -3.186f, 0.72f, -4.382f, 1.834f)
                lineToRelative(-4.637f, 4.606f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.586f, 0.586f, 1.536f, 0.586f, 2.121f, 0.0f)
                lineToRelative(2.497f, -2.48f)
                curveToRelative(0.78f, -0.775f, 2.038f, -0.775f, 2.819f, 0.0f)
                lineToRelative(6.324f, 6.278f)
                curveToRelative(1.191f, -1.922f, 1.799f, -3.722f, 1.799f, -5.359f)
                curveToRelative(0.0f, -3.86f, -2.958f, -7.0f, -6.542f, -7.0f)
                close()
            }
        }
        .build()
        return _heartPartnerHandshake!!
    }

private var _heartPartnerHandshake: ImageVector? = null
