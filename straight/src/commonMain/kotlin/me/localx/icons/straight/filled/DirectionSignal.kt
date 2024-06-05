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

public val Icons.Filled.DirectionSignal: ImageVector
    get() {
        if (_directionSignal != null) {
            return _directionSignal!!
        }
        _directionSignal = Builder(name = "DirectionSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.414f, 14.5f)
                lineToRelative(-3.5f, -3.5f)
                horizontalLineToRelative(-6.914f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-9.007f)
                lineToRelative(0.007f, -1.996f)
                lineToRelative(-2.0f, -0.008f)
                lineToRelative(-0.008f, 2.004f)
                horizontalLineToRelative(-6.907f)
                lineTo(0.586f, 5.5f)
                lineToRelative(3.5f, 3.5f)
                horizontalLineToRelative(6.914f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.99f)
                lineToRelative(0.01f, 6.001f)
                lineToRelative(2.0f, -0.003f)
                lineToRelative(-0.01f, -5.999f)
                horizontalLineToRelative(6.924f)
                lineToRelative(3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _directionSignal!!
    }

private var _directionSignal: ImageVector? = null
