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

public val Icons.Filled.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = Builder(name = "GiftCard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(1.253f)
                curveToRelative(-1.417f, -1.4f, -1.625f, -3.203f, -0.547f, -4.64f)
                curveTo(6.251f, 0.633f, 7.046f, 0.162f, 7.945f, 0.034f)
                curveToRelative(0.899f, -0.131f, 1.794f, 0.101f, 2.521f, 0.646f)
                curveToRelative(0.678f, 0.508f, 1.178f, 1.154f, 1.547f, 1.812f)
                curveToRelative(0.369f, -0.658f, 0.869f, -1.305f, 1.547f, -1.812f)
                curveToRelative(0.726f, -0.545f, 1.619f, -0.777f, 2.521f, -0.646f)
                curveToRelative(0.899f, 0.128f, 1.694f, 0.599f, 2.239f, 1.326f)
                curveToRelative(1.084f, 1.445f, 0.867f, 3.26f, -0.545f, 4.64f)
                horizontalLineToRelative(1.226f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(13.006f, 6.0f)
                curveToRelative(0.137f, 0.0f, 1.801f, -0.035f, 3.371f, -1.428f)
                curveToRelative(0.387f, -0.369f, 0.984f, -1.158f, 0.343f, -2.013f)
                curveToRelative(-0.224f, -0.299f, -0.552f, -0.493f, -0.922f, -0.546f)
                curveToRelative(-0.368f, -0.049f, -0.739f, 0.042f, -1.038f, 0.267f)
                curveToRelative(-1.278f, 0.958f, -1.65f, 2.818f, -1.739f, 3.416f)
                lineToRelative(0.002f, 0.021f)
                lineToRelative(-0.017f, 0.283f)
                close()
                moveTo(11.008f, 6.0f)
                horizontalLineToRelative(0.012f)
                reflectiveCurveToRelative(-0.016f, -0.294f, -0.015f, -0.304f)
                curveToRelative(-0.088f, -0.595f, -0.461f, -2.457f, -1.74f, -3.416f)
                curveToRelative(-0.245f, -0.184f, -0.537f, -0.28f, -0.837f, -0.28f)
                curveToRelative(-0.47f, 0.0f, -0.898f, 0.261f, -1.123f, 0.56f)
                curveToRelative(-0.641f, 0.855f, -0.043f, 1.643f, 0.37f, 2.037f)
                curveToRelative(1.535f, 1.361f, 3.191f, 1.402f, 3.332f, 1.403f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-0.163f, 0.0f, -4.0f, -0.034f, -4.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.936f, -3.818f, 2.999f, -4.001f, 3.0f)
                curveToRelative(-0.552f, 0.0f, -0.999f, 0.448f, -0.999f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(1.417f, 0.0f, 3.697f, -0.488f, 5.0f, -2.056f)
                curveToRelative(1.303f, 1.569f, 3.583f, 2.056f, 5.0f, 2.056f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
