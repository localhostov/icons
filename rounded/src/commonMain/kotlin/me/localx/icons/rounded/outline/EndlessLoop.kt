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

public val Icons.Outline.EndlessLoop: ImageVector
    get() {
        if (_endlessLoop != null) {
            return _endlessLoop!!
        }
        _endlessLoop = Builder(name = "EndlessLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.364f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(6.133f)
                curveToRelative(-0.032f, -0.039f, -0.059f, -0.08f, -0.095f, -0.116f)
                lineTo(8.401f, 1.704f)
                curveToRelative(-0.389f, -0.392f, -0.386f, -1.025f, 0.006f, -1.414f)
                curveToRelative(0.392f, -0.388f, 1.026f, -0.386f, 1.414f, 0.006f)
                lineToRelative(5.134f, 5.177f)
                curveToRelative(0.673f, 0.673f, 1.045f, 1.571f, 1.045f, 2.527f)
                reflectiveCurveToRelative(-0.372f, 1.854f, -1.048f, 2.53f)
                lineToRelative(-5.131f, 5.174f)
                curveToRelative(-0.195f, 0.197f, -0.453f, 0.296f, -0.71f, 0.296f)
                curveToRelative(-0.254f, 0.0f, -0.509f, -0.097f, -0.704f, -0.29f)
                curveToRelative(-0.392f, -0.389f, -0.395f, -1.022f, -0.006f, -1.414f)
                lineToRelative(5.134f, -5.177f)
                curveToRelative(0.037f, -0.037f, 0.065f, -0.079f, 0.098f, -0.119f)
                horizontalLineToRelative(-6.133f)
                curveToRelative(-3.033f, 0.0f, -5.5f, 2.467f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                curveToRelative(0.0f, -2.227f, -1.327f, -4.22f, -3.382f, -5.078f)
                curveToRelative(-0.509f, -0.213f, -0.75f, -0.799f, -0.537f, -1.309f)
                curveToRelative(0.214f, -0.509f, 0.797f, -0.749f, 1.309f, -0.537f)
                curveToRelative(2.801f, 1.17f, 4.61f, 3.888f, 4.61f, 6.923f)
                close()
            }
        }
        .build()
        return _endlessLoop!!
    }

private var _endlessLoop: ImageVector? = null
