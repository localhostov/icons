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

public val Icons.Bold.DirectionSignal: ImageVector
    get() {
        if (_directionSignal != null) {
            return _directionSignal!!
        }
        _directionSignal = Builder(name = "DirectionSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.621f, 16.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(-6.121f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.5f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-8.506f)
                lineToRelative(0.006f, -1.995f)
                lineToRelative(-3.0f, -0.01f)
                lineToRelative(-0.006f, 2.005f)
                horizontalLineToRelative(-6.115f)
                lineTo(0.379f, 6.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(6.121f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.492f)
                lineToRelative(0.008f, 4.003f)
                lineToRelative(3.0f, -0.006f)
                lineToRelative(-0.008f, -3.997f)
                horizontalLineToRelative(6.129f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(4.621f, 6.0f)
                lineToRelative(1.0f, -1.0f)
                horizontalLineToRelative(13.379f)
                verticalLineToRelative(2.0f)
                lineTo(5.621f, 7.0f)
                lineToRelative(-1.0f, -1.0f)
                close()
                moveTo(18.379f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.379f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _directionSignal!!
    }

private var _directionSignal: ImageVector? = null
