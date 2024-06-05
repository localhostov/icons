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

public val Icons.Outline.ScannerKeyboard: ImageVector
    get() {
        if (_scannerKeyboard != null) {
            return _scannerKeyboard!!
        }
        _scannerKeyboard = Builder(name = "ScannerKeyboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 4.418f)
                curveToRelative(0.796f, 0.349f, 1.484f, 0.899f, 2.0f, 1.586f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.418f)
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
                moveTo(14.0f, 9.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(2.0f)
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
        return _scannerKeyboard!!
    }

private var _scannerKeyboard: ImageVector? = null