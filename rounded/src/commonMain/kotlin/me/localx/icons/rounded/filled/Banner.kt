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

public val Icons.Filled.Banner: ImageVector
    get() {
        if (_banner != null) {
            return _banner!!
        }
        _banner = Builder(name = "Banner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.815f, 17.5f)
                curveToRelative(-0.07f, 0.0f, -0.143f, -0.005f, -0.215f, -0.014f)
                curveToRelative(-2.384f, -0.303f, -6.601f, -0.54f, -9.601f, -0.54f)
                reflectiveCurveToRelative(-7.217f, 0.237f, -9.601f, 0.54f)
                curveToRelative(-0.665f, 0.083f, -1.296f, -0.226f, -1.648f, -0.809f)
                curveToRelative(-0.364f, -0.604f, -0.339f, -1.366f, 0.064f, -1.943f)
                curveToRelative(0.033f, -0.048f, 0.07f, -0.093f, 0.112f, -0.134f)
                lineToRelative(2.718f, -2.72f)
                lineToRelative(-3.033f, -2.151f)
                curveToRelative(-0.064f, -0.045f, -0.123f, -0.099f, -0.175f, -0.158f)
                curveToRelative(-0.43f, -0.492f, -0.555f, -1.181f, -0.323f, -1.799f)
                curveToRelative(0.221f, -0.593f, 0.739f, -1.014f, 1.352f, -1.099f)
                curveToRelative(2.313f, -0.319f, 7.208f, -0.674f, 10.534f, -0.674f)
                reflectiveCurveToRelative(8.221f, 0.355f, 10.533f, 0.674f)
                curveToRelative(0.613f, 0.085f, 1.132f, 0.506f, 1.353f, 1.099f)
                curveToRelative(0.231f, 0.618f, 0.106f, 1.307f, -0.323f, 1.799f)
                curveToRelative(-0.052f, 0.059f, -0.11f, 0.112f, -0.175f, 0.158f)
                lineToRelative(-3.033f, 2.151f)
                lineToRelative(2.718f, 2.72f)
                curveToRelative(0.042f, 0.042f, 0.079f, 0.086f, 0.112f, 0.134f)
                curveToRelative(0.403f, 0.577f, 0.429f, 1.34f, 0.064f, 1.943f)
                curveToRelative(-0.314f, 0.52f, -0.85f, 0.822f, -1.434f, 0.822f)
                close()
            }
        }
        .build()
        return _banner!!
    }

private var _banner: ImageVector? = null
