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

public val Icons.Bold.DiceAlt: ImageVector
    get() {
        if (_diceAlt != null) {
            return _diceAlt!!
        }
        _diceAlt = Builder(name = "DiceAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 12.5f)
                lineTo(9.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 9.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(12.0f, 21.0f)
                lineTo(12.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(16.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 14.5f)
                close()
                moveTo(8.0f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 10.0f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 8.0f)
                close()
                moveTo(20.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 18.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 18.5f)
                close()
                moveTo(3.147f, 10.217f)
                lineTo(7.0f, 14.07f)
                verticalLineToRelative(4.243f)
                lineTo(1.025f, 12.338f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -4.95f)
                lineTo(7.389f, 1.024f)
                arcTo(3.476f, 3.476f, 0.0f, false, true, 9.863f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 2.475f, 1.024f)
                lineTo(18.314f, 7.0f)
                lineTo(14.072f, 7.0f)
                lineTo(10.218f, 3.146f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, false, -0.707f, 0.0f)
                lineTo(3.146f, 9.51f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                close()
            }
        }
        .build()
        return _diceAlt!!
    }

private var _diceAlt: ImageVector? = null
