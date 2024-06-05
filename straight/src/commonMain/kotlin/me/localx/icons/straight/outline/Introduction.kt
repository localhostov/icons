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

public val Icons.Outline.Introduction: ImageVector
    get() {
        if (_introduction != null) {
            return _introduction!!
        }
        _introduction = Builder(name = "Introduction", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(4.0f, 9.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                close()
                moveTo(6.0f, 9.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                lineTo(2.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(24.0f, 2.5f)
                verticalLineToRelative(6.499f)
                lineToRelative(-5.572f, 0.006f)
                lineToRelative(-1.673f, 1.712f)
                curveToRelative(-0.293f, 0.188f, -0.628f, 0.281f, -0.964f, 0.281f)
                curveToRelative(-0.295f, 0.0f, -0.591f, -0.072f, -0.859f, -0.22f)
                curveToRelative(-0.574f, -0.313f, -0.931f, -0.915f, -0.931f, -1.568f)
                lineTo(14.001f, 2.503f)
                curveTo(13.999f, 1.126f, 15.12f, 0.004f, 16.498f, 0.002f)
                lineToRelative(5.001f, -0.002f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.666f, 0.0f, 1.293f, 0.26f, 1.765f, 0.73f)
                curveToRelative(0.473f, 0.473f, 0.733f, 1.101f, 0.733f, 1.77f)
                close()
                moveTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.181f, -0.092f, -0.3f, -0.146f, -0.354f)
                reflectiveCurveToRelative(-0.173f, -0.146f, -0.352f, -0.146f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-5.001f, 0.002f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(6.149f)
                reflectiveCurveToRelative(1.572f, -1.646f, 1.572f, -1.646f)
                lineToRelative(4.428f, -0.004f)
                lineTo(22.001f, 2.5f)
                close()
            }
        }
        .build()
        return _introduction!!
    }

private var _introduction: ImageVector? = null
