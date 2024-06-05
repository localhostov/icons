package me.localx.icons.rounded.bold

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
                moveTo(18.5f, 9.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 9.0f, 14.5f)
                verticalLineToRelative(4.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 14.5f, 24.0f)
                horizontalLineToRelative(4.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineToRelative(-4.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 9.0f)
                close()
                moveTo(21.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 18.5f)
                verticalLineToRelative(-4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 12.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 14.5f)
                close()
                moveTo(6.661f, 13.238f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 4.54f, 15.359f)
                lineToRelative(-2.9f, -2.9f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.0f, -7.92f)
                lineToRelative(2.9f, -2.9f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 7.92f, 0.0f)
                lineToRelative(2.9f, 2.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.121f, 2.121f)
                lineToRelative(-2.9f, -2.9f)
                arcToRelative(2.661f, 2.661f, 0.0f, false, false, -3.677f, 0.0f)
                lineToRelative(-2.9f, 2.9f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 0.0f, 3.678f)
                close()
                moveTo(16.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 14.5f)
                close()
                moveTo(8.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 10.0f)
                close()
                moveTo(20.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 18.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 18.5f)
                close()
            }
        }
        .build()
        return _diceAlt!!
    }

private var _diceAlt: ImageVector? = null
