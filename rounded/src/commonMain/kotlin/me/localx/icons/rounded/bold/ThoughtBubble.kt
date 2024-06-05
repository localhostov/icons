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

public val Icons.Bold.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = Builder(name = "ThoughtBubble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(5.0f, 17.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(23.959f, 11.239f)
                curveToRelative(-0.28f, 2.511f, -2.11f, 4.708f, -4.557f, 5.467f)
                curveToRelative(-1.251f, 0.391f, -2.513f, 0.394f, -3.746f, 0.014f)
                curveToRelative(-0.133f, -0.043f, -0.282f, -0.022f, -0.377f, 0.047f)
                curveToRelative(-1.108f, 0.807f, -2.416f, 1.233f, -3.779f, 1.233f)
                curveToRelative(-2.239f, 0.0f, -4.293f, -1.131f, -5.493f, -3.026f)
                curveToRelative(-0.334f, -0.039f, -0.632f, -0.068f, -0.804f, -0.103f)
                curveTo(1.762f, 14.172f, -0.483f, 10.895f, 0.09f, 7.408f)
                curveTo(0.505f, 4.879f, 2.453f, 2.779f, 4.939f, 2.186f)
                curveToRelative(0.938f, -0.224f, 1.879f, -0.244f, 2.794f, -0.067f)
                curveToRelative(0.137f, 0.024f, 0.294f, -0.033f, 0.408f, -0.144f)
                curveToRelative(1.312f, -1.273f, 3.036f, -1.975f, 4.858f, -1.975f)
                curveToRelative(2.742f, 0.0f, 5.244f, 1.617f, 6.374f, 4.12f)
                curveToRelative(0.075f, 0.167f, 0.245f, 0.249f, 0.341f, 0.284f)
                curveToRelative(2.833f, 1.025f, 4.578f, 3.836f, 4.244f, 6.835f)
                close()
                moveTo(18.693f, 7.224f)
                curveToRelative(-0.932f, -0.337f, -1.66f, -1.001f, -2.054f, -1.869f)
                curveToRelative(-0.646f, -1.432f, -2.074f, -2.355f, -3.64f, -2.355f)
                curveToRelative(-1.037f, 0.0f, -2.02f, 0.399f, -2.768f, 1.126f)
                curveToRelative(-0.822f, 0.8f, -1.97f, 1.15f, -3.069f, 0.938f)
                curveToRelative(-0.218f, -0.042f, -0.439f, -0.063f, -0.662f, -0.063f)
                curveToRelative(-0.286f, 0.0f, -0.575f, 0.035f, -0.865f, 0.104f)
                curveToRelative(-1.324f, 0.316f, -2.363f, 1.438f, -2.585f, 2.79f)
                curveToRelative(-0.311f, 1.889f, 0.896f, 3.661f, 2.748f, 4.037f)
                curveToRelative(0.065f, 0.01f, 0.189f, 0.016f, 0.319f, 0.021f)
                curveToRelative(0.987f, 0.047f, 1.893f, 0.577f, 2.424f, 1.42f)
                curveToRelative(0.646f, 1.019f, 1.752f, 1.629f, 2.958f, 1.629f)
                curveToRelative(0.725f, 0.0f, 1.421f, -0.228f, 2.014f, -0.659f)
                curveToRelative(0.858f, -0.625f, 1.989f, -0.808f, 3.025f, -0.488f)
                curveToRelative(0.646f, 0.199f, 1.31f, 0.195f, 1.974f, -0.012f)
                curveToRelative(1.325f, -0.411f, 2.314f, -1.59f, 2.464f, -2.934f)
                curveToRelative(0.181f, -1.616f, -0.758f, -3.131f, -2.283f, -3.683f)
                close()
            }
        }
        .build()
        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
