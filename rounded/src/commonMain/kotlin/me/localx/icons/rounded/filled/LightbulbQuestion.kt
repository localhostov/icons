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

public val Icons.Filled.LightbulbQuestion: ImageVector
    get() {
        if (_lightbulbQuestion != null) {
            return _lightbulbQuestion!!
        }
        _lightbulbQuestion = Builder(name = "LightbulbQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 19.998f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 2.035f, -1.655f, 3.69f, -3.69f, 3.69f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-2.035f, 0.0f, -3.69f, -1.655f, -3.69f, -3.69f)
                verticalLineToRelative(-0.31f)
                close()
                moveTo(21.0f, 8.998f)
                curveToRelative(0.0f, 2.59f, -1.118f, 5.055f, -3.068f, 6.763f)
                curveToRelative(-0.739f, 0.648f, -1.275f, 1.413f, -1.594f, 2.237f)
                horizontalLineToRelative(-0.838f)
                verticalLineToRelative(0.002f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(-0.937f)
                curveToRelative(-0.358f, -0.877f, -0.926f, -1.702f, -1.695f, -2.417f)
                curveToRelative(-2.149f, -2.001f, -3.167f, -4.83f, -2.793f, -7.761f)
                curveTo(3.59f, 3.78f, 6.904f, 0.515f, 10.956f, 0.057f)
                curveToRelative(2.567f, -0.289f, 5.13f, 0.522f, 7.038f, 2.227f)
                curveToRelative(1.91f, 1.707f, 3.006f, 4.154f, 3.006f, 6.714f)
                close()
                moveTo(13.5f, 13.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(14.953f, 6.466f)
                curveToRelative(-0.212f, -1.212f, -1.207f, -2.207f, -2.417f, -2.418f)
                curveToRelative(-0.886f, -0.162f, -1.783f, 0.081f, -2.464f, 0.653f)
                curveToRelative(-0.682f, 0.572f, -1.072f, 1.41f, -1.072f, 2.299f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.297f, 0.131f, -0.576f, 0.358f, -0.767f)
                curveToRelative(0.229f, -0.194f, 0.522f, -0.273f, 0.832f, -0.216f)
                curveToRelative(0.391f, 0.068f, 0.724f, 0.401f, 0.793f, 0.794f)
                curveToRelative(0.093f, 0.53f, -0.213f, 0.905f, -0.502f, 1.065f)
                curveToRelative(-0.443f, 0.244f, -1.481f, 0.815f, -1.481f, 2.123f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.053f, 0.0f, -0.125f, 0.447f, -0.371f)
                curveToRelative(1.125f, -0.621f, 1.729f, -1.893f, 1.506f, -3.163f)
                close()
            }
        }
        .build()
        return _lightbulbQuestion!!
    }

private var _lightbulbQuestion: ImageVector? = null
