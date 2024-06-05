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

public val Icons.Filled.CircleS: ImageVector
    get() {
        if (_circleS != null) {
            return _circleS!!
        }
        _circleS = Builder(name = "CircleS", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.902f, 18.0f)
                horizontalLineToRelative(-3.902f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.902f)
                curveToRelative(0.655f, 0.0f, 1.188f, -0.533f, 1.188f, -1.188f)
                curveToRelative(0.0f, -0.526f, -0.354f, -0.996f, -0.859f, -1.142f)
                lineToRelative(-5.008f, -1.421f)
                curveToRelative(-1.362f, -0.387f, -2.314f, -1.646f, -2.314f, -3.064f)
                curveToRelative(0.0f, -1.756f, 1.429f, -3.185f, 3.185f, -3.185f)
                horizontalLineToRelative(3.906f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.906f)
                curveToRelative(-0.653f, 0.0f, -1.185f, 0.531f, -1.185f, 1.185f)
                curveToRelative(0.0f, 0.527f, 0.354f, 0.997f, 0.861f, 1.141f)
                lineToRelative(5.011f, 1.422f)
                curveToRelative(1.361f, 0.392f, 2.31f, 1.651f, 2.31f, 3.064f)
                curveToRelative(0.0f, 1.758f, -1.431f, 3.188f, -3.188f, 3.188f)
                close()
            }
        }
        .build()
        return _circleS!!
    }

private var _circleS: ImageVector? = null
