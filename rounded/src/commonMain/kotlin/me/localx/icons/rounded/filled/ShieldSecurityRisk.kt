package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShieldSecurityRisk: ImageVector
    get() {
        if (_shieldSecurityRisk != null) {
            return _shieldSecurityRisk!!
        }
        _shieldSecurityRisk = Builder(name = "ShieldSecurityRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 22.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.961f, 23.236f)
                curveToRelative(-0.461f, 0.225f, -0.866f, 0.402f, -1.168f, 0.524f)
                curveToRelative(0.0f, 0.0f, -0.293f, 0.24f, -0.791f, 0.24f)
                reflectiveCurveToRelative(-0.85f, -0.307f, -0.85f, -0.307f)
                curveTo(7.005f, 22.62f, 0.0f, 18.606f, 0.0f, 12.043f)
                verticalLineToRelative(-5.171f)
                curveTo(0.0f, 4.713f, 1.377f, 2.806f, 3.426f, 2.126f)
                lineTo(9.685f, 0.051f)
                curveToRelative(0.205f, -0.068f, 0.425f, -0.068f, 0.63f, 0.0f)
                lineToRelative(6.259f, 2.075f)
                curveToRelative(2.049f, 0.68f, 3.426f, 2.587f, 3.426f, 4.746f)
                verticalLineToRelative(3.39f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.005f, 0.743f, 3.832f, 1.961f, 5.236f)
                close()
            }
        }
        .build()
        return _shieldSecurityRisk!!
    }

private var _shieldSecurityRisk: ImageVector? = null
