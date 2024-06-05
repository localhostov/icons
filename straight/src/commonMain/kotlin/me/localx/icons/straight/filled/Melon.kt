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

public val Icons.Filled.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.043f, 10.4f)
                arcTo(13.633f, 13.633f, 0.0f, false, true, 10.4f, 24.04f)
                arcTo(13.6f, 13.6f, 0.0f, false, true, 0.753f, 20.05f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.829f, -4.831f)
                lineToRelative(0.512f, 0.513f)
                arcToRelative(6.816f, 6.816f, 0.0f, false, false, 9.638f, -9.64f)
                lineToRelative(-0.513f, -0.513f)
                lineTo(19.337f, 0.04f)
                lineToRelative(0.71f, 0.709f)
                arcTo(13.56f, 13.56f, 0.0f, false, true, 24.043f, 10.4f)
                close()
                moveTo(6.8f, 13.6f)
                arcToRelative(4.808f, 4.808f, 0.0f, false, false, 6.8f, -6.8f)
                lineToRelative(-0.513f, -0.513f)
                lineToRelative(-6.8f, 6.8f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
