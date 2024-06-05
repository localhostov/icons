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

public val Icons.Filled.Script: ImageVector
    get() {
        if (_script != null) {
            return _script!!
        }
        _script = Builder(name = "Script", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.27f, 6.48f)
                curveToRelative(-0.813f, 0.813f, -1.27f, 1.915f, -1.27f, 3.065f)
                verticalLineToRelative(1.455f)
                horizontalLineToRelative(1.455f)
                curveToRelative(1.15f, 0.0f, 2.252f, -0.457f, 3.065f, -1.27f)
                lineToRelative(5.807f, -5.807f)
                curveToRelative(0.897f, -0.897f, 0.897f, -2.353f, 0.0f, -3.25f)
                curveToRelative(-0.897f, -0.897f, -2.353f, -0.897f, -3.25f, 0.0f)
                lineToRelative(-5.807f, 5.807f)
                close()
                moveTo(3.0f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(23.992f, 21.168f)
                curveToRelative(-0.014f, 0.156f, -0.03f, 0.275f, -0.047f, 0.332f)
                curveToRelative(-0.43f, 1.446f, -1.77f, 2.5f, -3.355f, 2.5f)
                horizontalLineToRelative(-9.35f)
                curveToRelative(0.48f, -0.716f, 0.76f, -1.576f, 0.76f, -2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.498f)
                curveToRelative(1.17f, 0.0f, 2.099f, 1.003f, 1.993f, 2.168f)
                close()
                moveTo(20.0f, 10.078f)
                verticalLineToRelative(6.922f)
                horizontalLineToRelative(-5.499f)
                curveToRelative(-2.488f, 0.0f, -4.497f, 2.017f, -4.501f, 4.505f)
                curveToRelative(-0.003f, 1.48f, -1.292f, 2.659f, -2.81f, 2.477f)
                curveToRelative(-1.279f, -0.154f, -2.19f, -1.335f, -2.19f, -2.624f)
                lineTo(5.0f, 1.5f)
                curveToRelative(0.0f, -0.536f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(11.338f)
                curveToRelative(0.566f, 0.0f, 1.102f, 0.12f, 1.59f, 0.332f)
                lineToRelative(-4.734f, 4.734f)
                curveToRelative(-1.196f, 1.196f, -1.855f, 2.787f, -1.855f, 4.479f)
                verticalLineToRelative(3.455f)
                horizontalLineToRelative(3.455f)
                curveToRelative(1.691f, 0.0f, 3.282f, -0.659f, 4.479f, -1.855f)
                lineToRelative(1.066f, -1.066f)
                close()
            }
        }
        .build()
        return _script!!
    }

private var _script: ImageVector? = null
