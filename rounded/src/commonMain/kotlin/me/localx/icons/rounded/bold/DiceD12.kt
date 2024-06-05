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
                moveTo(23.242f, 7.458f)
                lineTo(21.414f, 4.41f)
                arcToRelative(5.354f, 5.354f, 0.0f, false, false, -1.825f, -1.824f)
                lineTo(16.541f, 0.757f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 13.806f, 0.0f)
                lineTo(10.194f, 0.0f)
                arcTo(5.326f, 5.326f, 0.0f, false, false, 7.458f, 0.758f)
                lineTo(4.41f, 2.586f)
                arcTo(5.359f, 5.359f, 0.0f, false, false, 2.586f, 4.41f)
                horizontalLineToRelative(0.0f)
                lineTo(0.757f, 7.459f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 0.0f, 10.194f)
                verticalLineToRelative(3.612f)
                arcToRelative(5.326f, 5.326f, 0.0f, false, false, 0.758f, 2.736f)
                lineTo(2.586f, 19.59f)
                arcToRelative(5.354f, 5.354f, 0.0f, false, false, 1.825f, 1.824f)
                lineToRelative(3.048f, 1.829f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 10.194f, 24.0f)
                horizontalLineToRelative(3.612f)
                arcToRelative(5.326f, 5.326f, 0.0f, false, false, 2.736f, -0.758f)
                lineToRelative(3.048f, -1.828f)
                arcToRelative(5.354f, 5.354f, 0.0f, false, false, 1.824f, -1.825f)
                lineToRelative(1.829f, -3.048f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 24.0f, 13.806f)
                lineTo(24.0f, 10.194f)
                arcTo(5.326f, 5.326f, 0.0f, false, false, 23.242f, 7.458f)
                close()
                moveTo(5.078f, 6.089f)
                lineTo(10.5f, 7.443f)
                verticalLineToRelative(4.13f)
                lineTo(7.326f, 13.16f)
                lineToRelative(-3.97f, -4.2f)
                close()
                moveTo(10.224f, 21.0f)
                lineTo(8.776f, 15.789f)
                lineTo(12.0f, 14.177f)
                lineToRelative(3.223f, 1.611f)
                lineTo(13.768f, 21.0f)
                close()
                moveTo(16.674f, 13.16f)
                lineTo(13.5f, 11.573f)
                lineTo(13.5f, 7.443f)
                lineToRelative(5.422f, -1.355f)
                lineToRelative(1.72f, 2.867f)
                close()
                moveTo(10.194f, 3.0f)
                horizontalLineToRelative(3.612f)
                arcTo(2.32f, 2.32f, 0.0f, false, true, 15.0f, 3.33f)
                lineToRelative(0.76f, 0.456f)
                lineTo(12.0f, 4.726f)
                lineTo(8.24f, 3.787f)
                lineTo(9.0f, 3.331f)
                arcTo(2.318f, 2.318f, 0.0f, false, true, 10.194f, 3.0f)
                close()
                moveTo(5.158f, 18.046f)
                lineTo(3.331f, 15.0f)
                arcTo(2.318f, 2.318f, 0.0f, false, true, 3.0f, 13.806f)
                lineTo(3.0f, 12.95f)
                lineToRelative(2.655f, 2.811f)
                lineToRelative(0.967f, 3.481f)
                lineToRelative(-0.667f, -0.4f)
                arcTo(2.344f, 2.344f, 0.0f, false, true, 5.158f, 18.046f)
                close()
                moveTo(20.67f, 15.0f)
                lineToRelative(-1.828f, 3.046f)
                arcToRelative(2.344f, 2.344f, 0.0f, false, true, -0.8f, 0.8f)
                lineToRelative(-0.675f, 0.405f)
                lineToRelative(0.974f, -3.487f)
                lineTo(21.0f, 12.946f)
                verticalLineToRelative(0.86f)
                arcTo(2.32f, 2.32f, 0.0f, false, true, 20.67f, 15.0f)
                close()
            }
        }
        .build()
        return _diceD12!!
    }

private var _diceD12: ImageVector? = null
