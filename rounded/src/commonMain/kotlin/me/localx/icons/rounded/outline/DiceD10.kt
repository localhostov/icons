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

public val Icons.Outline.DiceD10: ImageVector
    get() {
        if (_diceD10 != null) {
            return _diceD10!!
        }
        _diceD10 = Builder(name = "DiceD10", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.916f)
                arcToRelative(5.059f, 5.059f, 0.0f, false, false, -1.048f, -3.24f)
                lineTo(15.1f, 1.469f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.19f, -0.007f)
                lineTo(2.024f, 9.708f)
                arcTo(4.976f, 4.976f, 0.0f, false, false, 1.0f, 12.918f)
                arcToRelative(5.245f, 5.245f, 0.0f, false, false, 1.374f, 3.268f)
                lineToRelative(6.754f, 6.595f)
                arcTo(3.966f, 3.966f, 0.0f, false, false, 12.006f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.951f, 3.951f, 0.0f, false, false, 2.853f, -1.2f)
                lineToRelative(6.794f, -6.65f)
                arcTo(5.155f, 5.155f, 0.0f, false, false, 23.0f, 12.916f)
                close()
                moveTo(20.39f, 10.923f)
                arcToRelative(3.024f, 3.024f, 0.0f, false, true, 0.462f, 0.871f)
                lineToRelative(-4.108f, -0.684f)
                lineTo(13.814f, 3.045f)
                close()
                moveTo(12.01f, 13.75f)
                lineTo(9.194f, 11.644f)
                lineToRelative(2.812f, -7.717f)
                lineToRelative(2.8f, 7.718f)
                close()
                moveTo(10.2f, 3.045f)
                lineTo(7.26f, 11.11f)
                lineTo(3.144f, 11.8f)
                arcToRelative(2.873f, 2.873f, 0.0f, false, true, 0.443f, -0.84f)
                close()
                moveTo(3.808f, 14.787f)
                arcToRelative(3.019f, 3.019f, 0.0f, false, true, -0.611f, -0.973f)
                lineToRelative(4.546f, -0.757f)
                lineTo(11.008f, 15.5f)
                verticalLineToRelative(6.23f)
                arcToRelative(2.116f, 2.116f, 0.0f, false, true, -0.459f, -0.361f)
                close()
                moveTo(13.445f, 21.387f)
                arcToRelative(2.022f, 2.022f, 0.0f, false, true, -0.437f, 0.343f)
                lineTo(13.008f, 15.5f)
                lineToRelative(3.25f, -2.443f)
                lineToRelative(4.552f, 0.758f)
                arcToRelative(2.907f, 2.907f, 0.0f, false, true, -0.583f, 0.938f)
                close()
            }
        }
        .build()
        return _diceD10!!
    }

private var _diceD10: ImageVector? = null
