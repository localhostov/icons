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

public val Icons.Bold.Biking: ImageVector
    get() {
        if (_biking != null) {
            return _biking!!
        }
        _biking = Builder(name = "Biking", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 23.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 9.0f, 18.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 4.5f, 23.0f)
                close()
                moveTo(4.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 17.0f)
                close()
                moveTo(19.5f, 23.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 24.0f, 18.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 19.5f, 23.0f)
                close()
                moveTo(19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 21.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 17.0f)
                close()
                moveTo(13.5f, 14.22f)
                lineTo(10.138f, 11.863f)
                arcTo(0.489f, 0.489f, 0.0f, false, true, 10.0f, 11.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.163f, -0.377f)
                lineTo(12.046f, 9.1f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.657f, 0.046f)
                lineTo(15.934f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 9.0f)
                lineTo(17.066f, 9.0f)
                lineTo(14.8f, 7.0f)
                arcToRelative(3.487f, 3.487f, 0.0f, false, false, -4.809f, -0.085f)
                lineTo(8.084f, 8.986f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.135f, 5.187f)
                lineTo(10.5f, 15.78f)
                lineTo(10.5f, 20.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.5f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 19.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 1.0f)
                close()
            }
        }
        .build()
        return _biking!!
    }

private var _biking: ImageVector? = null
