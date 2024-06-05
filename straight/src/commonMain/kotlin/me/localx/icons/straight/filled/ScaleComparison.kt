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

public val Icons.Filled.ScaleComparison: ImageVector
    get() {
        if (_scaleComparison != null) {
            return _scaleComparison!!
        }
        _scaleComparison = Builder(name = "ScaleComparison", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 5.5f)
                curveToRelative(0.0f, -0.768f, -0.355f, -1.447f, -0.901f, -1.906f)
                curveToRelative(0.252f, -0.369f, 0.401f, -0.814f, 0.401f, -1.294f)
                curveToRelative(0.0f, -1.269f, -1.031f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.2f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(19.6f, 1.6f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.386f, 0.0f, 0.7f, 0.314f, 0.7f, 0.7f)
                reflectiveCurveToRelative(-0.314f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(-1.4f)
                close()
                moveTo(19.6f, 4.6f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.496f, 0.0f, 0.9f, 0.404f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.404f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                close()
                moveTo(3.194f, 9.6f)
                horizontalLineToRelative(2.379f)
                lineToRelative(0.295f, 1.4f)
                horizontalLineToRelative(1.632f)
                lineToRelative(-1.339f, -6.373f)
                curveToRelative(-0.135f, -0.668f, -0.523f, -1.213f, -1.035f, -1.459f)
                curveToRelative(-0.232f, -0.112f, -0.476f, -0.168f, -0.718f, -0.168f)
                curveToRelative(-0.282f, 0.0f, -0.561f, 0.075f, -0.816f, 0.225f)
                curveToRelative(-0.471f, 0.277f, -0.809f, 0.776f, -0.926f, 1.356f)
                lineToRelative(-1.365f, 6.418f)
                horizontalLineToRelative(1.584f)
                lineToRelative(0.309f, -1.4f)
                close()
                moveTo(4.234f, 4.897f)
                curveToRelative(0.03f, -0.149f, 0.105f, -0.253f, 0.176f, -0.296f)
                lineToRelative(0.017f, 0.006f)
                curveToRelative(0.024f, 0.016f, 0.121f, 0.118f, 0.168f, 0.349f)
                lineToRelative(0.641f, 3.044f)
                horizontalLineToRelative(-1.688f)
                lineToRelative(0.686f, -3.104f)
                close()
                moveTo(24.0f, 9.164f)
                lineTo(0.0f, 13.735f)
                verticalLineToRelative(2.029f)
                lineToRelative(10.709f, -2.04f)
                lineToRelative(-2.663f, 8.476f)
                lineToRelative(-0.046f, 1.8f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-2.868f, -9.238f)
                lineToRelative(10.868f, -2.07f)
                verticalLineToRelative(-2.029f)
                close()
            }
        }
        .build()
        return _scaleComparison!!
    }

private var _scaleComparison: ImageVector? = null
