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

public val Icons.Outline.Leaderboard: ImageVector
    get() {
        if (_leaderboard != null) {
            return _leaderboard!!
        }
        _leaderboard = Builder(name = "Leaderboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.249f, 6.158f)
                curveToRelative(-0.535f, -0.139f, -1.081f, 0.184f, -1.217f, 0.719f)
                curveToRelative(-0.138f, 0.535f, 0.184f, 1.08f, 0.719f, 1.217f)
                curveToRelative(0.987f, 0.254f, 1.751f, 0.984f, 2.077f, 1.906f)
                lineTo(2.172f, 10.0f)
                curveToRelative(0.326f, -0.922f, 1.089f, -1.652f, 2.077f, -1.906f)
                curveToRelative(0.535f, -0.137f, 0.857f, -0.683f, 0.719f, -1.217f)
                curveToRelative(-0.137f, -0.535f, -0.68f, -0.857f, -1.217f, -0.719f)
                curveToRelative(-2.208f, 0.568f, -3.751f, 2.559f, -3.751f, 4.842f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.283f, -1.542f, -4.274f, -3.751f, -4.842f)
                close()
                moveTo(10.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.184f, 20.0f)
                horizontalLineToRelative(5.816f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.302f, 0.0f, -2.402f, -0.839f, -2.816f, -2.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.816f)
                curveToRelative(-0.414f, 1.161f, -1.514f, 2.0f, -2.816f, 2.0f)
                close()
                moveTo(7.003f, 5.986f)
                lineTo(7.003f, 0.91f)
                curveToRelative(0.0f, -0.358f, 0.202f, -0.674f, 0.526f, -0.825f)
                curveToRelative(0.3f, -0.136f, 0.654f, -0.114f, 0.887f, 0.052f)
                curveToRelative(0.042f, 0.03f, 1.363f, 1.787f, 1.363f, 1.787f)
                lineToRelative(1.271f, -1.506f)
                curveToRelative(0.536f, -0.539f, 1.356f, -0.55f, 1.856f, -0.055f)
                lineToRelative(1.318f, 1.557f)
                lineToRelative(1.146f, -1.577f)
                curveToRelative(0.265f, -0.327f, 0.662f, -0.438f, 1.029f, -0.308f)
                curveToRelative(0.367f, 0.132f, 0.604f, 0.468f, 0.604f, 0.856f)
                verticalLineToRelative(5.107f)
                curveToRelative(0.0f, 0.535f, -0.208f, 1.038f, -0.587f, 1.416f)
                curveToRelative(-0.378f, 0.376f, -0.879f, 0.584f, -1.412f, 0.584f)
                horizontalLineToRelative(-0.005f)
                lineToRelative(-6.0f, -0.014f)
                curveToRelative(-1.101f, -0.002f, -1.996f, -0.899f, -1.996f, -2.0f)
                close()
            }
        }
        .build()
        return _leaderboard!!
    }

private var _leaderboard: ImageVector? = null
