package me.localx.icons.straight.outline

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

public val Icons.Outline.Roulette: ImageVector
    get() {
        if (_roulette != null) {
            return _roulette!!
        }
        _roulette = Builder(name = "Roulette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.0f, 19.931f)
                verticalLineToRelative(2.019f)
                curveToRelative(-1.183f, -0.118f, -2.3f, -0.452f, -3.326f, -0.948f)
                lineToRelative(1.046f, -1.713f)
                curveToRelative(0.711f, 0.322f, 1.477f, 0.541f, 2.28f, 0.642f)
                close()
                moveTo(13.0f, 19.931f)
                curveToRelative(0.803f, -0.101f, 1.569f, -0.32f, 2.28f, -0.642f)
                lineToRelative(1.046f, 1.713f)
                curveToRelative(-1.026f, 0.495f, -2.143f, 0.829f, -3.326f, 0.948f)
                verticalLineToRelative(-2.019f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(4.069f, 11.0f)
                lineTo(2.051f, 11.0f)
                curveToRelative(0.106f, -1.065f, 0.384f, -2.078f, 0.799f, -3.019f)
                lineToRelative(1.75f, 0.988f)
                curveToRelative(-0.263f, 0.64f, -0.442f, 1.321f, -0.531f, 2.03f)
                close()
                moveTo(4.069f, 13.0f)
                curveToRelative(0.089f, 0.709f, 0.268f, 1.39f, 0.53f, 2.029f)
                lineToRelative(-1.75f, 0.988f)
                curveToRelative(-0.415f, -0.94f, -0.693f, -1.953f, -0.799f, -3.018f)
                horizontalLineToRelative(2.019f)
                close()
                moveTo(13.0f, 4.069f)
                lineTo(13.0f, 2.051f)
                curveToRelative(1.183f, 0.118f, 2.3f, 0.452f, 3.326f, 0.948f)
                lineToRelative(-1.046f, 1.713f)
                curveToRelative(-0.711f, -0.322f, -1.477f, -0.541f, -2.28f, -0.642f)
                close()
                moveTo(11.0f, 4.069f)
                curveToRelative(-0.803f, 0.101f, -1.569f, 0.32f, -2.28f, 0.642f)
                lineToRelative(-1.046f, -1.713f)
                curveToRelative(1.026f, -0.495f, 2.143f, -0.83f, 3.326f, -0.948f)
                verticalLineToRelative(2.019f)
                close()
                moveTo(19.931f, 13.0f)
                horizontalLineToRelative(2.019f)
                curveToRelative(-0.106f, 1.064f, -0.384f, 2.078f, -0.799f, 3.018f)
                lineToRelative(-1.75f, -0.988f)
                curveToRelative(0.263f, -0.639f, 0.441f, -1.32f, 0.53f, -2.029f)
                close()
                moveTo(19.931f, 11.0f)
                curveToRelative(-0.089f, -0.709f, -0.268f, -1.391f, -0.531f, -2.03f)
                lineToRelative(1.75f, -0.988f)
                curveToRelative(0.415f, 0.941f, 0.693f, 1.954f, 0.799f, 3.019f)
                horizontalLineToRelative(-2.019f)
                close()
                moveTo(20.163f, 6.243f)
                lineToRelative(-1.753f, 0.99f)
                curveToRelative(-0.411f, -0.551f, -0.886f, -1.049f, -1.422f, -1.478f)
                lineToRelative(1.046f, -1.712f)
                curveToRelative(0.817f, 0.621f, 1.537f, 1.361f, 2.13f, 2.199f)
                close()
                moveTo(5.968f, 4.043f)
                lineToRelative(1.046f, 1.712f)
                curveToRelative(-0.536f, 0.429f, -1.012f, 0.927f, -1.422f, 1.478f)
                lineToRelative(-1.753f, -0.99f)
                curveToRelative(0.593f, -0.839f, 1.313f, -1.578f, 2.13f, -2.199f)
                close()
                moveTo(3.838f, 17.757f)
                lineToRelative(1.753f, -0.99f)
                curveToRelative(0.411f, 0.551f, 0.886f, 1.049f, 1.422f, 1.478f)
                lineToRelative(-1.045f, 1.712f)
                curveToRelative(-0.817f, -0.621f, -1.537f, -1.361f, -2.13f, -2.2f)
                close()
                moveTo(18.033f, 19.957f)
                lineToRelative(-1.045f, -1.712f)
                curveToRelative(0.536f, -0.429f, 1.012f, -0.927f, 1.422f, -1.478f)
                lineToRelative(1.753f, 0.99f)
                curveToRelative(-0.593f, 0.839f, -1.313f, 1.578f, -2.13f, 2.2f)
                close()
                moveTo(15.708f, 9.707f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _roulette!!
    }

private var _roulette: ImageVector? = null
