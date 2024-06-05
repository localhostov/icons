package me.localx.icons.rounded.outline

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

public val Icons.Outline.DiceAlt: ImageVector
    get() {
        if (_diceAlt != null) {
            return _diceAlt!!
        }
        _diceAlt = Builder(name = "DiceAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(9.0f, 14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 19.0f, 24.0f)
                close()
                moveTo(14.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 13.0f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
                moveTo(9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 8.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 9.0f)
                close()
                moveTo(6.78f, 15.826f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.154f, -1.405f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, -0.251f, -0.228f)
                lineTo(2.864f, 10.634f)
                arcToRelative(3.005f, 3.005f, 0.0f, false, true, 0.029f, -4.243f)
                lineTo(6.453f, 2.88f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 2.106f, -0.864f)
                horizontalLineToRelative(0.022f)
                arcToRelative(2.981f, 2.981f, 0.0f, false, true, 2.115f, 0.893f)
                lineTo(14.2f, 6.465f)
                curveToRelative(0.057f, 0.058f, 0.111f, 0.117f, 0.163f, 0.179f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 15.9f, 5.356f)
                curveToRelative(-0.083f, -0.1f, -0.17f, -0.194f, -0.266f, -0.292f)
                lineTo(12.12f, 1.505f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.071f, -0.049f)
                lineTo(1.489f, 4.967f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, -0.049f, 7.071f)
                lineTo(4.951f, 15.6f)
                arcToRelative(4.865f, 4.865f, 0.0f, false, false, 0.423f, 0.381f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.406f, -0.153f)
                close()
            }
        }
        .build()
        return _diceAlt!!
    }

private var _diceAlt: ImageVector? = null
