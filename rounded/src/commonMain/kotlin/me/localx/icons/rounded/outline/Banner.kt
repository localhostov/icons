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

public val Icons.Outline.Banner: ImageVector
    get() {
        if (_banner != null) {
            return _banner!!
        }
        _banner = Builder(name = "Banner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.562f, 9.572f)
                curveToRelative(0.43f, -0.492f, 0.555f, -1.181f, 0.323f, -1.799f)
                curveToRelative(-0.221f, -0.593f, -0.739f, -1.014f, -1.353f, -1.099f)
                curveToRelative(-2.312f, -0.319f, -7.207f, -0.674f, -10.533f, -0.674f)
                reflectiveCurveToRelative(-8.221f, 0.355f, -10.534f, 0.674f)
                curveToRelative(-0.612f, 0.085f, -1.131f, 0.506f, -1.352f, 1.099f)
                curveToRelative(-0.231f, 0.618f, -0.106f, 1.307f, 0.323f, 1.799f)
                curveToRelative(0.052f, 0.059f, 3.208f, 2.309f, 3.208f, 2.309f)
                curveToRelative(0.0f, 0.0f, -2.797f, 2.806f, -2.83f, 2.854f)
                curveToRelative(-0.403f, 0.577f, -0.429f, 1.34f, -0.064f, 1.943f)
                curveToRelative(0.353f, 0.583f, 0.983f, 0.891f, 1.648f, 0.809f)
                curveToRelative(2.384f, -0.303f, 6.601f, -0.54f, 9.601f, -0.54f)
                reflectiveCurveToRelative(7.217f, 0.237f, 9.601f, 0.54f)
                curveToRelative(0.072f, 0.009f, 0.145f, 0.014f, 0.215f, 0.014f)
                curveToRelative(0.584f, 0.0f, 1.119f, -0.303f, 1.434f, -0.822f)
                curveToRelative(0.364f, -0.604f, 0.339f, -1.366f, -0.064f, -1.943f)
                curveToRelative(-0.033f, -0.048f, -2.83f, -2.854f, -2.83f, -2.854f)
                curveToRelative(0.0f, 0.0f, 3.156f, -2.25f, 3.208f, -2.309f)
                close()
                moveTo(18.231f, 10.934f)
                curveToRelative(-0.24f, 0.17f, -0.394f, 0.438f, -0.418f, 0.731f)
                curveToRelative(-0.025f, 0.293f, 0.081f, 0.583f, 0.289f, 0.792f)
                lineToRelative(2.951f, 2.954f)
                curveToRelative(-2.517f, -0.266f, -6.293f, -0.463f, -9.054f, -0.463f)
                reflectiveCurveToRelative(-6.537f, 0.197f, -9.054f, 0.463f)
                lineToRelative(2.951f, -2.954f)
                curveToRelative(0.208f, -0.208f, 0.314f, -0.498f, 0.289f, -0.792f)
                curveToRelative(-0.024f, -0.293f, -0.178f, -0.561f, -0.418f, -0.731f)
                lineToRelative(-3.337f, -2.366f)
                curveToRelative(2.433f, -0.284f, 6.626f, -0.568f, 9.568f, -0.568f)
                reflectiveCurveToRelative(7.137f, 0.284f, 9.568f, 0.568f)
                lineToRelative(-3.337f, 2.366f)
                close()
            }
        }
        .build()
        return _banner!!
    }

private var _banner: ImageVector? = null
