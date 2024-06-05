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

public val Icons.Bold.DiceThree: ImageVector
    get() {
        if (_diceThree != null) {
            return _diceThree!!
        }
        _diceThree = Builder(name = "DiceThree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                lineTo(0.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 24.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 18.5f, 24.0f)
                close()
                moveTo(5.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                lineTo(21.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 3.0f)
                close()
                moveTo(10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.0f)
                close()
                moveTo(6.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 7.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 7.5f)
                close()
                moveTo(15.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 16.5f)
                close()
            }
        }
        .build()
        return _diceThree!!
    }

private var _diceThree: ImageVector? = null
