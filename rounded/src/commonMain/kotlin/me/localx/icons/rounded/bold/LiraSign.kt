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

public val Icons.Bold.LiraSign: ImageVector
    get() {
        if (_liraSign != null) {
            return _liraSign!!
        }
        _liraSign = Builder(name = "LiraSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 11.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                curveToRelative(0.0f, 4.687f, -3.813f, 8.5f, -8.5f, 8.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-5.403f)
                lineToRelative(6.013f, -2.186f)
                curveToRelative(0.778f, -0.283f, 1.18f, -1.145f, 0.897f, -1.923f)
                curveToRelative(-0.283f, -0.779f, -1.144f, -1.181f, -1.922f, -0.897f)
                lineToRelative(-4.987f, 1.814f)
                verticalLineToRelative(-1.807f)
                lineToRelative(6.013f, -2.186f)
                curveToRelative(0.778f, -0.283f, 1.18f, -1.145f, 0.897f, -1.923f)
                curveToRelative(-0.283f, -0.779f, -1.144f, -1.181f, -1.922f, -0.897f)
                lineToRelative(-4.987f, 1.814f)
                verticalLineTo(1.5f)
                curveToRelative(-0.034f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineTo(6.994f)
                lineToRelative(-3.013f, 1.096f)
                curveToRelative(-0.778f, 0.283f, -1.18f, 1.145f, -0.897f, 1.923f)
                curveToRelative(0.282f, 0.787f, 1.164f, 1.177f, 1.922f, 0.897f)
                lineToRelative(1.987f, -0.723f)
                verticalLineToRelative(1.807f)
                lineToRelative(-3.013f, 1.096f)
                curveToRelative(-0.778f, 0.283f, -1.18f, 1.145f, -0.897f, 1.923f)
                curveToRelative(0.282f, 0.787f, 1.164f, 1.177f, 1.922f, 0.897f)
                lineToRelative(1.987f, -0.723f)
                verticalLineToRelative(4.312f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                curveToRelative(6.341f, 0.0f, 11.5f, -5.159f, 11.5f, -11.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _liraSign!!
    }

private var _liraSign: ImageVector? = null
