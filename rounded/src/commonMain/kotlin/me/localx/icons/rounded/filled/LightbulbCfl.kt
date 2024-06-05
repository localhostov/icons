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

public val Icons.Filled.LightbulbCfl: ImageVector
    get() {
        if (_lightbulbCfl != null) {
            return _lightbulbCfl!!
        }
        _lightbulbCfl = Builder(name = "LightbulbCfl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.748f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.66f, -0.388f, 1.258f, -0.991f, 1.527f)
                lineToRelative(-2.009f, 0.826f)
                verticalLineToRelative(0.899f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.61f)
                lineToRelative(-3.0f, 1.233f)
                curveToRelative(-1.106f, 0.493f, -2.354f, -0.316f, -2.354f, -1.527f)
                curveToRelative(0.0f, -0.66f, 0.388f, -1.258f, 0.991f, -1.527f)
                lineToRelative(13.009f, -5.348f)
                curveToRelative(1.106f, -0.493f, 2.354f, 0.316f, 2.354f, 1.527f)
                close()
                moveTo(17.646f, 7.739f)
                lineTo(4.637f, 13.087f)
                curveToRelative(-0.603f, 0.269f, -0.991f, 0.867f, -0.991f, 1.527f)
                curveToRelative(0.0f, 1.211f, 1.247f, 2.021f, 2.354f, 1.527f)
                lineToRelative(13.009f, -5.348f)
                curveToRelative(0.603f, -0.269f, 0.991f, -0.867f, 0.991f, -1.527f)
                curveToRelative(0.0f, -1.211f, -1.247f, -2.021f, -2.354f, -1.527f)
                close()
                moveTo(6.0f, 10.766f)
                lineToRelative(13.009f, -5.348f)
                curveToRelative(0.603f, -0.269f, 0.991f, -0.867f, 0.991f, -1.527f)
                curveToRelative(0.0f, -1.211f, -1.247f, -2.021f, -2.354f, -1.527f)
                lineTo(4.637f, 7.712f)
                curveToRelative(-0.603f, 0.269f, -0.991f, 0.867f, -0.991f, 1.527f)
                curveToRelative(0.0f, 1.211f, 1.247f, 2.021f, 2.354f, 1.527f)
                close()
                moveTo(6.0f, 5.284f)
                lineToRelative(5.009f, -2.083f)
                curveToRelative(0.603f, -0.269f, 0.991f, -0.867f, 0.991f, -1.527f)
                curveToRelative(0.0f, -1.211f, -1.247f, -2.021f, -2.354f, -1.527f)
                lineTo(4.637f, 2.23f)
                curveToRelative(-0.603f, 0.269f, -0.991f, 0.867f, -0.991f, 1.527f)
                curveToRelative(0.0f, 1.211f, 1.247f, 2.021f, 2.354f, 1.527f)
                close()
            }
        }
        .build()
        return _lightbulbCfl!!
    }

private var _lightbulbCfl: ImageVector? = null
