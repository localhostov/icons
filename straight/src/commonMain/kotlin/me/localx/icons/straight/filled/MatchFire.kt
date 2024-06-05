package me.localx.icons.straight.filled

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
                moveToRelative(23.993f, 11.098f)
                lineToRelative(-1.035f, -1.711f)
                lineToRelative(-12.601f, 7.629f)
                curveToRelative(-1.315f, 0.018f, -4.485f, 0.129f, -5.639f, 0.764f)
                curveToRelative(-0.775f, 0.427f, -1.339f, 1.13f, -1.586f, 1.98f)
                curveToRelative(-0.247f, 0.851f, -0.147f, 1.746f, 0.279f, 2.522f)
                reflectiveCurveToRelative(1.13f, 1.339f, 1.979f, 1.586f)
                curveToRelative(0.307f, 0.089f, 0.619f, 0.133f, 0.93f, 0.133f)
                curveToRelative(0.551f, 0.0f, 1.096f, -0.139f, 1.592f, -0.412f)
                curveToRelative(1.198f, -0.658f, 2.84f, -3.629f, 3.488f, -4.868f)
                lineToRelative(12.593f, -7.624f)
                close()
                moveTo(6.761f, 0.0f)
                curveToRelative(-1.826f, 2.693f, -0.967f, 7.0f, -3.261f, 7.0f)
                curveToRelative(-1.0f, 0.0f, -1.0f, -3.0f, -1.0f, -3.0f)
                curveToRelative(-1.078f, 1.112f, -2.5f, 3.41f, -2.5f, 5.5f)
                curveToRelative(0.0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                curveToRelative(0.0f, -4.106f, -4.208f, -7.136f, -6.239f, -9.5f)
                close()
                moveTo(7.939f, 13.414f)
                curveToRelative(-0.781f, 0.781f, -2.048f, 0.781f, -2.829f, 0.0f)
                curveToRelative(-0.781f, -0.782f, -0.781f, -2.048f, 0.0f, -2.829f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(1.414f, 1.415f)
                curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0.0f, 2.829f)
                close()
            }
        }
        .build()
        return _matchFire!!
    }

private var _matchFire: ImageVector? = null
