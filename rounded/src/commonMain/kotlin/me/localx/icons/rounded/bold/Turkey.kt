package me.localx.icons.rounded.bold

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

public val Icons.Bold.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 10.687f)
                arcToRelative(5.184f, 5.184f, 0.0f, false, false, -0.09f, -2.378f)
                lineToRelative(0.84f, -0.84f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 22.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.469f, 1.348f)
                lineToRelative(-0.845f, 0.845f)
                curveToRelative(-1.689f, -0.511f, -3.9f, 0.138f, -5.667f, 1.048f)
                arcTo(18.307f, 18.307f, 0.0f, false, false, 8.837f, 7.0f)
                arcTo(9.015f, 9.015f, 0.0f, false, false, 0.0f, 15.967f)
                verticalLineToRelative(2.4f)
                arcToRelative(5.286f, 5.286f, 0.0f, false, false, 4.579f, 5.183f)
                arcTo(39.713f, 39.713f, 0.0f, false, false, 9.137f, 24.0f)
                curveTo(14.687f, 24.0f, 24.0f, 23.2f, 24.0f, 17.833f)
                curveTo(24.0f, 15.4f, 22.468f, 12.756f, 19.9f, 10.687f)
                close()
                moveTo(16.44f, 8.979f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, 0.468f, 0.111f)
                curveToRelative(0.457f, 0.518f, -0.535f, 3.806f, -1.963f, 5.233f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, true, -3.268f, -3.269f)
                arcTo(8.7f, 8.7f, 0.0f, false, true, 16.44f, 8.979f)
                close()
                moveTo(9.137f, 21.0f)
                arcToRelative(35.577f, 35.577f, 0.0f, false, true, -4.147f, -0.426f)
                arcTo(2.273f, 2.273f, 0.0f, false, true, 3.0f, 18.363f)
                verticalLineToRelative(-2.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.747f, -5.955f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, 8.319f, 6.433f)
                arcToRelative(10.334f, 10.334f, 0.0f, false, false, 1.8f, -2.672f)
                arcTo(6.219f, 6.219f, 0.0f, false, true, 21.0f, 17.833f)
                curveTo(21.0f, 19.668f, 16.011f, 21.0f, 9.137f, 21.0f)
                close()
                moveTo(6.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(11.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(1.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null
