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

public val Icons.Filled.DumbbellFitness: ImageVector
    get() {
        if (_dumbbellFitness != null) {
            return _dumbbellFitness!!
        }
        _dumbbellFitness = Builder(name = "DumbbellFitness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 0.0f)
                curveTo(5.467f, 0.0f, 3.0f, 2.467f, 3.0f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.467f, 5.5f, -5.5f)
                reflectiveCurveTo(11.533f, 0.0f, 8.5f, 0.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 20.857f)
                reflectiveCurveToRelative(-4.667f, 3.143f, -12.0f, 3.143f)
                reflectiveCurveTo(0.009f, 18.762f, 0.009f, 18.762f)
                curveTo(0.009f, 16.862f, 0.268f, 13.049f, 1.968f, 9.174f)
                curveToRelative(1.046f, 1.852f, 2.852f, 3.219f, 4.995f, 3.667f)
                curveToRelative(-0.098f, 1.184f, -0.293f, 2.329f, -0.676f, 3.293f)
                curveToRelative(1.402f, -1.282f, 3.836f, -3.133f, 6.213f, -3.133f)
                curveToRelative(2.125f, 0.0f, 4.122f, 1.94f, 4.14f, 1.96f)
                lineToRelative(1.492f, -1.332f)
                curveToRelative(-0.043f, -0.048f, -0.523f, -0.577f, -1.311f, -1.148f)
                curveToRelative(0.995f, -0.743f, 2.303f, -1.48f, 3.602f, -1.48f)
                curveToRelative(2.095f, 0.0f, 3.577f, 0.5f, 3.577f, 0.5f)
                verticalLineToRelative(9.357f)
                close()
            }
        }
        .build()
        return _dumbbellFitness!!
    }

private var _dumbbellFitness: ImageVector? = null
