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

public val Icons.Bold.PickingBox: ImageVector
    get() {
        if (_pickingBox != null) {
            return _pickingBox!!
        }
        _pickingBox = Builder(name = "PickingBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.023f, 5.269f)
                curveToRelative(0.372f, -0.13f, 0.977f, -0.269f, 1.477f, -0.269f)
                curveToRelative(2.0f, 0.0f, 3.804f, 1.49f, 4.312f, 3.283f)
                lineToRelative(2.628f, -2.283f)
                horizontalLineToRelative(5.561f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.439f)
                lineToRelative(-3.628f, 3.151f)
                curveToRelative(-1.194f, 1.438f, -2.67f, 2.425f, -2.907f, 2.566f)
                curveToRelative(-0.321f, 0.192f, -0.675f, 0.283f, -1.023f, 0.283f)
                curveToRelative(-0.681f, 0.0f, -1.345f, -0.348f, -1.719f, -0.975f)
                curveToRelative(-0.565f, -0.947f, -0.258f, -2.172f, 0.687f, -2.739f)
                curveToRelative(0.848f, -0.516f, 1.53f, -0.871f, 2.03f, -1.786f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.165f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-5.544f)
                lineToRelative(-2.439f, 2.439f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(4.171f, -4.171f)
                lineToRelative(-2.746f, 0.687f)
                verticalLineToRelative(-0.004f)
                curveToRelative(-0.118f, 0.029f, -0.238f, 0.049f, -0.364f, 0.049f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.703f, 0.485f, -1.288f, 1.137f, -1.451f)
                verticalLineToRelative(-0.004f)
                reflectiveCurveTo(11.5f, 0.0f, 11.5f, 0.0f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-1.3f, 0.0f, -2.358f, 1.0f, -2.477f, 2.269f)
                close()
                moveTo(15.0f, 18.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _pickingBox!!
    }

private var _pickingBox: ImageVector? = null
