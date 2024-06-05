package me.localx.icons.straight.bold

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

public val Icons.Bold.ModelCube: ImageVector
    get() {
        if (_modelCube != null) {
            return _modelCube!!
        }
        _modelCube = Builder(name = "ModelCube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.738f, -0.405f, 1.376f, -1.0f, 1.723f)
                verticalLineToRelative(3.387f)
                lineToRelative(-1.0f, 0.571f)
                lineToRelative(-1.0f, -0.571f)
                verticalLineToRelative(-3.387f)
                curveToRelative(-0.595f, -0.346f, -1.0f, -0.984f, -1.0f, -1.723f)
                close()
                moveTo(20.5f, 15.0f)
                curveToRelative(-0.362f, 0.0f, -0.697f, 0.104f, -0.99f, 0.272f)
                lineToRelative(-2.68f, -1.679f)
                lineToRelative(-1.015f, 0.544f)
                lineToRelative(-0.047f, 1.151f)
                lineToRelative(2.732f, 1.712f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.232f, 15.287f)
                lineToRelative(-0.047f, -1.151f)
                lineToRelative(-1.015f, -0.544f)
                lineToRelative(-2.68f, 1.679f)
                curveToRelative(-0.293f, -0.168f, -0.628f, -0.272f, -0.99f, -0.272f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(2.732f, -1.712f)
                close()
                moveTo(16.604f, 17.877f)
                lineToRelative(-3.104f, 1.773f)
                verticalLineToRelative(-6.78f)
                lineToRelative(5.993f, -3.424f)
                lineToRelative(-0.015f, 3.703f)
                curveToRelative(0.328f, -0.087f, 0.667f, -0.149f, 1.022f, -0.149f)
                curveToRelative(0.722f, 0.0f, 1.391f, 0.207f, 1.977f, 0.544f)
                lineToRelative(0.023f, -7.556f)
                lineToRelative(-6.526f, -3.73f)
                curveToRelative(-0.07f, 1.075f, -0.557f, 2.029f, -1.31f, 2.706f)
                lineToRelative(3.313f, 1.893f)
                lineToRelative(-5.977f, 3.415f)
                lineToRelative(-5.977f, -3.415f)
                lineToRelative(3.313f, -1.893f)
                curveToRelative(-0.753f, -0.678f, -1.24f, -1.631f, -1.31f, -2.706f)
                lineTo(1.5f, 5.987f)
                verticalLineToRelative(7.569f)
                curveToRelative(0.591f, -0.344f, 1.268f, -0.556f, 2.0f, -0.556f)
                curveToRelative(0.34f, 0.0f, 0.664f, 0.055f, 0.979f, 0.136f)
                lineToRelative(0.014f, -3.697f)
                lineToRelative(6.007f, 3.432f)
                verticalLineToRelative(6.817f)
                lineToRelative(-3.113f, -1.779f)
                curveToRelative(-0.24f, 1.026f, -0.872f, 1.899f, -1.734f, 2.453f)
                lineToRelative(6.315f, 3.62f)
                lineToRelative(6.357f, -3.633f)
                curveToRelative(-0.86f, -0.56f, -1.489f, -1.44f, -1.721f, -2.471f)
                close()
            }
        }
        .build()
        return _modelCube!!
    }

private var _modelCube: ImageVector? = null
