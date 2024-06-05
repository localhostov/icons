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

public val Icons.Filled.Bee: ImageVector
    get() {
        if (_bee != null) {
            return _bee!!
        }
        _bee = Builder(name = "Bee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.021f, 10.173f)
                curveToRelative(-1.242f, -1.269f, -5.38f, -2.089f, -9.841f, -2.165f)
                curveToRelative(1.07f, -0.458f, 1.82f, -1.52f, 1.82f, -2.758f)
                curveToRelative(0.0f, -1.004f, -0.498f, -1.888f, -1.256f, -2.433f)
                curveToRelative(0.448f, -0.438f, 1.141f, -0.817f, 2.256f, -0.817f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-1.954f, 0.0f, -3.225f, 0.811f, -4.0f, 1.754f)
                curveToRelative(-0.775f, -0.943f, -2.046f, -1.754f, -4.0f, -1.754f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(1.112f, 0.0f, 1.805f, 0.379f, 2.253f, 0.82f)
                curveToRelative(-0.756f, 0.545f, -1.253f, 1.427f, -1.253f, 2.43f)
                curveToRelative(0.0f, 1.238f, 0.75f, 2.299f, 1.82f, 2.758f)
                curveToRelative(-4.461f, 0.076f, -8.599f, 0.896f, -9.841f, 2.165f)
                curveToRelative(-1.305f, 1.333f, -1.305f, 3.494f, 0.0f, 4.828f)
                reflectiveCurveToRelative(3.421f, 1.333f, 4.726f, 0.0f)
                curveToRelative(0.619f, -0.632f, 1.603f, -1.763f, 2.633f, -3.0f)
                horizontalLineToRelative(7.326f)
                curveToRelative(1.029f, 1.237f, 2.014f, 2.368f, 2.633f, 3.0f)
                curveToRelative(1.305f, 1.333f, 3.421f, 1.333f, 4.726f, 0.0f)
                reflectiveCurveToRelative(1.305f, -3.495f, 0.0f, -4.828f)
                close()
                moveTo(9.962f, 10.0f)
                curveToRelative(0.518f, -0.652f, 0.996f, -1.272f, 1.403f, -1.82f)
                curveToRelative(0.205f, 0.044f, 0.417f, 0.07f, 0.635f, 0.07f)
                reflectiveCurveToRelative(0.43f, -0.026f, 0.635f, -0.07f)
                curveToRelative(0.406f, 0.548f, 0.885f, 1.168f, 1.403f, 1.82f)
                horizontalLineToRelative(-4.075f)
                close()
                moveTo(8.542f, 18.0f)
                horizontalLineToRelative(6.914f)
                curveToRelative(-0.183f, 0.68f, -0.401f, 1.357f, -0.638f, 2.0f)
                horizontalLineToRelative(-5.637f)
                curveToRelative(-0.238f, -0.643f, -0.455f, -1.32f, -0.638f, -2.0f)
                close()
                moveTo(7.999f, 14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.471f, -0.046f, 0.977f, -0.122f, 1.5f)
                horizontalLineToRelative(-7.756f)
                curveToRelative(-0.076f, -0.523f, -0.122f, -1.029f, -0.122f, -1.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(10.032f, 22.0f)
                horizontalLineToRelative(3.935f)
                curveToRelative(-0.261f, 0.533f, -0.522f, 0.999f, -0.764f, 1.358f)
                curveToRelative(-0.289f, 0.428f, -0.746f, 0.642f, -1.204f, 0.642f)
                reflectiveCurveToRelative(-0.915f, -0.214f, -1.204f, -0.642f)
                curveToRelative(-0.242f, -0.358f, -0.502f, -0.824f, -0.764f, -1.358f)
                close()
            }
        }
        .build()
        return _bee!!
    }

private var _bee: ImageVector? = null
