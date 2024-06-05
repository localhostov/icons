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

public val Icons.Filled.Leaderboard: ImageVector
    get() {
        if (_leaderboard != null) {
            return _leaderboard!!
        }
        _leaderboard = Builder(name = "Leaderboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.045f, 0.0f, 3.802f, -1.237f, 4.576f, -3.0f)
                horizontalLineToRelative(-13.576f)
                close()
                moveTo(10.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-14.0f)
                close()
                moveTo(0.424f, 21.0f)
                curveToRelative(0.774f, 1.763f, 2.531f, 3.0f, 4.576f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.424f, 21.0f)
                close()
                moveTo(16.416f, 8.43f)
                curveToRelative(0.379f, -0.378f, 0.587f, -0.881f, 0.587f, -1.416f)
                lineTo(17.003f, 0.893f)
                curveToRelative(0.0f, -0.388f, -0.236f, -0.724f, -0.604f, -0.856f)
                curveToRelative(-0.367f, -0.131f, -0.764f, -0.019f, -1.029f, 0.308f)
                lineToRelative(-1.146f, 1.577f)
                lineToRelative(-1.318f, -1.557f)
                curveToRelative(-0.5f, -0.495f, -1.32f, -0.484f, -1.856f, 0.055f)
                lineToRelative(-1.271f, 1.506f)
                reflectiveCurveToRelative(-1.321f, -1.757f, -1.363f, -1.787f)
                curveToRelative(-0.232f, -0.166f, -0.586f, -0.188f, -0.887f, -0.052f)
                curveToRelative(-0.325f, 0.15f, -0.526f, 0.467f, -0.526f, 0.825f)
                verticalLineToRelative(6.09f)
                curveToRelative(0.0f, 1.101f, 0.895f, 1.998f, 1.996f, 2.0f)
                lineToRelative(6.0f, 0.014f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.533f, 0.0f, 1.034f, -0.208f, 1.412f, -0.584f)
                close()
                moveTo(19.003f, 7.014f)
                curveToRelative(0.0f, 0.711f, -0.2f, 1.386f, -0.546f, 1.986f)
                horizontalLineToRelative(5.118f)
                curveToRelative(-0.773f, -1.762f, -2.529f, -2.998f, -4.573f, -3.0f)
                verticalLineToRelative(1.014f)
                close()
                moveTo(5.003f, 7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-2.045f, 0.0f, -3.802f, 1.237f, -4.576f, 3.0f)
                horizontalLineToRelative(5.136f)
                curveToRelative(-0.345f, -0.591f, -0.557f, -1.268f, -0.557f, -2.0f)
                close()
            }
        }
        .build()
        return _leaderboard!!
    }

private var _leaderboard: ImageVector? = null
