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

public val Icons.Filled.Lobster: ImageVector
    get() {
        if (_lobster != null) {
            return _lobster!!
        }
        _lobster = Builder(name = "Lobster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 5.0f)
                curveToRelative(-0.011f, 0.117f, 0.0f, -0.105f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 5.0f)
                curveToRelative(0.0f, 1.448f, -1.026f, 2.656f, -2.392f, 2.938f)
                curveToRelative(-0.759f, 1.797f, -2.538f, 3.062f, -4.608f, 3.062f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.843f)
                curveToRelative(1.336f, 0.0f, 2.592f, 0.521f, 3.536f, 1.465f)
                lineToRelative(0.828f, 0.828f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-0.828f, -0.828f)
                curveToRelative(-0.566f, -0.566f, -1.32f, -0.879f, -2.122f, -0.879f)
                horizontalLineToRelative(-0.843f)
                reflectiveCurveToRelative(-0.003f, 3.508f, -0.003f, 3.513f)
                lineToRelative(1.401f, 1.401f)
                curveToRelative(0.497f, 0.496f, 0.602f, 1.02f, 0.602f, 1.371f)
                curveToRelative(0.0f, 0.537f, -0.235f, 1.057f, -0.681f, 1.502f)
                curveToRelative(-0.682f, 0.683f, -1.85f, 1.246f, -3.106f, 1.246f)
                curveToRelative(-0.733f, 0.0f, -1.497f, -0.192f, -2.213f, -0.665f)
                curveToRelative(-1.942f, 1.282f, -4.24f, 0.499f, -5.319f, -0.581f)
                curveToRelative(-0.445f, -0.445f, -0.681f, -0.965f, -0.681f, -1.502f)
                curveToRelative(0.0f, -0.352f, 0.104f, -0.875f, 0.603f, -1.372f)
                lineToRelative(1.4f, -1.4f)
                reflectiveCurveToRelative(-0.003f, -3.513f, -0.003f, -3.513f)
                horizontalLineToRelative(-0.843f)
                curveToRelative(-0.802f, 0.0f, -1.556f, 0.312f, -2.122f, 0.879f)
                lineToRelative(-0.828f, 0.828f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(0.828f, -0.828f)
                curveToRelative(0.944f, -0.944f, 2.2f, -1.465f, 3.536f, -1.465f)
                horizontalLineToRelative(0.843f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.07f, 0.0f, -3.85f, -1.265f, -4.608f, -3.062f)
                curveToRelative(-1.365f, -0.281f, -2.392f, -1.489f, -2.392f, -2.938f)
                curveTo(0.0f, 4.046f, 0.498f, 1.502f, 0.92f, 0.39f)
                curveToRelative(0.193f, -0.508f, 0.897f, -0.522f, 1.123f, -0.029f)
                curveToRelative(0.305f, 0.664f, 0.531f, 1.666f, 0.957f, 2.57f)
                curveToRelative(0.426f, -0.904f, 0.652f, -1.905f, 0.957f, -2.57f)
                curveToRelative(0.227f, -0.493f, 0.931f, -0.479f, 1.123f, 0.029f)
                curveToRelative(0.422f, 1.112f, 0.92f, 3.656f, 0.92f, 4.61f)
                curveToRelative(0.0f, 1.119f, -0.62f, 2.084f, -1.529f, 2.599f)
                curveToRelative(0.532f, 0.839f, 1.464f, 1.401f, 2.529f, 1.401f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.2f)
                curveToRelative(0.0f, -2.765f, 2.094f, -5.8f, 4.0f, -5.8f)
                reflectiveCurveToRelative(4.0f, 3.035f, 4.0f, 5.8f)
                verticalLineToRelative(3.2f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.065f, 0.0f, 1.996f, -0.562f, 2.529f, -1.401f)
                curveToRelative(-0.909f, -0.516f, -1.529f, -1.48f, -1.529f, -2.599f)
                curveToRelative(0.0f, -1.333f, 0.539f, -3.607f, 0.92f, -4.61f)
                curveToRelative(0.1f, -0.265f, 0.339f, -0.388f, 0.577f, -0.382f)
                curveToRelative(0.0f, 0.0f, 0.003f, -0.008f, 0.003f, -0.008f)
                curveToRelative(0.0f, 0.0f, 0.003f, 0.008f, 0.003f, 0.009f)
                curveToRelative(0.217f, 0.007f, 0.433f, 0.118f, 0.54f, 0.352f)
                curveToRelative(0.305f, 0.664f, 0.531f, 1.666f, 0.957f, 2.57f)
                curveToRelative(0.426f, -0.904f, 0.652f, -1.905f, 0.957f, -2.57f)
                curveToRelative(0.107f, -0.234f, 0.324f, -0.345f, 0.54f, -0.352f)
                curveToRelative(0.0f, 0.0f, 0.003f, -0.009f, 0.003f, -0.009f)
                curveToRelative(0.0f, 0.0f, 0.003f, 0.006f, 0.003f, 0.008f)
                curveToRelative(0.238f, -0.005f, 0.477f, 0.118f, 0.577f, 0.382f)
                curveToRelative(0.381f, 1.004f, 0.92f, 3.251f, 0.92f, 4.61f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _lobster!!
    }

private var _lobster: ImageVector? = null
