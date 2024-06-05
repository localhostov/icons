package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Galaxy: ImageVector
    get() {
        if (_galaxy != null) {
            return _galaxy!!
        }
        _galaxy = Builder(name = "Galaxy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 12.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.001f, 18.715f)
                lineToRelative(-1.75f, -1.983f)
                curveToRelative(-0.971f, -1.1f, -2.183f, -1.956f, -3.537f, -2.504f)
                curveToRelative(0.107f, 1.016f, 0.035f, 2.041f, -0.216f, 3.058f)
                curveToRelative(-0.976f, 3.952f, -4.607f, 6.713f, -8.831f, 6.714f)
                horizontalLineToRelative(-4.383f)
                reflectiveCurveToRelative(1.983f, -1.749f, 1.983f, -1.749f)
                curveToRelative(1.1f, -0.971f, 1.956f, -2.183f, 2.504f, -3.537f)
                curveToRelative(-1.016f, 0.106f, -2.042f, 0.035f, -3.058f, -0.216f)
                curveTo(2.762f, 17.522f, 0.001f, 13.891f, 0.0f, 9.667f)
                verticalLineToRelative(-4.383f)
                reflectiveCurveToRelative(1.749f, 1.983f, 1.749f, 1.983f)
                curveToRelative(0.971f, 1.1f, 2.183f, 1.956f, 3.537f, 2.504f)
                curveToRelative(-0.107f, -1.016f, -0.035f, -2.041f, 0.216f, -3.058f)
                curveTo(6.478f, 2.762f, 10.109f, 0.001f, 14.333f, 0.0f)
                horizontalLineToRelative(4.383f)
                reflectiveCurveToRelative(-1.983f, 1.749f, -1.983f, 1.749f)
                curveToRelative(-1.1f, 0.971f, -1.956f, 2.183f, -2.504f, 3.537f)
                curveToRelative(1.017f, -0.106f, 2.042f, -0.036f, 3.058f, 0.216f)
                curveToRelative(3.952f, 0.976f, 6.713f, 4.607f, 6.714f, 8.831f)
                verticalLineToRelative(4.383f)
                close()
                moveTo(21.98f, 13.784f)
                curveToRelative(-0.23f, -3.022f, -2.334f, -5.64f, -5.172f, -6.341f)
                curveToRelative(-1.002f, -0.246f, -2.014f, -0.271f, -3.005f, -0.07f)
                curveToRelative(-0.528f, 0.108f, -1.058f, -0.067f, -1.418f, -0.468f)
                curveToRelative(-0.363f, -0.402f, -0.486f, -0.975f, -0.323f, -1.495f)
                curveToRelative(0.383f, -1.223f, 0.968f, -2.368f, 1.724f, -3.389f)
                curveToRelative(-3.022f, 0.23f, -5.64f, 2.334f, -6.341f, 5.172f)
                curveToRelative(-0.247f, 1.002f, -0.271f, 2.014f, -0.07f, 3.005f)
                curveToRelative(0.107f, 0.528f, -0.068f, 1.058f, -0.468f, 1.418f)
                curveToRelative(-0.402f, 0.362f, -0.975f, 0.485f, -1.495f, 0.323f)
                curveToRelative(-1.223f, -0.383f, -2.368f, -0.968f, -3.389f, -1.724f)
                curveToRelative(0.23f, 3.022f, 2.334f, 5.64f, 5.172f, 6.341f)
                curveToRelative(1.003f, 0.247f, 2.015f, 0.272f, 3.005f, 0.07f)
                curveToRelative(0.102f, -0.021f, 0.204f, -0.031f, 0.305f, -0.031f)
                curveToRelative(0.421f, 0.0f, 0.822f, 0.176f, 1.113f, 0.499f)
                curveToRelative(0.363f, 0.402f, 0.486f, 0.975f, 0.323f, 1.495f)
                curveToRelative(-0.383f, 1.223f, -0.968f, 2.368f, -1.724f, 3.389f)
                curveToRelative(3.022f, -0.23f, 5.64f, -2.334f, 6.341f, -5.172f)
                curveToRelative(0.247f, -1.002f, 0.271f, -2.014f, 0.07f, -3.005f)
                curveToRelative(-0.107f, -0.528f, 0.068f, -1.058f, 0.468f, -1.418f)
                curveToRelative(0.402f, -0.362f, 0.975f, -0.485f, 1.495f, -0.323f)
                curveToRelative(1.223f, 0.383f, 2.368f, 0.968f, 3.389f, 1.724f)
                close()
            }
        }
        .build()
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
