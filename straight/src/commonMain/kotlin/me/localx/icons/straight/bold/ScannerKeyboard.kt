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

public val Icons.Bold.ScannerKeyboard: ImageVector
    get() {
        if (_scannerKeyboard != null) {
            return _scannerKeyboard!!
        }
        _scannerKeyboard = Builder(name = "ScannerKeyboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 7.0f)
                lineTo(3.5f, 7.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(11.5f, 5.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.208f)
                curveToRelative(-0.477f, -0.135f, -0.98f, -0.208f, -1.5f, -0.208f)
                close()
                moveTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 0.0f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, -1.704f, -0.779f, -3.23f, -2.0f, -4.24f)
                lineTo(15.0f, 0.0f)
                close()
            }
        }
        .build()
        return _scannerKeyboard!!
    }

private var _scannerKeyboard: ImageVector? = null
