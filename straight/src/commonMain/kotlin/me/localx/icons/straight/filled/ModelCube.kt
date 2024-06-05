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

public val Icons.Filled.ModelCube: ImageVector
    get() {
        if (_modelCube != null) {
            return _modelCube!!
        }
        _modelCube = Builder(name = "ModelCube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 2.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(20.5f, 15.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(1.5f, 17.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(1.5f, 13.556f)
                curveToRelative(0.591f, -0.344f, 1.268f, -0.556f, 2.0f, -0.556f)
                curveToRelative(1.088f, 0.0f, 2.074f, 0.439f, 2.795f, 1.146f)
                lineToRelative(1.638f, -1.024f)
                lineToRelative(1.015f, 0.544f)
                lineToRelative(0.047f, 1.151f)
                lineToRelative(-1.679f, 1.049f)
                curveToRelative(0.108f, 0.362f, 0.183f, 0.737f, 0.183f, 1.133f)
                curveToRelative(0.0f, 1.412f, -0.739f, 2.648f, -1.846f, 3.36f)
                lineToRelative(5.346f, 3.066f)
                verticalLineToRelative(-10.846f)
                lineTo(1.5f, 7.152f)
                verticalLineToRelative(6.405f)
                close()
                moveTo(13.0f, 12.58f)
                verticalLineToRelative(10.838f)
                lineToRelative(5.296f, -3.085f)
                curveToRelative(-1.081f, -0.717f, -1.796f, -1.942f, -1.796f, -3.333f)
                curveToRelative(0.0f, -0.396f, 0.076f, -0.772f, 0.183f, -1.133f)
                lineToRelative(-1.679f, -1.049f)
                lineToRelative(0.047f, -1.151f)
                lineToRelative(1.015f, -0.544f)
                lineToRelative(1.638f, 1.024f)
                curveToRelative(0.722f, -0.707f, 1.707f, -1.146f, 2.795f, -1.146f)
                curveToRelative(0.732f, 0.0f, 1.409f, 0.212f, 2.0f, 0.556f)
                verticalLineToRelative(-6.405f)
                lineToRelative(-9.5f, 5.428f)
                close()
                moveTo(15.976f, 2.241f)
                curveToRelative(-0.107f, 1.749f, -1.336f, 3.187f, -2.976f, 3.616f)
                verticalLineToRelative(2.341f)
                lineToRelative(-1.0f, 0.571f)
                lineToRelative(-1.0f, -0.571f)
                verticalLineToRelative(-2.341f)
                curveToRelative(-1.634f, -0.427f, -2.86f, -1.857f, -2.974f, -3.598f)
                lineToRelative(-5.52f, 3.165f)
                lineToRelative(9.494f, 5.425f)
                lineToRelative(9.497f, -5.427f)
                lineToRelative(-5.521f, -3.181f)
                close()
            }
        }
        .build()
        return _modelCube!!
    }

private var _modelCube: ImageVector? = null
