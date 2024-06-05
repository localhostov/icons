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

public val Icons.Filled.Drumstick: ImageVector
    get() {
        if (_drumstick != null) {
            return _drumstick!!
        }
        _drumstick = Builder(name = "Drumstick", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 2.5f)
                arcToRelative(8.578f, 8.578f, 0.0f, false, false, -12.075f, 0.0f)
                curveToRelative(-2.377f, 2.377f, -3.157f, 7.909f, -3.41f, 11.0f)
                arcTo(4.164f, 4.164f, 0.0f, false, false, 6.6f, 15.983f)
                lineToRelative(-3.8f, 3.8f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.649f, 2.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.063f, -0.649f)
                lineToRelative(3.8f, -3.8f)
                arcToRelative(4.136f, 4.136f, 0.0f, false, false, 2.484f, 0.592f)
                curveToRelative(3.086f, -0.253f, 8.617f, -1.032f, 11.0f, -3.41f)
                arcTo(8.577f, 8.577f, 0.0f, false, false, 21.5f, 2.5f)
                close()
            }
        }
        .build()
        return _drumstick!!
    }

private var _drumstick: ImageVector? = null
