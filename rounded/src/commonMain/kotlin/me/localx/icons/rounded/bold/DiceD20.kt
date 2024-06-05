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

public val Icons.Bold.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                arcTo(5.351f, 5.351f, 0.0f, false, false, 23.0f, 15.245f)
                lineTo(23.0f, 8.755f)
                arcTo(5.351f, 5.351f, 0.0f, false, false, 20.43f, 4.2f)
                close()
                moveTo(19.867f, 16.02f)
                lineTo(16.813f, 11.268f)
                lineTo(20.0f, 9.49f)
                verticalLineToRelative(5.755f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 19.867f, 16.016f)
                close()
                moveTo(18.806f, 6.72f)
                lineTo(15.294f, 8.676f)
                lineTo(12.276f, 3.017f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.9f, 0.311f)
                close()
                moveTo(10.819f, 3.328f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.9f, -0.311f)
                lineTo(8.706f, 8.676f)
                lineTo(5.193f, 6.72f)
                close()
                moveTo(4.133f, 16.016f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 4.0f, 15.245f)
                lineTo(4.0f, 9.49f)
                lineToRelative(3.187f, 1.774f)
                close()
                moveTo(5.12f, 17.235f)
                arcTo(2.27f, 2.27f, 0.0f, false, true, 4.8f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-4.0f, 7.0f)
                lineTo(10.5f, 17.0f)
                lineToRelative(0.0f, 3.48f)
                close()
                moveTo(13.5f, 20.478f)
                lineTo(13.5f, 17.0f)
                horizontalLineToRelative(5.7f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, true, -0.321f, 0.235f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
