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

public val Icons.Filled.ShopLock: ImageVector
    get() {
        if (_shopLock != null) {
            return _shopLock!!
        }
        _shopLock = Builder(name = "ShopLock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.821f, -0.266f, 1.571f, -0.695f, 2.204f)
                curveToRelative(-1.007f, -1.903f, -3.006f, -3.204f, -5.305f, -3.204f)
                curveToRelative(-2.967f, 0.0f, -5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(-1.09f)
                curveToRelative(-1.2f, 0.0f, -2.266f, -0.542f, -3.0f, -1.382f)
                curveToRelative(-0.734f, 0.84f, -1.8f, 1.382f, -3.0f, 1.382f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.347f, 0.0f, -0.678f, -0.058f, -1.0f, -0.142f)
                verticalLineToRelative(5.142f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.13f, 0.391f, 2.162f, 1.026f, 3.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(1.0f, 10.618f)
                curveToRelative(-0.615f, -0.703f, -1.0f, -1.612f, -1.0f, -2.618f)
                lineToRelative(0.024f, -1.217f)
                lineTo(2.198f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(4.802f)
                lineToRelative(2.198f, 7.0f)
                close()
            }
        }
        .build()
        return _shopLock!!
    }

private var _shopLock: ImageVector? = null
