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

public val Icons.Bold.DiceD4: ImageVector
    get() {
        if (_diceD4 != null) {
            return _diceD4!!
        }
        _diceD4 = Builder(name = "DiceD4", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.218f, 12.606f)
                reflectiveCurveTo(15.422f, 1.656f, 15.4f, 1.634f)
                arcToRelative(4.361f, 4.361f, 0.0f, false, false, -6.86f, 0.068f)
                lineTo(0.768f, 12.627f)
                arcToRelative(4.342f, 4.342f, 0.0f, false, false, 1.024f, 6.0f)
                curveToRelative(0.032f, 0.022f, 7.415f, 4.583f, 7.415f, 4.583f)
                arcToRelative(5.289f, 5.289f, 0.0f, false, false, 5.587f, 0.0f)
                reflectiveCurveToRelative(7.382f, -4.561f, 7.414f, -4.583f)
                arcTo(4.348f, 4.348f, 0.0f, false, false, 23.218f, 12.606f)
                close()
                moveTo(3.518f, 16.172f)
                arcToRelative(1.351f, 1.351f, 0.0f, false, true, -0.3f, -1.825f)
                lineTo(10.5f, 4.124f)
                lineTo(10.5f, 20.48f)
                close()
                moveTo(20.474f, 16.172f)
                lineTo(13.5f, 20.48f)
                lineTo(13.5f, 4.128f)
                lineToRelative(7.26f, 10.2f)
                arcTo(1.357f, 1.357f, 0.0f, false, true, 20.478f, 16.172f)
                close()
            }
        }
        .build()
        return _diceD4!!
    }

private var _diceD4: ImageVector? = null
