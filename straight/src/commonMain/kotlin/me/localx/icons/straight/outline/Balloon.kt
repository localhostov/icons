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
                curveToRelative(0.0f, 5.284f, 3.356f, 11.122f, 8.1f, 12.386f)
                curveToRelative(-0.449f, 0.681f, -0.725f, 1.525f, -0.725f, 2.236f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.0f, -0.711f, -0.276f, -1.555f, -0.725f, -2.236f)
                curveToRelative(4.745f, -1.264f, 8.1f, -7.103f, 8.1f, -12.386f)
                close()
                moveTo(12.0f, 20.015f)
                curveToRelative(-4.506f, 0.0f, -8.0f, -5.718f, -8.0f, -10.637f)
                curveToRelative(0.0f, -4.061f, 3.589f, -7.363f, 8.0f, -7.363f)
                reflectiveCurveToRelative(8.0f, 3.303f, 8.0f, 7.363f)
                curveToRelative(0.0f, 4.919f, -3.494f, 10.637f, -8.0f, 10.637f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(1.968f)
                curveToRelative(-0.161f, 2.324f, -1.259f, 4.346f, -2.295f, 5.501f)
                lineToRelative(-1.424f, -1.276f)
                curveToRelative(0.794f, -0.897f, 1.627f, -2.446f, 1.751f, -4.225f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
