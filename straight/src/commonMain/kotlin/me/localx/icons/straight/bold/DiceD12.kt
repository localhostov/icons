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

public val Icons.Bold.DiceD12: ImageVector
    get() {
        if (_diceD12 != null) {
            return _diceD12!!
        }
        _diceD12 = Builder(name = "DiceD12", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.73f, 3.27f)
                lineTo(15.278f, 0.0f)
                lineTo(8.722f, 0.0f)
                lineTo(3.27f, 3.27f)
                lineTo(0.0f, 8.722f)
                verticalLineToRelative(6.556f)
                lineTo(3.27f, 20.73f)
                lineTo(8.722f, 24.0f)
                horizontalLineToRelative(6.556f)
                lineToRelative(5.452f, -3.27f)
                lineTo(24.0f, 15.278f)
                lineTo(24.0f, 8.722f)
                close()
                moveTo(10.5f, 7.671f)
                verticalLineToRelative(3.4f)
                lineTo(7.341f, 12.652f)
                lineTo(3.593f, 8.564f)
                lineTo(4.96f, 6.286f)
                close()
                moveTo(8.834f, 15.26f)
                lineTo(12.0f, 13.677f)
                lineToRelative(3.166f, 1.583f)
                lineTo(13.252f, 21.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(16.659f, 12.653f)
                lineTo(13.5f, 11.073f)
                verticalLineToRelative(-3.4f)
                lineToRelative(5.54f, -1.385f)
                lineToRelative(1.367f, 2.278f)
                close()
                moveTo(9.552f, 3.0f)
                horizontalLineToRelative(4.9f)
                lineToRelative(1.579f, 0.947f)
                lineTo(12.0f, 4.954f)
                lineTo(7.973f, 3.947f)
                close()
                moveTo(3.0f, 14.448f)
                lineTo(3.0f, 12.356f)
                lineToRelative(2.678f, 2.922f)
                lineToRelative(1.416f, 4.247f)
                lineToRelative(-1.637f, -0.982f)
                close()
                moveTo(18.543f, 18.543f)
                lineTo(16.906f, 19.525f)
                lineTo(18.321f, 15.278f)
                lineTo(21.0f, 12.356f)
                verticalLineToRelative(2.092f)
                close()
            }
        }
        .build()
        return _diceD12!!
    }

private var _diceD12: ImageVector? = null
