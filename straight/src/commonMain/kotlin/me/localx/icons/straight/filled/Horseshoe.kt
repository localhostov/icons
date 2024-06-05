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

public val Icons.Filled.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) {
            return _horseshoe!!
        }
        _horseshoe = Builder(name = "Horseshoe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                curveToRelative(0.0f, -2.067f, -0.584f, -3.996f, -1.58f, -5.65f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.346f, -0.574f, -0.74f, -1.114f, -1.182f, -1.614f)
                curveTo(18.222f, 1.451f, 15.28f, 0.0f, 12.0f, 0.0f)
                curveTo(5.935f, 0.0f, 1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 4.162f, 1.591f, 8.74f, 2.492f, 11.0f)
                horizontalLineToRelative(-1.492f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.352f)
                reflectiveCurveToRelative(-2.352f, -9.0f, -2.352f, -13.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                curveToRelative(0.0f, 4.0f, -2.2f, 13.0f, -2.2f, 13.0f)
                horizontalLineToRelative(7.2f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.492f)
                curveToRelative(0.901f, -2.26f, 2.492f, -6.838f, 2.492f, -11.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                curveToRelative(0.0f, -1.841f, 0.558f, -3.554f, 1.511f, -4.982f)
                lineToRelative(1.63f, 1.164f)
                curveToRelative(-0.719f, 1.099f, -1.14f, 2.409f, -1.14f, 3.818f)
                close()
                moveTo(11.0f, 4.08f)
                curveToRelative(-1.335f, 0.192f, -2.549f, 0.758f, -3.531f, 1.594f)
                lineToRelative(-1.662f, -1.187f)
                curveToRelative(1.387f, -1.32f, 3.19f, -2.205f, 5.193f, -2.427f)
                verticalLineToRelative(2.021f)
                close()
                moveTo(16.531f, 5.674f)
                curveToRelative(-0.982f, -0.836f, -2.196f, -1.402f, -3.531f, -1.594f)
                lineTo(13.0f, 2.059f)
                curveToRelative(2.003f, 0.223f, 3.805f, 1.108f, 5.193f, 2.427f)
                lineToRelative(-1.662f, 1.187f)
                close()
                moveTo(17.86f, 7.183f)
                lineToRelative(1.63f, -1.164f)
                curveToRelative(0.953f, 1.428f, 1.511f, 3.14f, 1.511f, 4.982f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.408f, -0.422f, -2.719f, -1.14f, -3.818f)
                close()
            }
        }
        .build()
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
