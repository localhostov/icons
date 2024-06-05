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

public val Icons.Bold.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.43f, 4.2f)
                lineTo(14.729f, 0.76f)
                arcToRelative(5.268f, 5.268f, 0.0f, false, false, -5.458f, 0.0f)
                lineTo(3.57f, 4.2f)
                arcTo(5.351f, 5.351f, 0.0f, false, false, 1.0f, 8.755f)
                verticalLineToRelative(6.49f)
                arcTo(5.351f, 5.351f, 0.0f, false, false, 3.57f, 19.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(5.7f, 3.436f)
                arcToRelative(5.268f, 5.268f, 0.0f, false, false, 5.458f, 0.0f)
                lineToRelative(5.7f, -3.436f)
                arcTo(5.348f, 5.348f, 0.0f, false, false, 23.0f, 15.245f)
                lineTo(23.0f, 8.755f)
                arcTo(5.348f, 5.348f, 0.0f, false, false, 20.43f, 4.2f)
                close()
                moveTo(10.819f, 3.332f)
                arcToRelative(2.292f, 2.292f, 0.0f, false, true, 2.362f, 0.0f)
                lineTo(18.6f, 6.592f)
                lineTo(12.0f, 10.568f)
                lineTo(5.405f, 6.593f)
                close()
                moveTo(5.12f, 17.235f)
                arcTo(2.334f, 2.334f, 0.0f, false, true, 4.0f, 15.245f)
                verticalLineToRelative(-6.0f)
                lineToRelative(6.5f, 3.919f)
                verticalLineToRelative(7.312f)
                close()
                moveTo(18.881f, 17.235f)
                lineTo(13.5f, 20.479f)
                lineTo(13.5f, 13.167f)
                lineTo(20.0f, 9.248f)
                verticalLineToRelative(6.0f)
                arcTo(2.336f, 2.336f, 0.0f, false, true, 18.881f, 17.235f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
