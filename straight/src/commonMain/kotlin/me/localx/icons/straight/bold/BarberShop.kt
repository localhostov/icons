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
                moveToRelative(20.0f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(16.0f, 19.25f)
                arcToRelative(4.736f, 4.736f, 0.0f, false, true, -8.0f, 3.45f)
                arcToRelative(4.735f, 4.735f, 0.0f, true, true, -5.41f, -7.652f)
                lineToRelative(3.7f, -6.7f)
                lineToRelative(-2.097f, -3.798f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, true, -1.193f, -4.55f)
                horizontalLineToRelative(3.0f)
                arcToRelative(6.367f, 6.367f, 0.0f, false, false, 0.82f, 3.1f)
                lineToRelative(1.18f, 2.139f)
                lineToRelative(1.18f, -2.139f)
                arcToRelative(6.367f, 6.367f, 0.0f, false, false, 0.82f, -3.1f)
                horizontalLineToRelative(3.0f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, true, -1.193f, 4.55f)
                lineToRelative(-2.094f, 3.794f)
                lineToRelative(3.7f, 6.7f)
                arcToRelative(4.737f, 4.737f, 0.0f, false, true, 2.587f, 4.206f)
                close()
                moveTo(8.0f, 11.45f)
                lineTo(6.182f, 14.75f)
                arcToRelative(4.733f, 4.733f, 0.0f, false, true, 1.818f, 1.05f)
                arcToRelative(4.733f, 4.733f, 0.0f, false, true, 1.818f, -1.059f)
                close()
                moveTo(6.5f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.75f, 1.75f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 1.75f, -1.75f)
                close()
                moveTo(13.0f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -1.75f, 1.75f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 1.75f, -1.75f)
                close()
            }
        }
        .build()
        return _barberShop!!
    }

private var _barberShop: ImageVector? = null
