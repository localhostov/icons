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

public val Icons.Filled.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.657f, 10.0f)
                horizontalLineToRelative(5.293f)
                curveToRelative(-0.398f, 0.976f, -0.863f, 1.983f, -1.418f, 3.0f)
                horizontalLineToRelative(-8.117f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(0.559f, -0.559f, 1.332f, -0.879f, 2.121f, -0.879f)
                close()
                moveTo(9.292f, 13.295f)
                lineToRelative(-4.697f, 4.696f)
                curveToRelative(-0.958f, -1.251f, -1.513f, -2.754f, -1.585f, -4.371f)
                curveToRelative(-0.097f, -2.178f, 0.729f, -4.312f, 2.266f, -5.853f)
                curveTo(10.717f, 2.31f, 17.617f, 0.575f, 21.246f, 0.027f)
                curveToRelative(0.763f, -0.113f, 1.51f, 0.13f, 2.052f, 0.672f)
                curveToRelative(0.539f, 0.538f, 0.783f, 1.279f, 0.669f, 2.034f)
                curveToRelative(-0.174f, 1.164f, -0.545f, 3.058f, -1.278f, 5.267f)
                horizontalLineToRelative(-6.033f)
                curveToRelative(-1.335f, 0.0f, -2.591f, 0.521f, -3.535f, 1.465f)
                lineToRelative(-3.827f, 3.827f)
                lineToRelative(-0.003f, 0.003f)
                close()
                moveTo(6.012f, 19.403f)
                curveToRelative(1.363f, 1.064f, 3.003f, 1.604f, 4.665f, 1.604f)
                curveToRelative(2.109f, 0.0f, 4.239f, -0.843f, 5.832f, -2.488f)
                curveToRelative(1.087f, -1.122f, 2.014f, -2.312f, 2.814f, -3.519f)
                horizontalLineToRelative(-8.908f)
                lineToRelative(-4.403f, 4.403f)
                close()
                moveTo(4.595f, 17.991f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(4.304f, -4.304f)
                curveToRelative(-0.068f, -0.053f, -1.066f, -0.954f, -1.417f, -1.412f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
