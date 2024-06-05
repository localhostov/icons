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

public val Icons.Bold.PhoneRotary: ImageVector
    get() {
        if (_phoneRotary != null) {
            return _phoneRotary!!
        }
        _phoneRotary = Builder(name = "PhoneRotary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.467f)
                curveToRelative(0.0f, -1.496f, -0.596f, -2.917f, -1.681f, -4.002f)
                curveTo(20.073f, 1.219f, 16.261f, -0.023f, 11.872f, 0.0f)
                curveTo(7.615f, 0.045f, 3.806f, 1.34f, 1.681f, 3.465f)
                curveTo(0.596f, 4.55f, 0.0f, 5.971f, 0.0f, 7.466f)
                verticalLineToRelative(4.534f)
                horizontalLineToRelative(2.489f)
                lineToRelative(-1.115f, 2.069f)
                curveToRelative(-0.898f, 1.671f, -1.374f, 3.556f, -1.374f, 5.452f)
                verticalLineToRelative(4.479f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.479f)
                curveToRelative(0.0f, -1.896f, -0.476f, -3.781f, -1.375f, -5.452f)
                lineToRelative(-1.114f, -2.069f)
                horizontalLineToRelative(2.489f)
                verticalLineToRelative(-4.533f)
                close()
                moveTo(3.0f, 7.464f)
                curveToRelative(0.0f, -0.693f, 0.284f, -1.361f, 0.802f, -1.878f)
                curveToRelative(1.56f, -1.559f, 4.663f, -2.55f, 8.102f, -2.585f)
                curveToRelative(3.534f, -0.016f, 6.64f, 0.93f, 8.295f, 2.585f)
                curveToRelative(0.518f, 0.518f, 0.803f, 1.185f, 0.802f, 1.88f)
                verticalLineToRelative(1.534f)
                horizontalLineToRelative(-1.15f)
                lineToRelative(-1.256f, -2.093f)
                reflectiveCurveToRelative(-3.217f, -1.907f, -6.594f, -1.907f)
                reflectiveCurveToRelative(-6.594f, 1.907f, -6.594f, 1.907f)
                lineToRelative(-1.256f, 2.093f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(-1.536f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-1.479f)
                curveToRelative(0.0f, -1.401f, 0.352f, -2.794f, 1.016f, -4.03f)
                lineToRelative(2.282f, -4.237f)
                lineToRelative(1.277f, -2.129f)
                curveToRelative(0.688f, -0.347f, 2.454f, -1.125f, 4.426f, -1.125f)
                reflectiveCurveToRelative(3.74f, 0.78f, 4.426f, 1.125f)
                lineToRelative(1.277f, 2.129f)
                lineToRelative(2.281f, 4.238f)
                curveToRelative(0.665f, 1.235f, 1.017f, 2.628f, 1.017f, 4.03f)
                verticalLineToRelative(1.479f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _phoneRotary!!
    }

private var _phoneRotary: ImageVector? = null
