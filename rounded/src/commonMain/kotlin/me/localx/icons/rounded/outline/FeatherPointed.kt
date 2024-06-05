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

public val Icons.Outline.FeatherPointed: ImageVector
    get() {
        if (_featherPointed != null) {
            return _featherPointed!!
        }
        _featherPointed = Builder(name = "FeatherPointed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.298f, 0.699f)
                curveToRelative(-0.542f, -0.542f, -1.289f, -0.785f, -2.052f, -0.672f)
                curveToRelative(-3.629f, 0.548f, -10.529f, 2.282f, -15.971f, 7.74f)
                curveToRelative(-1.537f, 1.541f, -2.363f, 3.675f, -2.266f, 5.853f)
                curveToRelative(0.072f, 1.617f, 0.627f, 3.12f, 1.585f, 4.371f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(4.304f, -4.304f)
                curveToRelative(1.363f, 1.064f, 3.003f, 1.604f, 4.665f, 1.604f)
                curveToRelative(2.109f, 0.0f, 4.239f, -0.843f, 5.832f, -2.488f)
                curveToRelative(5.443f, -5.622f, 7.03f, -12.912f, 7.46f, -15.785f)
                curveToRelative(0.113f, -0.755f, -0.131f, -1.496f, -0.669f, -2.034f)
                close()
                moveTo(5.008f, 13.531f)
                curveToRelative(-0.072f, -1.62f, 0.542f, -3.206f, 1.684f, -4.352f)
                curveToRelative(5.036f, -5.052f, 11.468f, -6.663f, 14.854f, -7.174f)
                curveToRelative(0.023f, -0.004f, 0.215f, -0.039f, 0.34f, 0.108f)
                curveToRelative(0.046f, 0.054f, 0.129f, 0.158f, 0.105f, 0.323f)
                curveToRelative(-0.18f, 1.2f, -0.578f, 3.226f, -1.41f, 5.562f)
                horizontalLineToRelative(-3.923f)
                curveToRelative(-1.335f, 0.0f, -2.591f, 0.521f, -3.535f, 1.465f)
                lineToRelative(-7.093f, 7.093f)
                curveToRelative(-0.613f, -0.884f, -0.971f, -1.919f, -1.021f, -3.026f)
                close()
                moveTo(18.23f, 13.0f)
                horizontalLineToRelative(-5.815f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(0.559f, -0.559f, 1.332f, -0.879f, 2.121f, -0.879f)
                horizontalLineToRelative(3.126f)
                curveToRelative(-0.435f, 0.984f, -0.946f, 1.994f, -1.553f, 3.0f)
                close()
                moveTo(15.072f, 17.128f)
                curveToRelative(-2.077f, 2.146f, -5.337f, 2.464f, -7.625f, 0.84f)
                lineToRelative(2.968f, -2.968f)
                horizontalLineToRelative(6.465f)
                curveToRelative(-0.546f, 0.728f, -1.144f, 1.442f, -1.808f, 2.128f)
                close()
            }
        }
        .build()
        return _featherPointed!!
    }

private var _featherPointed: ImageVector? = null
