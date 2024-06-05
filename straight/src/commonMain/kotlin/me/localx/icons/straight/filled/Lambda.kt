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

public val Icons.Filled.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.736f, 22.0f)
                curveToRelative(-0.382f, 0.0f, -0.725f, -0.212f, -0.895f, -0.553f)
                lineTo(9.947f, 1.658f)
                curveToRelative(-0.512f, -1.022f, -1.54f, -1.658f, -2.684f, -1.658f)
                horizontalLineToRelative(-3.264f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.264f)
                curveToRelative(0.382f, 0.0f, 0.725f, 0.212f, 0.895f, 0.553f)
                lineToRelative(2.195f, 4.389f)
                lineTo(1.5f, 24.0f)
                horizontalLineToRelative(2.253f)
                lineToRelative(7.709f, -14.84f)
                lineToRelative(6.591f, 13.182f)
                curveToRelative(0.512f, 1.022f, 1.54f, 1.658f, 2.684f, 1.658f)
                horizontalLineToRelative(3.264f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.264f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
