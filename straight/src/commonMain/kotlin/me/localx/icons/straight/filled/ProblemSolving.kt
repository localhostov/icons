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

public val Icons.Filled.ProblemSolving: ImageVector
    get() {
        if (_problemSolving != null) {
            return _problemSolving!!
        }
        _problemSolving = Builder(name = "ProblemSolving", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.959f, 22.545f)
                lineToRelative(-2.792f, -2.792f)
                curveToRelative(0.524f, -0.791f, 0.833f, -1.736f, 0.833f, -2.753f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.017f, 0.0f, 1.962f, -0.309f, 2.753f, -0.833f)
                lineToRelative(2.792f, 2.792f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, -1.075f, 0.25f, -2.09f, 0.683f, -3.0f)
                horizontalLineToRelative(-1.683f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.408f)
                curveToRelative(1.223f, -2.039f, 3.449f, -3.408f, 6.0f, -3.408f)
                curveToRelative(0.183f, 0.0f, 0.362f, 0.014f, 0.542f, 0.027f)
                lineTo(12.619f, 1.531f)
                curveTo(12.063f, 0.573f, 11.07f, 0.0f, 9.962f, 0.0f)
                curveToRelative(-1.108f, 0.0f, -2.103f, 0.572f, -2.66f, 1.53f)
                lineTo(0.422f, 13.381f)
                curveToRelative(-0.56f, 0.962f, -0.562f, 2.113f, -0.007f, 3.078f)
                curveToRelative(0.556f, 0.965f, 1.552f, 1.541f, 2.664f, 1.541f)
                horizontalLineToRelative(7.001f)
                curveToRelative(-0.047f, -0.327f, -0.08f, -0.66f, -0.08f, -1.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _problemSolving!!
    }

private var _problemSolving: ImageVector? = null
