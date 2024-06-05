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

public val Icons.Bold.LeaderboardTrophy: ImageVector
    get() {
        if (_leaderboardTrophy != null) {
            return _leaderboardTrophy!!
        }
        _leaderboardTrophy = Builder(name = "LeaderboardTrophy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 16.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.98f, 6.0f)
                horizontalLineToRelative(3.02f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.485f, -1.89f, 5.0f, -5.5f, 5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-3.611f, 0.0f, -5.5f, -2.515f, -5.5f, -5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.067f, -0.526f, 0.35f, -1.0f, 0.891f, -1.0f)
                curveToRelative(1.557f, 0.0f, 4.621f, 0.0f, 6.177f, 0.0f)
                curveToRelative(0.541f, 0.0f, 0.959f, 0.474f, 0.891f, 1.0f)
                close()
                moveTo(10.598f, 10.0f)
                curveToRelative(-0.138f, -0.188f, -0.297f, -0.364f, -0.492f, -0.506f)
                curveToRelative(-0.563f, -0.41f, -0.995f, -0.935f, -1.33f, -1.494f)
                horizontalLineToRelative(-1.606f)
                curveToRelative(0.39f, 1.099f, 1.558f, 2.0f, 3.428f, 2.0f)
                close()
                moveTo(16.83f, 8.0f)
                horizontalLineToRelative(-1.607f)
                curveToRelative(-0.335f, 0.56f, -0.766f, 1.084f, -1.33f, 1.494f)
                curveToRelative(-0.195f, 0.142f, -0.353f, 0.317f, -0.492f, 0.506f)
                curveToRelative(1.869f, 0.0f, 3.038f, -0.901f, 3.428f, -2.0f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _leaderboardTrophy!!
    }

private var _leaderboardTrophy: ImageVector? = null
