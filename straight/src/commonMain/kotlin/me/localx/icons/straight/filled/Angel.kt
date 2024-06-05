package me.localx.icons.straight.filled

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

public val Icons.Filled.Angel: ImageVector
    get() {
        if (_angel != null) {
            return _angel!!
        }
        _angel = Builder(name = "Angel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 5.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(4.039f, 24.0f)
                horizontalLineToRelative(15.927f)
                lineToRelative(-6.31f, -14.302f)
                curveToRelative(-0.007f, 0.008f, -0.014f, 0.017f, -0.021f, 0.024f)
                curveToRelative(-1.054f, 0.366f, -2.202f, 0.367f, -3.257f, 0.005f)
                lineToRelative(-6.34f, 14.273f)
                close()
                moveTo(20.5f, 6.0f)
                curveToRelative(-2.168f, 0.0f, -4.045f, 1.145f, -5.317f, 2.203f)
                lineToRelative(4.763f, 10.797f)
                horizontalLineToRelative(2.054f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.007f, -0.341f, -10.0f, -3.5f, -10.0f)
                close()
                moveTo(3.5f, 6.0f)
                curveTo(0.341f, 6.0f, 0.0f, 12.993f, 0.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.071f)
                lineToRelative(4.783f, -10.767f)
                curveToRelative(-1.273f, -1.066f, -3.165f, -2.233f, -5.353f, -2.233f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-2.851f, 0.0f, -5.0f, 1.29f, -5.0f, 3.0f)
                curveToRelative(0.0f, 0.722f, 0.4f, 1.36f, 1.057f, 1.867f)
                curveToRelative(0.116f, -0.7f, 0.415f, -1.337f, 0.843f, -1.867f)
                curveToRelative(0.0f, 0.0f, 0.599f, -1.0f, 3.099f, -1.0f)
                reflectiveCurveToRelative(3.099f, 1.0f, 3.099f, 1.0f)
                curveToRelative(0.428f, 0.53f, 0.727f, 1.167f, 0.843f, 1.867f)
                curveToRelative(0.657f, -0.507f, 1.057f, -1.145f, 1.057f, -1.867f)
                curveToRelative(0.0f, -1.71f, -2.149f, -3.0f, -5.0f, -3.0f)
                close()
            }
        }
        .build()
        return _angel!!
    }

private var _angel: ImageVector? = null
