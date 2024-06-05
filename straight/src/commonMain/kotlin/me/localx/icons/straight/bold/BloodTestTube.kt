package me.localx.icons.straight.bold

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

public val Icons.Bold.BloodTestTube: ImageVector
    get() {
        if (_bloodTestTube != null) {
            return _bloodTestTube!!
        }
        _bloodTestTube = Builder(name = "BloodTestTube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 18.226f)
                verticalLineToRelative(0.774f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.867f)
                curveToRelative(0.342f, -0.649f, 0.784f, -1.258f, 1.329f, -1.803f)
                lineToRelative(1.804f, -1.764f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(15.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 3.077f, 2.308f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.08f, 0.0f, 3.865f, -1.279f, 4.617f, -3.09f)
                curveToRelative(-0.509f, -0.309f, -0.988f, -0.674f, -1.42f, -1.105f)
                curveToRelative(-0.481f, -0.481f, -0.875f, -1.015f, -1.197f, -1.579f)
                close()
                moveTo(11.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(21.377f, 10.599f)
                lineToRelative(-3.877f, -3.792f)
                lineToRelative(-3.89f, 3.804f)
                curveToRelative(-2.144f, 2.145f, -2.144f, 5.634f, 0.0f, 7.778f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.04f, 1.039f, 2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.85f, -0.572f, 3.89f, -1.611f)
                curveToRelative(2.144f, -2.145f, 2.144f, -5.634f, -0.012f, -7.79f)
                close()
                moveTo(19.268f, 16.267f)
                curveToRelative(-0.944f, 0.944f, -2.592f, 0.944f, -3.536f, 0.0f)
                curveToRelative(-0.974f, -0.975f, -0.974f, -2.561f, -0.012f, -3.524f)
                lineToRelative(1.78f, -1.74f)
                lineToRelative(1.768f, 1.729f)
                curveToRelative(0.975f, 0.975f, 0.975f, 2.561f, 0.0f, 3.536f)
                close()
            }
        }
        .build()
        return _bloodTestTube!!
    }

private var _bloodTestTube: ImageVector? = null
