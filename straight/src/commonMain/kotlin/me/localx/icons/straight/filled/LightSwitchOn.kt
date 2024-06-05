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

public val Icons.Filled.LightSwitchOn: ImageVector
    get() {
        if (_lightSwitchOn != null) {
            return _lightSwitchOn!!
        }
        _lightSwitchOn = Builder(name = "LightSwitchOn", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(22.0f, 3.0f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(17.0f, 4.0f)
                close()
            }
        }
        .build()
        return _lightSwitchOn!!
    }

private var _lightSwitchOn: ImageVector? = null
