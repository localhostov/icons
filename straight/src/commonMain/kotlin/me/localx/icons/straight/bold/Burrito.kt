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

public val Icons.Bold.Burrito: ImageVector
    get() {
        if (_burrito != null) {
            return _burrito!!
        }
        _burrito = Builder(name = "Burrito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 15.0f)
                close()
                moveTo(11.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 12.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 17.5f)
                close()
                moveTo(20.0f, 5.094f)
                lineTo(20.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 16.5f, 24.0f)
                horizontalLineToRelative(-9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 20.5f)
                lineTo(4.0f, 5.094f)
                arcTo(2.76f, 2.76f, 0.0f, false, true, 3.0f, 3.375f)
                arcToRelative(2.246f, 2.246f, 0.0f, false, true, 3.806f, -1.62f)
                arcTo(3.339f, 3.339f, 0.0f, false, true, 12.0f, 0.876f)
                arcToRelative(3.339f, 3.339f, 0.0f, false, true, 5.194f, 0.879f)
                arcTo(2.246f, 2.246f, 0.0f, false, true, 21.0f, 3.375f)
                arcTo(2.76f, 2.76f, 0.0f, false, true, 20.0f, 5.094f)
                close()
                moveTo(9.869f, 5.243f)
                arcTo(17.56f, 17.56f, 0.0f, false, true, 12.348f, 6.8f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 0.923f, -0.835f)
                arcTo(5.563f, 5.563f, 0.0f, false, true, 14.0f, 5.385f)
                lineTo(12.365f, 2.867f)
                arcTo(10.883f, 10.883f, 0.0f, false, false, 9.869f, 5.243f)
                close()
                moveTo(17.0f, 20.5f)
                curveToRelative(0.0f, -6.388f, -5.986f, -12.0f, -10.0f, -13.243f)
                lineTo(7.0f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.0f, 20.5f)
                close()
                moveTo(17.0f, 7.237f)
                arcTo(6.192f, 6.192f, 0.0f, false, false, 14.617f, 8.77f)
                arcTo(20.9f, 20.9f, 0.0f, false, true, 17.0f, 11.628f)
                close()
            }
        }
        .build()
        return _burrito!!
    }

private var _burrito: ImageVector? = null
