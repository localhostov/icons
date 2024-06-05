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

public val Icons.Bold.HouseCrackAlt: ImageVector
    get() {
        if (_houseCrackAlt != null) {
            return _houseCrackAlt!!
        }
        _houseCrackAlt = Builder(name = "HouseCrackAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.653f)
                lineTo(15.076f, 0.94f)
                curveToRelative(-1.869f, -1.261f, -4.284f, -1.26f, -6.152f, 0.0f)
                lineTo(2.424f, 5.327f)
                curveToRelative(-1.518f, 1.024f, -2.424f, 2.728f, -2.424f, 4.559f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.651f, -0.742f, -3.195f, -2.0f, -4.234f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.616f)
                lineToRelative(-3.761f, -3.986f)
                lineToRelative(2.087f, -1.953f)
                curveToRelative(0.51f, -0.509f, 0.79f, -1.187f, 0.79f, -1.907f)
                reflectiveCurveToRelative(-0.28f, -1.398f, -0.76f, -1.875f)
                lineToRelative(-2.649f, -2.808f)
                curveToRelative(-0.568f, -0.602f, -1.517f, -0.63f, -2.12f, -0.062f)
                curveToRelative(-0.603f, 0.568f, -0.63f, 1.518f, -0.062f, 2.12f)
                lineToRelative(2.464f, 2.61f)
                lineToRelative(-2.087f, 1.954f)
                curveToRelative(-1.052f, 1.051f, -1.052f, 2.762f, -0.03f, 3.782f)
                lineToRelative(2.005f, 2.125f)
                horizontalLineToRelative(-6.26f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -0.832f, 0.412f, -1.607f, 1.102f, -2.073f)
                lineToRelative(6.5f, -4.386f)
                curveToRelative(0.425f, -0.287f, 0.912f, -0.43f, 1.398f, -0.43f)
                reflectiveCurveToRelative(0.974f, 0.144f, 1.398f, 0.43f)
                lineToRelative(6.5f, 4.387f)
                curveToRelative(0.689f, 0.465f, 1.102f, 1.24f, 1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                close()
            }
        }
        .build()
        return _houseCrackAlt!!
    }

private var _houseCrackAlt: ImageVector? = null
