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

public val Icons.Filled.RocketLunch: ImageVector
    get() {
        if (_rocketLunch != null) {
            return _rocketLunch!!
        }
        _rocketLunch = Builder(name = "RocketLunch", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.751f, 15.0f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 14.0f)
                arcTo(7.634f, 7.634f, 0.0f, false, true, 4.065f, 7.169f)
                arcToRelative(10.975f, 10.975f, 0.0f, false, true, 3.9f, -1.09f)
                quadToRelative(-0.889f, 1.1f, -1.783f, 2.338f)
                arcTo(40.582f, 40.582f, 0.0f, false, false, 2.751f, 15.0f)
                close()
                moveTo(15.583f, 17.813f)
                arcTo(40.582f, 40.582f, 0.0f, false, true, 9.0f, 21.249f)
                lineTo(9.0f, 24.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(7.634f, 7.634f, 0.0f, false, false, 6.831f, -4.065f)
                arcToRelative(10.975f, 10.975f, 0.0f, false, false, 1.09f, -3.9f)
                quadTo(16.826f, 16.92f, 15.583f, 17.813f)
                close()
                moveTo(24.0f, 2.991f)
                curveToRelative(-0.133f, 4.353f, -3.267f, 8.67f, -9.582f, 13.2f)
                arcTo(34.995f, 34.995f, 0.0f, false, true, 9.0f, 19.063f)
                lineTo(9.0f, 18.5f)
                arcTo(3.517f, 3.517f, 0.0f, false, false, 5.5f, 15.0f)
                lineTo(4.937f, 15.0f)
                arcTo(34.912f, 34.912f, 0.0f, false, true, 7.813f, 9.583f)
                curveTo(12.332f, 3.278f, 16.642f, 0.144f, 20.988f, 0.0f)
                curveTo(23.154f, 0.0f, 24.0f, 0.885f, 24.0f, 2.991f)
                close()
                moveTo(18.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 8.5f)
                close()
                moveTo(1.374f, 23.785f)
                curveToRelative(1.126f, -0.2f, 3.841f, -0.758f, 4.748f, -1.664f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.243f, -4.243f)
                curveTo(0.973f, 18.785f, 0.414f, 21.5f, 0.215f, 22.626f)
                lineToRelative(-0.247f, 1.406f)
                close()
            }
        }
        .build()
        return _rocketLunch!!
    }

private var _rocketLunch: ImageVector? = null
