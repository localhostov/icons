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

public val Icons.Filled.LightEmergency: ImageVector
    get() {
        if (_lightEmergency != null) {
            return _lightEmergency!!
        }
        _lightEmergency = Builder(name = "LightEmergency", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(7.037f, 0.0f, 3.0f, 4.037f, 3.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-9.0f)
                curveTo(21.0f, 4.037f, 16.963f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _lightEmergency!!
    }

private var _lightEmergency: ImageVector? = null
