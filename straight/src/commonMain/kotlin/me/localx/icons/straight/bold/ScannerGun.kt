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

public val Icons.Bold.ScannerGun: ImageVector
    get() {
        if (_scannerGun != null) {
            return _scannerGun!!
        }
        _scannerGun = Builder(name = "ScannerGun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.5f, 2.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-4.422f)
                lineToRelative(-0.672f, 2.0f)
                horizontalLineToRelative(1.094f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.102f)
                lineToRelative(-1.072f, 3.191f)
                curveToRelative(-0.524f, 1.686f, -2.105f, 2.781f, -3.811f, 2.781f)
                curveToRelative(-0.393f, 0.0f, -0.792f, -0.058f, -1.187f, -0.181f)
                curveToRelative(-2.105f, -0.655f, -3.286f, -2.901f, -2.633f, -5.007f)
                lineToRelative(2.255f, -6.71f)
                curveToRelative(-1.476f, -0.987f, -2.451f, -2.669f, -2.451f, -4.575f)
                curveTo(0.0f, 4.467f, 2.468f, 2.0f, 5.5f, 2.0f)
                close()
                moveTo(7.414f, 13.0f)
                horizontalLineToRelative(-1.914f)
                curveToRelative(-0.065f, 0.0f, -0.129f, -0.002f, -0.194f, -0.004f)
                lineToRelative(-2.255f, 6.712f)
                curveToRelative(-0.152f, 0.493f, 0.143f, 1.055f, 0.669f, 1.219f)
                curveToRelative(0.529f, 0.164f, 1.089f, -0.132f, 1.252f, -0.659f)
                lineToRelative(2.442f, -7.268f)
                close()
                moveTo(12.0f, 5.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _scannerGun!!
    }

private var _scannerGun: ImageVector? = null
