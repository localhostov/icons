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

public val Icons.Filled.ScannerGun: ImageVector
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
                moveTo(0.0f, 8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                lineTo(15.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                close()
                moveTo(5.0f, 15.0f)
                curveToRelative(-0.98f, 0.0f, -1.914f, -0.203f, -2.761f, -0.568f)
                lineTo(0.113f, 20.757f)
                curveToRelative(-0.41f, 1.318f, 0.327f, 2.72f, 1.645f, 3.129f)
                curveToRelative(1.319f, 0.41f, 2.72f, -0.327f, 3.129f, -1.645f)
                lineToRelative(1.761f, -5.241f)
                horizontalLineToRelative(2.351f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _scannerGun!!
    }

private var _scannerGun: ImageVector? = null
