package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Snake: ImageVector
    get() {
        if (_snake != null) {
            return _snake!!
        }
        _snake = Builder(name = "Snake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 4.989f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 17.0f)
                horizontalLineToRelative(-0.223f)
                curveToRelative(-1.135f, -0.71f, -2.566f, -2.053f, -4.157f, -3.904f)
                curveToRelative(-2.009f, -2.336f, -2.115f, -3.569f, -2.12f, -4.46f)
                curveToRelative(0.224f, -0.048f, 0.572f, -0.096f, 1.011f, -0.103f)
                curveToRelative(1.949f, 1.92f, 5.1f, 1.918f, 7.024f, -0.007f)
                lineToRelative(0.875f, -0.884f)
                curveToRelative(1.441f, -1.461f, 1.442f, -3.839f, 0.001f, -5.301f)
                lineToRelative(-0.876f, -0.886f)
                curveToRelative(-1.926f, -1.925f, -5.088f, -1.897f, -7.037f, 0.025f)
                curveToRelative(-1.438f, 0.058f, -4.111f, 0.393f, -5.862f, 1.977f)
                curveToRelative(-0.975f, 0.882f, -2.137f, 2.471f, -2.137f, 5.033f)
                curveToRelative(0.0f, 0.782f, 0.118f, 1.6f, 0.326f, 2.425f)
                curveToRelative(-0.57f, -0.27f, -1.389f, -0.56f, -2.59f, -0.851f)
                curveToRelative(-0.707f, -0.171f, -1.453f, 0.015f, -1.997f, 0.5f)
                curveToRelative(-0.542f, 0.485f, -0.812f, 1.204f, -0.722f, 1.925f)
                curveToRelative(0.356f, 2.819f, 0.952f, 3.535f, 1.161f, 3.786f)
                lineToRelative(0.63f, 0.726f)
                horizontalLineToRelative(-0.308f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.479f, 4.94f)
                curveToRelative(1.332f, -1.205f, 3.661f, -1.424f, 4.6f, -1.462f)
                curveToRelative(0.492f, -0.02f, 0.953f, -0.229f, 1.335f, -0.605f)
                curveToRelative(1.17f, -1.153f, 3.057f, -1.156f, 4.208f, -0.004f)
                lineToRelative(0.866f, 0.876f)
                curveToRelative(0.677f, 0.687f, 0.677f, 1.805f, 0.0f, 2.493f)
                lineToRelative(-0.865f, 0.874f)
                curveToRelative(-1.151f, 1.15f, -3.038f, 1.147f, -4.206f, -0.003f)
                curveToRelative(-0.445f, -0.438f, -1.012f, -0.654f, -1.583f, -0.61f)
                curveToRelative(-1.768f, 0.14f, -2.19f, 0.528f, -2.346f, 0.671f)
                curveToRelative(-0.327f, 0.298f, -0.486f, 0.73f, -0.486f, 1.32f)
                curveToRelative(0.0f, 1.078f, 0.0f, 2.881f, 2.604f, 5.911f)
                curveToRelative(0.871f, 1.012f, 1.693f, 1.879f, 2.463f, 2.597f)
                lineToRelative(-4.142f, -0.005f)
                curveToRelative(-1.976f, -2.079f, -3.926f, -5.705f, -3.926f, -8.503f)
                curveToRelative(0.0f, -1.828f, 0.804f, -2.939f, 1.479f, -3.549f)
                close()
                moveTo(4.072f, 12.056f)
                curveToRelative(0.039f, -0.034f, 0.102f, -0.07f, 0.192f, -0.049f)
                curveToRelative(2.314f, 0.562f, 2.728f, 1.033f, 2.783f, 1.097f)
                lineToRelative(2.296f, 2.448f)
                curveToRelative(0.313f, 0.51f, 0.644f, 0.995f, 0.984f, 1.449f)
                horizontalLineToRelative(-3.87f)
                lineToRelative(-1.754f, -2.021f)
                curveToRelative(-0.042f, -0.052f, -0.425f, -0.564f, -0.7f, -2.741f)
                curveToRelative(-0.011f, -0.09f, 0.031f, -0.149f, 0.069f, -0.183f)
                close()
                moveTo(20.501f, 22.0f)
                lineTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _snake!!
    }

private var _snake: ImageVector? = null
