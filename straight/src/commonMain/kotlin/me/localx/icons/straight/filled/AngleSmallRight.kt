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

public val Icons.Filled.AngleSmallRight: ImageVector
    get() {
        if (_angleSmallRight != null) {
            return _angleSmallRight!!
        }
        _angleSmallRight = Builder(name = "AngleSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8111f, 18.707f)
                lineTo(9.4002f, 17.293f)
                lineTo(14.6891f, 12.0f)
                lineTo(9.4002f, 6.707f)
                lineTo(10.8151f, 5.293f)
                lineTo(16.1001f, 10.586f)
                curveTo(16.4751f, 10.961f, 16.6857f, 11.4696f, 16.6857f, 12.0f)
                curveTo(16.6857f, 12.5303f, 16.4751f, 13.0389f, 16.1001f, 13.414f)
                lineTo(10.8111f, 18.707f)
                close()
            }
        }
        .build()
        return _angleSmallRight!!
    }

private var _angleSmallRight: ImageVector? = null
