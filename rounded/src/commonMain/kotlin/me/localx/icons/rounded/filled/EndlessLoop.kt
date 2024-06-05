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

public val Icons.Filled.EndlessLoop: ImageVector
    get() {
        if (_endlessLoop != null) {
            return _endlessLoop!!
        }
        _endlessLoop = Builder(name = "EndlessLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.39f, 7.577f)
                curveToRelative(-0.511f, -0.212f, -1.095f, 0.028f, -1.309f, 0.537f)
                curveToRelative(-0.213f, 0.51f, 0.028f, 1.096f, 0.537f, 1.309f)
                curveToRelative(2.055f, 0.858f, 3.382f, 2.851f, 3.382f, 5.078f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(6.133f)
                curveToRelative(-0.033f, 0.04f, -0.061f, 0.082f, -0.098f, 0.119f)
                lineToRelative(-5.134f, 5.177f)
                curveToRelative(-0.389f, 0.392f, -0.386f, 1.025f, 0.006f, 1.414f)
                curveToRelative(0.195f, 0.193f, 0.45f, 0.29f, 0.704f, 0.29f)
                curveToRelative(0.257f, 0.0f, 0.515f, -0.099f, 0.71f, -0.296f)
                lineToRelative(5.131f, -5.174f)
                curveToRelative(0.676f, -0.676f, 1.048f, -1.574f, 1.048f, -2.53f)
                reflectiveCurveToRelative(-0.372f, -1.854f, -1.045f, -2.527f)
                lineTo(9.821f, 0.296f)
                curveToRelative(-0.388f, -0.392f, -1.022f, -0.394f, -1.414f, -0.006f)
                curveToRelative(-0.392f, 0.389f, -0.395f, 1.022f, -0.006f, 1.414f)
                lineToRelative(5.137f, 5.18f)
                curveToRelative(0.036f, 0.036f, 0.063f, 0.077f, 0.095f, 0.116f)
                horizontalLineToRelative(-6.133f)
                curveTo(3.364f, 7.0f, 0.0f, 10.364f, 0.0f, 14.5f)
                reflectiveCurveToRelative(3.364f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -3.036f, -1.81f, -5.753f, -4.61f, -6.923f)
                close()
            }
        }
        .build()
        return _endlessLoop!!
    }

private var _endlessLoop: ImageVector? = null
