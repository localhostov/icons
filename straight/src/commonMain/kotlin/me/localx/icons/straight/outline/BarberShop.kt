package me.localx.icons.straight.outline

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

public val Icons.Outline.BarberShop: ImageVector
    get() {
        if (_barberShop != null) {
            return _barberShop!!
        }
        _barberShop = Builder(name = "BarberShop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(14.0f, 20.0f)
                arcToRelative(3.983f, 3.983f, 0.0f, false, true, -7.0f, 2.618f)
                arcToRelative(3.989f, 3.989f, 0.0f, true, true, -3.689f, -6.548f)
                lineToRelative(2.601f, -6.07f)
                lineToRelative(-1.649f, -3.849f)
                arcToRelative(15.528f, 15.528f, 0.0f, false, true, -1.263f, -6.151f)
                horizontalLineToRelative(2.0f)
                arcToRelative(13.537f, 13.537f, 0.0f, false, false, 1.1f, 5.364f)
                lineToRelative(0.9f, 2.1f)
                lineToRelative(0.9f, -2.1f)
                arcToRelative(13.537f, 13.537f, 0.0f, false, false, 1.1f, -5.364f)
                horizontalLineToRelative(2.0f)
                arcToRelative(15.528f, 15.528f, 0.0f, false, true, -1.263f, 6.151f)
                lineToRelative(-1.649f, 3.849f)
                lineToRelative(2.6f, 6.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.312f, 3.93f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(7.0f, 17.382f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, true, 1.6f, -1.115f)
                lineToRelative(-1.6f, -3.729f)
                lineToRelative(-1.6f, 3.729f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, true, 1.6f, 1.115f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _barberShop!!
    }

private var _barberShop: ImageVector? = null
