package me.localx.icons.straight.outline

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

public val Icons.Outline.DiceD12: ImageVector
    get() {
        if (_diceD12 != null) {
            return _diceD12!!
        }
        _diceD12 = Builder(name = "DiceD12", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.729f, 3.271f)
                lineTo(15.277f, 0.0f)
                lineTo(8.723f, 0.0f)
                lineTo(3.271f, 3.271f)
                lineTo(0.0f, 8.723f)
                verticalLineToRelative(6.554f)
                lineToRelative(3.271f, 5.452f)
                lineTo(8.723f, 24.0f)
                horizontalLineToRelative(6.554f)
                lineToRelative(5.452f, -3.271f)
                lineTo(24.0f, 15.277f)
                lineTo(24.0f, 8.723f)
                close()
                moveTo(21.777f, 8.9f)
                lineToRelative(-4.039f, 4.846f)
                lineTo(13.0f, 11.382f)
                verticalLineToRelative(-4.6f)
                lineToRelative(6.524f, -1.632f)
                close()
                moveTo(14.307f, 22.0f)
                lineTo(9.693f, 22.0f)
                lineToRelative(-2.44f, -6.508f)
                lineTo(12.0f, 13.118f)
                lineToRelative(4.748f, 2.374f)
                close()
                moveTo(9.277f, 2.0f)
                horizontalLineToRelative(5.446f)
                lineToRelative(2.693f, 1.615f)
                lineTo(12.0f, 4.969f)
                lineTo(6.584f, 3.616f)
                close()
                moveTo(4.477f, 5.149f)
                lineTo(11.0f, 6.78f)
                verticalLineToRelative(4.6f)
                lineTo(6.262f, 13.751f)
                lineTo(2.223f, 8.9f)
                close()
                moveTo(2.0f, 14.723f)
                verticalLineToRelative(-2.96f)
                lineToRelative(3.123f, 3.748f)
                lineToRelative(1.934f, 5.157f)
                lineToRelative(-2.328f, -1.4f)
                close()
                moveTo(19.271f, 19.271f)
                lineTo(16.942f, 20.671f)
                lineTo(18.875f, 15.515f)
                lineTo(22.0f, 11.763f)
                verticalLineToRelative(2.96f)
                close()
            }
        }
        .build()
        return _diceD12!!
    }

private var _diceD12: ImageVector? = null
