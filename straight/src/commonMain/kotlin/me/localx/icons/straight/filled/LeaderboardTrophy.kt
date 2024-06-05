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

public val Icons.Filled.LeaderboardTrophy: ImageVector
    get() {
        if (_leaderboardTrophy != null) {
            return _leaderboardTrophy!!
        }
        _leaderboardTrophy = Builder(name = "LeaderboardTrophy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.224f, 7.0f)
                horizontalLineToRelative(1.607f)
                curveToRelative(-0.39f, 1.099f, -1.461f, 2.0f, -3.33f, 2.0f)
                horizontalLineToRelative(-0.098f)
                curveToRelative(0.138f, -0.188f, 0.297f, -0.364f, 0.492f, -0.506f)
                curveToRelative(0.563f, -0.41f, 0.995f, -0.935f, 1.33f, -1.494f)
                close()
                moveTo(10.107f, 8.494f)
                curveToRelative(-0.563f, -0.41f, -0.995f, -0.935f, -1.33f, -1.494f)
                horizontalLineToRelative(-1.606f)
                curveToRelative(0.39f, 1.099f, 1.46f, 2.0f, 3.33f, 2.0f)
                horizontalLineToRelative(0.098f)
                curveToRelative(-0.138f, -0.188f, -0.297f, -0.364f, -0.492f, -0.506f)
                close()
                moveTo(24.001f, 3.0f)
                verticalLineToRelative(21.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(19.001f, 18.0f)
                lineTo(5.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.001f, 5.0f)
                horizontalLineToRelative(-3.02f)
                curveToRelative(0.067f, -0.526f, -0.35f, -1.0f, -0.891f, -1.0f)
                curveToRelative(-1.557f, 0.0f, -4.621f, 0.0f, -6.177f, 0.0f)
                curveToRelative(-0.541f, 0.0f, -0.959f, 0.474f, -0.891f, 1.0f)
                horizontalLineToRelative(-3.02f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.485f, 1.889f, 5.0f, 5.5f, 5.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.725f)
                curveToRelative(0.0f, 1.333f, -1.222f, 1.275f, -1.222f, 1.275f)
                horizontalLineToRelative(-0.778f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-0.778f)
                reflectiveCurveToRelative(-1.222f, 0.058f, -1.222f, -1.275f)
                verticalLineToRelative(-0.725f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.61f, 0.0f, 5.5f, -2.515f, 5.5f, -5.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _leaderboardTrophy!!
    }

private var _leaderboardTrophy: ImageVector? = null
