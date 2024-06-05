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

public val Icons.Bold.MatchFire: ImageVector
    get() {
        if (_matchFire != null) {
            return _matchFire!!
        }
        _matchFire = Builder(name = "MatchFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 9.457f)
                curveToRelative(0.0f, -4.034f, -4.192f, -6.804f, -6.5f, -9.457f)
                curveToRelative(-2.231f, 2.808f, -1.576f, 7.0f, -2.945f, 7.0f)
                curveToRelative(-1.055f, 0.0f, -1.209f, -2.5f, -1.209f, -2.5f)
                curveToRelative(-1.078f, 1.112f, -2.346f, 3.088f, -2.346f, 4.957f)
                curveToRelative(0.0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                close()
                moveTo(5.085f, 13.414f)
                curveToRelative(-0.781f, -0.782f, -0.781f, -2.048f, 0.0f, -2.829f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(1.415f, 1.415f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0.0f, 2.829f)
                curveToRelative(-0.781f, 0.781f, -2.048f, 0.781f, -2.829f, 0.0f)
                close()
                moveTo(10.102f, 20.229f)
                curveToRelative(-0.865f, 1.438f, -1.922f, 2.995f, -2.657f, 3.4f)
                curveToRelative(-1.452f, 0.798f, -3.276f, 0.268f, -4.074f, -1.183f)
                curveToRelative(-0.798f, -1.452f, -0.268f, -3.276f, 1.183f, -4.074f)
                curveToRelative(0.715f, -0.393f, 2.436f, -0.601f, 3.998f, -0.711f)
                lineToRelative(13.829f, -8.542f)
                lineToRelative(1.576f, 2.553f)
                lineToRelative(-13.855f, 8.558f)
                close()
            }
        }
        .build()
        return _matchFire!!
    }

private var _matchFire: ImageVector? = null
