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

public val Icons.Bold.BlockMicrophone: ImageVector
    get() {
        if (_blockMicrophone != null) {
            return _blockMicrophone!!
        }
        _blockMicrophone = Builder(name = "BlockMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.721f, 24.0f)
                horizontalLineToRelative(-2.221f)
                curveTo(4.71f, 24.0f, 0.0f, 19.29f, 0.0f, 13.5f)
                verticalLineToRelative(-0.5f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 4.136f, 3.364f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(0.087f)
                curveToRelative(0.471f, 1.162f, 1.208f, 2.185f, 2.134f, 3.0f)
                close()
                moveTo(10.036f, 18.714f)
                curveToRelative(-0.021f, -0.236f, -0.036f, -0.473f, -0.036f, -0.714f)
                curveToRelative(0.0f, -0.823f, 0.125f, -1.616f, 0.356f, -2.363f)
                curveToRelative(-1.385f, -0.629f, -2.356f, -2.019f, -2.356f, -3.637f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.13f)
                curveToRelative(1.147f, -0.636f, 2.466f, -1.0f, 3.87f, -1.0f)
                curveToRelative(0.339f, 0.0f, 0.672f, 0.028f, 1.0f, 0.069f)
                verticalLineToRelative(-3.069f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(5.0f, 3.14f, 5.0f, 7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.178f, 2.13f, 5.863f, 5.036f, 6.714f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(-0.267f, 0.0f, -0.521f, 0.046f, -0.767f, 0.112f)
                lineToRelative(3.655f, 3.656f)
                curveToRelative(0.066f, -0.246f, 0.112f, -0.5f, 0.112f, -0.767f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(0.267f, 0.0f, 0.521f, -0.046f, 0.767f, -0.112f)
                lineToRelative(-3.655f, -3.656f)
                curveToRelative(-0.066f, 0.246f, -0.112f, 0.5f, -0.112f, 0.767f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _blockMicrophone!!
    }

private var _blockMicrophone: ImageVector? = null
