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

public val Icons.Filled.ScannerTouchscreen: ImageVector
    get() {
        if (_scannerTouchscreen != null) {
            return _scannerTouchscreen!!
        }
        _scannerTouchscreen = Builder(name = "ScannerTouchscreen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 4.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 6.003f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.418f)
                curveToRelative(0.796f, 0.349f, 1.484f, 0.899f, 2.0f, 1.586f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(21.0f, 0.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _scannerTouchscreen!!
    }

private var _scannerTouchscreen: ImageVector? = null
