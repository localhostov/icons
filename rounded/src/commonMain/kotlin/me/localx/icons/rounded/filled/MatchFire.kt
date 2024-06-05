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

public val Icons.Filled.MatchFire: ImageVector
    get() {
        if (_matchFire != null) {
            return _matchFire!!
        }
        _matchFire = Builder(name = "MatchFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.855f, 10.012f)
                curveToRelative(-0.287f, -0.473f, -0.902f, -0.622f, -1.373f, -0.337f)
                lineToRelative(-12.125f, 7.341f)
                curveToRelative(-1.315f, 0.018f, -4.485f, 0.129f, -5.639f, 0.764f)
                curveToRelative(-0.775f, 0.427f, -1.339f, 1.13f, -1.586f, 1.98f)
                curveToRelative(-0.247f, 0.851f, -0.147f, 1.746f, 0.279f, 2.522f)
                reflectiveCurveToRelative(1.13f, 1.339f, 1.979f, 1.586f)
                curveToRelative(0.307f, 0.089f, 0.619f, 0.133f, 0.93f, 0.133f)
                curveToRelative(0.551f, 0.0f, 1.096f, -0.139f, 1.592f, -0.412f)
                curveToRelative(1.198f, -0.658f, 2.84f, -3.629f, 3.488f, -4.868f)
                lineToRelative(12.118f, -7.336f)
                curveToRelative(0.473f, -0.286f, 0.624f, -0.901f, 0.338f, -1.374f)
                close()
                moveTo(7.678f, 0.285f)
                curveToRelative(-0.499f, -0.495f, -1.342f, -0.321f, -1.598f, 0.333f)
                curveToRelative(-0.944f, 2.407f, -0.643f, 5.382f, -2.58f, 5.382f)
                curveToRelative(-0.527f, 0.0f, -0.81f, -1.297f, -1.019f, -2.0f)
                curveToRelative(-0.133f, -0.448f, -0.732f, -0.523f, -0.981f, -0.127f)
                curveToRelative(-0.803f, 1.279f, -1.5f, 3.185f, -1.5f, 4.627f)
                curveToRelative(0.0f, 3.977f, 3.572f, 7.12f, 7.682f, 6.396f)
                curveToRelative(2.307f, -0.406f, 4.23f, -2.126f, 4.974f, -4.347f)
                curveTo(14.19f, 5.971f, 10.239f, 2.827f, 7.678f, 0.285f)
                close()
                moveTo(8.047f, 12.283f)
                curveToRelative(-0.802f, 0.936f, -2.242f, 0.936f, -3.045f, 0.0f)
                curveToRelative(-0.693f, -0.81f, -0.558f, -2.046f, 0.195f, -2.8f)
                lineToRelative(0.739f, -0.739f)
                curveToRelative(0.325f, -0.325f, 0.851f, -0.325f, 1.176f, 0.0f)
                lineToRelative(0.739f, 0.74f)
                curveToRelative(0.753f, 0.754f, 0.888f, 1.99f, 0.195f, 2.8f)
                close()
            }
        }
        .build()
        return _matchFire!!
    }

private var _matchFire: ImageVector? = null
