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

public val Icons.Bold.DiceD10: ImageVector
    get() {
        if (_diceD10 != null) {
            return _diceD10!!
        }
        _diceD10 = Builder(name = "DiceD10", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.022f, 12.856f)
                arcTo(5.41f, 5.41f, 0.0f, false, false, 21.9f, 9.434f)
                lineTo(15.384f, 1.6f)
                arcTo(4.35f, 4.35f, 0.0f, false, false, 12.007f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(4.348f, 4.348f, 0.0f, false, false, 8.632f, 1.6f)
                lineTo(2.09f, 9.481f)
                arcTo(5.275f, 5.275f, 0.0f, false, false, 1.0f, 12.857f)
                arcToRelative(5.753f, 5.753f, 0.0f, false, false, 1.473f, 3.524f)
                lineTo(8.869f, 22.67f)
                arcTo(4.331f, 4.331f, 0.0f, false, false, 12.006f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 3.108f, -1.3f)
                lineTo(21.6f, 16.333f)
                arcTo(5.636f, 5.636f, 0.0f, false, false, 23.022f, 12.856f)
                close()
                moveTo(13.069f, 3.511f)
                lineToRelative(6.324f, 7.6f)
                lineTo(14.93f, 10.43f)
                lineTo(12.526f, 3.1f)
                arcTo(1.363f, 1.363f, 0.0f, false, true, 13.069f, 3.511f)
                close()
                moveTo(10.943f, 3.511f)
                lineTo(10.949f, 3.503f)
                arcToRelative(1.348f, 1.348f, 0.0f, false, true, 0.524f, -0.394f)
                lineToRelative(-2.4f, 7.325f)
                lineToRelative(-4.435f, 0.679f)
                close()
                moveTo(4.516f, 14.163f)
                lineToRelative(4.182f, -0.64f)
                lineToRelative(1.809f, 1.354f)
                verticalLineToRelative(5.2f)
                reflectiveCurveTo(4.55f, 14.205f, 4.516f, 14.163f)
                close()
                moveTo(13.507f, 20.073f)
                verticalLineToRelative(-5.2f)
                lineToRelative(1.8f, -1.351f)
                lineToRelative(4.211f, 0.642f)
                curveToRelative(-0.021f, 0.026f, -0.044f, 0.051f, -0.067f, 0.076f)
                close()
            }
        }
        .build()
        return _diceD10!!
    }

private var _diceD10: ImageVector? = null
