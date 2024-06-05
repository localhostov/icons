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

public val Icons.Filled.Surfing: ImageVector
    get() {
        if (_surfing != null) {
            return _surfing!!
        }
        _surfing = Builder(name = "Surfing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.01f)
                curveToRelative(-3.812f, 0.0f, -8.125f, 2.038f, -11.539f, 5.451f)
                arcToRelative(38.467f, 38.467f, 0.0f, false, false, -8.138f, 11.851f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, 0.708f, 4.243f)
                lineToRelative(14.262f, -14.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineToRelative(-14.258f, 14.258f)
                arcToRelative(3.941f, 3.941f, 0.0f, false, false, 4.236f, 0.713f)
                arcToRelative(38.333f, 38.333f, 0.0f, false, false, 11.854f, -8.139f)
                curveToRelative(3.413f, -3.413f, 5.451f, -7.726f, 5.451f, -11.539f)
                arcToRelative(3.632f, 3.632f, 0.0f, false, false, -3.99f, -3.99f)
                close()
            }
        }
        .build()
        return _surfing!!
    }

private var _surfing: ImageVector? = null
