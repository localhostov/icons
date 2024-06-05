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

public val Icons.Filled.BarberShop: ImageVector
    get() {
        if (_barberShop != null) {
            return _barberShop!!
        }
        _barberShop = Builder(name = "BarberShop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.828f, 16.462f)
                arcToRelative(53.471f, 53.471f, 0.0f, false, true, -3.685f, -5.776f)
                curveTo(9.665f, 7.709f, 11.0f, 4.189f, 11.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 1.0f)
                arcTo(18.683f, 18.683f, 0.0f, false, true, 7.005f, 8.431f)
                arcTo(18.694f, 18.694f, 0.0f, false, true, 5.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 1.0f)
                curveToRelative(0.0f, 3.174f, 1.342f, 6.7f, 2.868f, 9.685f)
                arcToRelative(50.636f, 50.636f, 0.0f, false, true, -3.695f, 5.777f)
                arcTo(3.986f, 3.986f, 0.0f, true, false, 7.0f, 22.618f)
                arcToRelative(3.985f, 3.985f, 0.0f, true, false, 4.828f, -6.156f)
                close()
                moveTo(4.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 22.0f)
                close()
                moveTo(4.883f, 16.105f)
                curveToRelative(0.585f, -0.844f, 1.337f, -1.991f, 2.122f, -3.342f)
                curveToRelative(0.784f, 1.35f, 1.534f, 2.5f, 2.117f, 3.341f)
                arcTo(3.984f, 3.984f, 0.0f, false, false, 7.0f, 17.382f)
                arcTo(3.989f, 3.989f, 0.0f, false, false, 4.883f, 16.105f)
                close()
                moveTo(10.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 22.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(18.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(18.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(16.0f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(21.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.816f, 2.0f)
                lineTo(23.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _barberShop!!
    }

private var _barberShop: ImageVector? = null
