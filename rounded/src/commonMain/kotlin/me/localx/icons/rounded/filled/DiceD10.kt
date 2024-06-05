package me.localx.icons.rounded.filled

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

public val Icons.Filled.DiceD10: ImageVector
    get() {
        if (_diceD10 != null) {
            return _diceD10!!
        }
        _diceD10 = Builder(name = "DiceD10", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.807f, 11.645f)
                lineToRelative(-2.8f, 2.105f)
                lineTo(9.194f, 11.644f)
                lineToRelative(2.812f, -7.718f)
                close()
                moveTo(7.26f, 11.11f)
                lineTo(11.068f, 0.657f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.007f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.986f, 3.986f, 0.0f, false, false, 8.914f, 1.462f)
                lineTo(1.991f, 9.708f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 1.0f, 12.147f)
                close()
                moveTo(12.948f, 0.659f)
                lineTo(16.741f, 11.11f)
                lineTo(23.0f, 12.146f)
                arcToRelative(5.081f, 5.081f, 0.0f, false, false, -1.013f, -2.47f)
                lineTo(15.1f, 1.469f)
                arcTo(3.984f, 3.984f, 0.0f, false, false, 12.01f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.948f, 0.659f)
                close()
                moveTo(11.008f, 15.5f)
                lineTo(7.742f, 13.057f)
                lineTo(1.171f, 14.146f)
                arcToRelative(5.11f, 5.11f, 0.0f, false, false, 1.172f, 2.04f)
                lineToRelative(6.788f, 6.72f)
                arcTo(3.961f, 3.961f, 0.0f, false, false, 11.008f, 24.0f)
                close()
                moveTo(16.259f, 13.056f)
                lineTo(13.008f, 15.5f)
                lineTo(13.008f, 24.0f)
                arcToRelative(3.912f, 3.912f, 0.0f, false, false, 1.855f, -1.076f)
                lineTo(21.7f, 16.149f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, false, 1.143f, -2.0f)
                close()
            }
        }
        .build()
        return _diceD10!!
    }

private var _diceD10: ImageVector? = null
