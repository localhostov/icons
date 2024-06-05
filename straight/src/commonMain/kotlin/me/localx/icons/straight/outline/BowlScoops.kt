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

public val Icons.Outline.BowlScoops: ImageVector
    get() {
        if (_bowlScoops != null) {
            return _bowlScoops!!
        }
        _bowlScoops = Builder(name = "BowlScoops", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 13.0f)
                lineToRelative(1.413f, 3.584f)
                curveToRelative(1.376f, 2.208f, 3.698f, 2.416f, 5.908f, 2.416f)
                curveToRelative(0.298f, 0.0f, 2.655f, 0.005f, 3.68f, 0.002f)
                verticalLineToRelative(2.998f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.998f)
                curveToRelative(1.024f, 0.003f, 2.457f, 0.009f, 2.797f, 0.013f)
                curveToRelative(2.464f, 0.029f, 5.234f, 0.064f, 6.791f, -2.432f)
                lineToRelative(1.412f, -3.584f)
                lineTo(0.0f, 12.999f)
                close()
                moveTo(20.844f, 15.6f)
                curveToRelative(-0.87f, 1.32f, -2.28f, 1.45f, -5.021f, 1.416f)
                curveToRelative(-0.496f, -0.007f, -7.151f, -0.007f, -7.646f, 0.0f)
                curveToRelative(-2.84f, 0.035f, -4.186f, -0.149f, -5.02f, -1.416f)
                lineToRelative(-0.233f, -0.6f)
                horizontalLineToRelative(18.152f)
                lineToRelative(-0.232f, 0.6f)
                close()
                moveTo(6.5f, 7.0f)
                curveToRelative(2.31f, 0.0f, 4.197f, 1.756f, 4.449f, 4.0f)
                horizontalLineToRelative(2.101f)
                curveToRelative(0.252f, -2.244f, 2.139f, -4.0f, 4.449f, -4.0f)
                reflectiveCurveToRelative(4.197f, 1.756f, 4.449f, 4.0f)
                horizontalLineToRelative(2.025f)
                curveToRelative(-0.236f, -3.072f, -2.611f, -5.554f, -5.637f, -5.946f)
                curveToRelative(-0.659f, -2.89f, -3.25f, -5.054f, -6.338f, -5.054f)
                reflectiveCurveToRelative(-5.679f, 2.164f, -6.338f, 5.054f)
                curveTo(2.637f, 5.446f, 0.261f, 7.928f, 0.025f, 11.0f)
                horizontalLineToRelative(2.025f)
                curveToRelative(0.252f, -2.244f, 2.139f, -4.0f, 4.449f, -4.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.999f, 0.0f, 3.697f, 1.31f, 4.282f, 3.116f)
                curveToRelative(-1.8f, 0.344f, -3.338f, 1.436f, -4.282f, 2.936f)
                curveToRelative(-0.944f, -1.501f, -2.481f, -2.592f, -4.282f, -2.936f)
                curveToRelative(0.585f, -1.806f, 2.283f, -3.116f, 4.282f, -3.116f)
                close()
            }
        }
        .build()
        return _bowlScoops!!
    }

private var _bowlScoops: ImageVector? = null
