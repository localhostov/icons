package me.localx.icons.rounded.bold

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

public val Icons.Bold.LeaderSpeech: ImageVector
    get() {
        if (_leaderSpeech != null) {
            return _leaderSpeech!!
        }
        _leaderSpeech = Builder(name = "LeaderSpeech", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.086f)
                curveToRelative(0.0f, -0.667f, 0.26f, -1.295f, 0.732f, -1.768f)
                lineToRelative(1.281f, -1.281f)
                curveToRelative(0.071f, -1.041f, 0.928f, -1.865f, 1.986f, -1.865f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.058f, -0.825f, 1.916f, -1.865f, 1.986f)
                lineToRelative(-1.135f, 1.135f)
                verticalLineToRelative(2.879f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.957f)
                lineTo(5.348f, 3.46f)
                curveToRelative(-0.53f, -0.637f, -0.444f, -1.583f, 0.192f, -2.113f)
                curveToRelative(0.637f, -0.531f, 1.582f, -0.444f, 2.113f, 0.192f)
                lineToRelative(4.55f, 5.46f)
                horizontalLineToRelative(4.595f)
                lineToRelative(4.55f, -5.46f)
                curveToRelative(0.531f, -0.636f, 1.476f, -0.723f, 2.113f, -0.192f)
                curveToRelative(0.636f, 0.53f, 0.722f, 1.476f, 0.192f, 2.113f)
                lineToRelative(-4.652f, 5.583f)
                verticalLineToRelative(6.957f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _leaderSpeech!!
    }

private var _leaderSpeech: ImageVector? = null
