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

public val Icons.Bold.BarberShop: ImageVector
    get() {
        if (_barberShop != null) {
            return _barberShop!!
        }
        _barberShop = Builder(name = "BarberShop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 4.5f, -4.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(16.0f, 19.25f)
                arcToRelative(4.736f, 4.736f, 0.0f, false, true, -8.0f, 3.45f)
                arcToRelative(4.739f, 4.739f, 0.0f, true, true, -5.8f, -7.442f)
                curveToRelative(1.154f, -1.4f, 2.712f, -3.5f, 4.013f, -5.474f)
                curveToRelative(-1.723f, -2.838f, -3.213f, -5.955f, -3.213f, -8.284f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                curveToRelative(0.0f, 1.308f, 0.827f, 3.268f, 2.0f, 5.365f)
                curveToRelative(1.173f, -2.1f, 2.0f, -4.058f, 2.0f, -5.365f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                curveToRelative(0.0f, 2.329f, -1.491f, 5.447f, -3.217f, 8.281f)
                curveToRelative(1.3f, 1.975f, 2.858f, 4.077f, 4.013f, 5.473f)
                arcToRelative(4.739f, 4.739f, 0.0f, false, true, 2.204f, 3.996f)
                close()
                moveTo(6.5f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.75f, 1.75f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 1.75f, -1.75f)
                close()
                moveTo(8.0f, 15.8f)
                arcToRelative(4.753f, 4.753f, 0.0f, false, true, 1.649f, -1.0f)
                curveToRelative(-0.5f, -0.658f, -1.063f, -1.438f, -1.649f, -2.284f)
                curveToRelative(-0.586f, 0.846f, -1.152f, 1.626f, -1.649f, 2.284f)
                arcToRelative(4.753f, 4.753f, 0.0f, false, true, 1.649f, 1.0f)
                close()
                moveTo(13.0f, 19.246f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.75f, 1.754f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 1.75f, -1.75f)
                close()
            }
        }
        .build()
        return _barberShop!!
    }

private var _barberShop: ImageVector? = null
