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
                lineTo(16.0f, 0.0f)
                curveToRelative(-1.954f, 0.0f, -3.225f, 0.811f, -4.0f, 1.754f)
                curveToRelative(-0.775f, -0.943f, -2.046f, -1.754f, -4.0f, -1.754f)
                verticalLineToRelative(2.0f)
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
                moveTo(7.555f, 14.0f)
                horizontalLineToRelative(8.888f)
                curveToRelative(-0.07f, 0.666f, -0.21f, 1.336f, -0.39f, 2.0f)
                lineTo(7.946f, 16.0f)
                curveToRelative(-0.181f, -0.664f, -0.32f, -1.334f, -0.39f, -2.0f)
                close()
                moveTo(8.625f, 18.0f)
                horizontalLineToRelative(6.748f)
                curveToRelative(-0.282f, 0.701f, -0.592f, 1.375f, -0.912f, 2.0f)
                horizontalLineToRelative(-4.924f)
                curveToRelative(-0.32f, -0.625f, -0.63f, -1.299f, -0.912f, -2.0f)
                close()
                moveTo(10.66f, 22.0f)
                horizontalLineToRelative(2.677f)
                curveToRelative(-0.75f, 1.224f, -1.339f, 2.0f, -1.339f, 2.0f)
                curveToRelative(0.0f, 0.0f, -0.589f, -0.776f, -1.339f, -2.0f)
                close()
            }
        }
        .build()
        return _bee!!
    }

private var _bee: ImageVector? = null
