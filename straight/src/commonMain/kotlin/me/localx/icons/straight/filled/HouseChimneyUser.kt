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

public val Icons.Filled.HouseChimneyUser: ImageVector
    get() {
        if (_houseChimneyUser != null) {
            return _houseChimneyUser!!
        }
        _houseChimneyUser = Builder(name = "HouseChimneyUser", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 10.074f)
                verticalLineToRelative(13.926f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.926f)
                curveToRelative(0.0f, -0.959f, 0.433f, -1.848f, 1.187f, -2.439f)
                lineTo(10.092f, 0.658f)
                curveToRelative(1.125f, -0.881f, 2.691f, -0.881f, 3.816f, 0.0f)
                lineToRelative(6.092f, 4.772f)
                verticalLineToRelative(-3.431f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.997f)
                lineToRelative(0.813f, 0.637f)
                curveToRelative(0.754f, 0.592f, 1.187f, 1.48f, 1.187f, 2.439f)
                close()
                moveTo(16.0f, 11.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _houseChimneyUser!!
    }

private var _houseChimneyUser: ImageVector? = null
