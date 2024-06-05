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

public val Icons.Filled.Lobster: ImageVector
    get() {
        if (_lobster != null) {
            return _lobster!!
        }
        _lobster = Builder(name = "Lobster", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 11.0f)
                curveToRelative(1.916f, 0.0f, 3.517f, -1.354f, 3.906f, -3.155f)
                curveToRelative(1.211f, -0.386f, 2.094f, -1.507f, 2.094f, -2.845f)
                curveToRelative(0.0f, -1.657f, -1.5f, -5.0f, -1.5f, -5.0f)
                curveToRelative(0.0f, 0.0f, -0.502f, 1.661f, -1.5f, 3.069f)
                curveToRelative(-0.998f, -1.408f, -1.5f, -3.069f, -1.5f, -3.069f)
                curveToRelative(0.0f, 0.0f, -1.5f, 3.343f, -1.5f, 5.0f)
                curveToRelative(0.0f, 1.247f, 0.762f, 2.316f, 1.845f, 2.768f)
                curveToRelative(-0.302f, 0.722f, -1.015f, 1.232f, -1.845f, 1.232f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.346f)
                curveToRelative(0.0f, -2.674f, -2.975f, -5.561f, -3.313f, -5.881f)
                lineToRelative(-0.687f, -0.649f)
                lineToRelative(-0.687f, 0.649f)
                curveToRelative(-0.339f, 0.32f, -3.313f, 3.207f, -3.313f, 5.881f)
                verticalLineToRelative(2.346f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.83f, 0.0f, -1.544f, -0.509f, -1.845f, -1.232f)
                curveToRelative(1.083f, -0.452f, 1.845f, -1.521f, 1.845f, -2.768f)
                curveToRelative(0.0f, -1.657f, -1.5f, -5.0f, -1.5f, -5.0f)
                curveToRelative(0.0f, 0.0f, -0.502f, 1.661f, -1.5f, 3.069f)
                curveTo(2.002f, 1.661f, 1.5f, 0.0f, 1.5f, 0.0f)
                curveTo(1.5f, 0.0f, 0.0f, 3.343f, 0.0f, 5.0f)
                curveToRelative(0.0f, 1.339f, 0.883f, 2.459f, 2.094f, 2.845f)
                curveToRelative(0.389f, 1.8f, 1.991f, 3.155f, 3.906f, 3.155f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.414f)
                lineToRelative(-2.588f, 2.588f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.002f, -2.002f)
                horizontalLineToRelative(1.586f)
                verticalLineToRelative(3.516f)
                lineToRelative(-1.397f, 1.397f)
                curveToRelative(-0.498f, 0.497f, -0.603f, 1.021f, -0.603f, 1.372f)
                curveToRelative(0.0f, 0.537f, 0.235f, 1.057f, 0.681f, 1.502f)
                curveToRelative(1.079f, 1.08f, 3.377f, 1.863f, 5.319f, 0.581f)
                curveToRelative(0.716f, 0.473f, 1.479f, 0.665f, 2.213f, 0.665f)
                curveToRelative(1.257f, 0.0f, 2.425f, -0.563f, 3.106f, -1.246f)
                curveToRelative(0.445f, -0.445f, 0.681f, -0.965f, 0.681f, -1.502f)
                curveToRelative(0.0f, -0.352f, -0.104f, -0.875f, -0.602f, -1.371f)
                lineToRelative(-1.398f, -1.398f)
                verticalLineToRelative(-3.516f)
                horizontalLineToRelative(1.586f)
                lineToRelative(2.002f, 2.002f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.588f, -2.588f)
                horizontalLineToRelative(-2.414f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _lobster!!
    }

private var _lobster: ImageVector? = null
