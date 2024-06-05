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

public val Icons.Bold.LightSwitch: ImageVector
    get() {
        if (_lightSwitch != null) {
            return _lightSwitch!!
        }
        _lightSwitch = Builder(name = "LightSwitch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                lineTo(19.0f, 21.0f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(10.0f, 16.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 8.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _lightSwitch!!
    }

private var _lightSwitch: ImageVector? = null
