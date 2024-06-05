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

public val Icons.Outline.Tap: ImageVector
    get() {
        if (_tap != null) {
            return _tap!!
        }
        _tap = Builder(name = "Tap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 11.89f)
                curveToRelative(-1.235f, -1.263f, -2.0f, -2.988f, -2.0f, -4.89f)
                curveTo(2.0f, 3.14f, 5.14f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.902f, -0.765f, 3.627f, -2.0f, 4.89f)
                verticalLineToRelative(-4.89f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(4.89f)
                close()
                moveTo(12.0f, 13.181f)
                verticalLineToRelative(-6.073f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.834f, -2.503f, -3.066f)
                curveToRelative(-0.879f, -0.145f, -1.768f, 0.102f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.057f, 1.404f, -1.057f, 2.286f)
                verticalLineToRelative(11.566f)
                lineToRelative(-0.955f, -0.759f)
                curveToRelative(-1.208f, -1.127f, -3.107f, -1.062f, -4.237f, 0.144f)
                curveToRelative(-1.128f, 1.208f, -1.065f, 3.11f, 0.131f, 4.231f)
                lineToRelative(1.885f, 1.818f)
                horizontalLineToRelative(2.881f)
                lineToRelative(-3.389f, -3.267f)
                curveToRelative(-0.403f, -0.378f, -0.424f, -1.013f, -0.047f, -1.417f)
                curveToRelative(0.375f, -0.402f, 1.007f, -0.424f, 1.47f, 0.004f)
                lineToRelative(4.26f, 3.392f)
                lineTo(8.0f, 7.0f)
                curveToRelative(0.0f, -0.294f, 0.128f, -0.572f, 0.353f, -0.762f)
                curveToRelative(0.227f, -0.193f, 0.518f, -0.273f, 0.823f, -0.224f)
                curveToRelative(0.462f, 0.076f, 0.825f, 0.556f, 0.825f, 1.093f)
                verticalLineToRelative(7.713f)
                lineToRelative(10.0f, 2.0f)
                verticalLineToRelative(7.18f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.82f)
                lineToRelative(-10.0f, -2.0f)
                close()
            }
        }
        .build()
        return _tap!!
    }

private var _tap: ImageVector? = null
