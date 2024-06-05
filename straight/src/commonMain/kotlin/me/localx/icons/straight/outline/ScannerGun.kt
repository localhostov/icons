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

public val Icons.Outline.ScannerGun: ImageVector
    get() {
        if (_scannerGun != null) {
            return _scannerGun!!
        }
        _scannerGun = Builder(name = "ScannerGun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-5.281f)
                lineToRelative(-0.672f, 2.0f)
                horizontalLineToRelative(0.953f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.625f)
                lineToRelative(-1.523f, 4.532f)
                curveToRelative(-0.461f, 1.48f, -1.846f, 2.44f, -3.337f, 2.44f)
                curveToRelative(-0.344f, 0.0f, -0.693f, -0.051f, -1.038f, -0.158f)
                curveToRelative(-1.842f, -0.573f, -2.876f, -2.539f, -2.304f, -4.381f)
                lineToRelative(2.377f, -7.076f)
                curveToRelative(-1.521f, -0.858f, -2.551f, -2.49f, -2.551f, -4.358f)
                curveTo(0.0f, 5.243f, 2.243f, 3.0f, 5.0f, 3.0f)
                close()
                moveTo(7.609f, 13.0f)
                horizontalLineToRelative(-2.609f)
                curveToRelative(-0.184f, 0.0f, -0.365f, -0.01f, -0.544f, -0.03f)
                lineToRelative(-2.379f, 7.078f)
                curveToRelative(-0.238f, 0.768f, 0.205f, 1.61f, 0.994f, 1.856f)
                curveToRelative(0.787f, 0.246f, 1.633f, -0.197f, 1.878f, -0.987f)
                lineToRelative(2.66f, -7.917f)
                close()
                moveTo(13.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _scannerGun!!
    }

private var _scannerGun: ImageVector? = null
