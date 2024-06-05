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

public val Icons.Outline.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.378f)
                curveTo(22.0f, 4.215f, 17.514f, 0.015f, 12.0f, 0.015f)
                reflectiveCurveTo(2.0f, 4.215f, 2.0f, 9.378f)
                curveToRelative(0.0f, 5.287f, 3.362f, 11.119f, 8.111f, 12.379f)
                curveToRelative(-0.254f, 0.382f, -0.457f, 0.812f, -0.583f, 1.246f)
                curveToRelative(-0.145f, 0.499f, 0.239f, 0.998f, 0.759f, 0.998f)
                horizontalLineToRelative(3.424f)
                curveToRelative(0.52f, 0.0f, 0.905f, -0.498f, 0.759f, -0.998f)
                curveToRelative(-0.126f, -0.433f, -0.329f, -0.864f, -0.583f, -1.246f)
                curveToRelative(4.749f, -1.26f, 8.111f, -7.092f, 8.111f, -12.379f)
                close()
                moveTo(12.0f, 20.015f)
                curveToRelative(-4.506f, 0.0f, -8.0f, -5.718f, -8.0f, -10.637f)
                curveToRelative(0.0f, -4.061f, 3.589f, -7.363f, 8.0f, -7.363f)
                reflectiveCurveToRelative(8.0f, 3.303f, 8.0f, 7.363f)
                curveToRelative(0.0f, 4.919f, -3.494f, 10.637f, -8.0f, 10.637f)
                close()
                moveTo(16.813f, 11.137f)
                curveToRelative(-0.274f, 1.356f, -0.839f, 2.563f, -1.463f, 3.489f)
                curveToRelative(-0.328f, 0.488f, -1.005f, 0.582f, -1.442f, 0.19f)
                curveToRelative(-0.363f, -0.325f, -0.411f, -0.862f, -0.141f, -1.267f)
                curveToRelative(0.492f, -0.737f, 0.933f, -1.698f, 1.134f, -2.778f)
                curveToRelative(0.083f, -0.448f, 0.477f, -0.771f, 0.933f, -0.771f)
                horizontalLineToRelative(0.034f)
                curveToRelative(0.599f, 0.0f, 1.064f, 0.549f, 0.945f, 1.137f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
