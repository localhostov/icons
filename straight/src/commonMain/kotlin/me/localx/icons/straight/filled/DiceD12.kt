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

public val Icons.Filled.DiceD12: ImageVector
    get() {
        if (_diceD12 != null) {
            return _diceD12!!
        }
        _diceD12 = Builder(name = "DiceD12", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.841f, 7.321f)
                lineTo(2.459f, 4.626f)
                lineTo(11.0f, 6.779f)
                verticalLineToRelative(4.6f)
                lineTo(6.257f, 13.753f)
                close()
                moveTo(12.0f, 13.118f)
                lineTo(7.257f, 15.49f)
                lineTo(10.5f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(3.242f, -8.511f)
                close()
                moveTo(21.53f, 4.608f)
                lineTo(13.0f, 6.777f)
                verticalLineToRelative(4.6f)
                lineToRelative(4.736f, 2.368f)
                lineToRelative(5.376f, -6.507f)
                close()
                moveTo(5.125f, 15.514f)
                lineTo(0.0f, 9.428f)
                verticalLineToRelative(5.849f)
                lineToRelative(3.271f, 5.452f)
                lineTo(8.25f, 23.716f)
                close()
                moveTo(18.877f, 15.508f)
                lineTo(15.75f, 23.716f)
                lineToRelative(4.979f, -2.987f)
                lineTo(24.0f, 15.277f)
                lineTo(24.0f, 9.306f)
                close()
                moveTo(12.0f, 4.969f)
                lineTo(20.117f, 2.9f)
                lineTo(15.277f, 0.0f)
                lineTo(8.723f, 0.0f)
                lineTo(3.862f, 2.917f)
                close()
            }
        }
        .build()
        return _diceD12!!
    }

private var _diceD12: ImageVector? = null
