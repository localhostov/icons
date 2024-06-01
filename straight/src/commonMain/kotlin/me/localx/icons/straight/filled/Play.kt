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

public val Icons.Filled.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7491f, 9.4645f)
                lineTo(5.0001f, 0.0485f)
                verticalLineTo(23.9895f)
                lineTo(19.7431f, 14.5405f)
                curveTo(20.1723f, 14.2708f, 20.5261f, 13.8966f, 20.7715f, 13.4531f)
                curveTo(21.0169f, 13.0096f, 21.146f, 12.5111f, 21.1466f, 12.0042f)
                curveTo(21.1472f, 11.4973f, 21.0193f, 10.9985f, 20.7749f, 10.5544f)
                curveTo(20.5306f, 10.1103f, 20.1776f, 9.7353f, 19.7491f, 9.4645f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
