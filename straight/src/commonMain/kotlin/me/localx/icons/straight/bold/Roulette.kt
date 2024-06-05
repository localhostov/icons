package me.localx.icons.straight.bold

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

public val Icons.Bold.Roulette: ImageVector
    get() {
        if (_roulette != null) {
            return _roulette!!
        }
        _roulette = Builder(name = "Roulette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.999f, 14.508f)
                curveToRelative(-0.33f, 0.788f, -0.806f, 1.496f, -1.416f, 2.103f)
                lineToRelative(1.759f, 1.768f)
                curveToRelative(-0.83f, 0.825f, -1.82f, 1.487f, -2.918f, 1.941f)
                lineToRelative(-0.951f, -2.306f)
                curveToRelative(-0.783f, 0.322f, -1.615f, 0.486f, -2.473f, 0.486f)
                horizontalLineToRelative(-0.015f)
                lineToRelative(0.013f, 2.5f)
                curveToRelative(-1.223f, 0.0f, -2.389f, -0.248f, -3.453f, -0.692f)
                lineToRelative(0.961f, -2.303f)
                curveToRelative(-0.791f, -0.329f, -1.499f, -0.805f, -2.106f, -1.412f)
                lineToRelative(-1.766f, 1.762f)
                curveToRelative(-0.827f, -0.829f, -1.492f, -1.818f, -1.947f, -2.916f)
                lineToRelative(2.305f, -0.953f)
                curveToRelative(-0.326f, -0.789f, -0.492f, -1.625f, -0.492f, -2.486f)
                verticalLineToRelative(-0.062f)
                lineToRelative(-2.499f, 0.052f)
                curveToRelative(0.001f, -1.238f, 0.254f, -2.419f, 0.71f, -3.493f)
                lineToRelative(2.3f, 0.973f)
                curveToRelative(0.333f, -0.787f, 0.812f, -1.492f, 1.424f, -2.096f)
                lineToRelative(-1.751f, -1.775f)
                curveToRelative(0.833f, -0.822f, 1.826f, -1.481f, 2.926f, -1.93f)
                lineToRelative(0.94f, 2.309f)
                curveToRelative(0.778f, -0.316f, 1.603f, -0.477f, 2.485f, -0.478f)
                lineToRelative(0.004f, -0.5f)
                lineToRelative(-0.031f, -2.0f)
                curveToRelative(1.233f, 0.001f, 2.409f, 0.252f, 3.48f, 0.704f)
                lineToRelative(-0.969f, 2.301f)
                curveToRelative(0.789f, 0.332f, 1.495f, 0.81f, 2.099f, 1.42f)
                lineToRelative(1.772f, -1.754f)
                curveToRelative(0.823f, 0.831f, 1.484f, 1.822f, 1.935f, 2.921f)
                lineToRelative(-2.307f, 0.947f)
                curveToRelative(0.32f, 0.78f, 0.482f, 1.608f, 0.482f, 2.461f)
                verticalLineToRelative(0.031f)
                lineToRelative(2.5f, -0.026f)
                curveToRelative(0.0f, 1.228f, -0.25f, 2.399f, -0.698f, 3.466f)
                lineToRelative(-2.303f, -0.964f)
                close()
                moveTo(16.061f, 10.061f)
                lineToRelative(-1.939f, 1.939f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(-1.939f, 1.939f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(-1.939f, -1.939f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.939f, 1.939f)
                lineToRelative(1.939f, -1.939f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _roulette!!
    }

private var _roulette: ImageVector? = null
