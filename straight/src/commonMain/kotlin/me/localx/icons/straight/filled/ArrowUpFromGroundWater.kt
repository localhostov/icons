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

public val Icons.Filled.ArrowUpFromGroundWater: ImageVector
    get() {
        if (_arrowUpFromGroundWater != null) {
            return _arrowUpFromGroundWater!!
        }
        _arrowUpFromGroundWater = Builder(name = "ArrowUpFromGroundWater", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 3.012f)
                lineToRelative(-2.75f, 2.738f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.779f, -0.78f, 2.049f, -0.78f, 2.828f, 0.0f)
                lineToRelative(3.785f, 3.699f)
                lineToRelative(-1.398f, 1.431f)
                lineToRelative(-2.801f, -2.737f)
                verticalLineToRelative(6.022f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 21.858f)
                verticalLineToRelative(-2.14f)
                curveToRelative(-0.302f, 0.177f, -0.643f, 0.282f, -1.0f, 0.282f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.357f, 0.0f, -0.698f, -0.106f, -1.0f, -0.282f)
                verticalLineToRelative(2.14f)
                curveToRelative(0.325f, 0.085f, 0.658f, 0.142f, 1.0f, 0.142f)
                curveToRelative(1.201f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                reflectiveCurveToRelative(2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.799f, 1.382f, 3.0f, 1.382f)
                curveToRelative(0.342f, 0.0f, 0.675f, -0.057f, 1.0f, -0.142f)
                close()
            }
        }
        .build()
        return _arrowUpFromGroundWater!!
    }

private var _arrowUpFromGroundWater: ImageVector? = null
