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

public val Icons.Bold.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.929f)
                lineTo(22.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(7.582f, 18.0f)
                lineToRelative(1.666f, 3.264f)
                arcToRelative(3.447f, 3.447f, 0.0f, false, false, 6.469f, -2.143f)
                lineTo(15.526f, 18.0f)
                lineTo(24.0f, 18.0f)
                close()
                moveTo(3.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 15.0f)
                close()
                moveTo(21.0f, 15.0f)
                lineTo(11.974f, 15.0f)
                lineToRelative(0.786f, 4.624f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, -0.1f, 0.36f)
                arcToRelative(0.448f, 0.448f, 0.0f, false, true, -0.741f, -0.084f)
                lineTo(10.0f, 16.14f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(9.5f)
                lineTo(21.0f, 14.066f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
