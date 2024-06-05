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

public val Icons.Filled.PlaneAlt: ImageVector
    get() {
        if (_planeAlt != null) {
            return _planeAlt!!
        }
        _planeAlt = Builder(name = "PlaneAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.286f, 10.058f)
                arcTo(2.992f, 2.992f, 0.0f, false, false, 21.0f, 9.0f)
                horizontalLineTo(17.58f)
                lineTo(13.313f, 1.546f)
                arcToRelative(2.883f, 2.883f, 0.0f, false, false, -4.807f, -0.425f)
                arcToRelative(2.688f, 2.688f, 0.0f, false, false, -0.363f, 2.426f)
                lineTo(10.083f, 9.0f)
                horizontalLineTo(5.532f)
                lineTo(4.116f, 7.1f)
                arcTo(2.43f, 2.43f, 0.0f, false, false, 2.079f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(2.075f, 2.075f, 0.0f, false, false, 0.126f, 8.788f)
                lineTo(2.0f, 12.0f)
                lineTo(0.126f, 15.212f)
                arcTo(2.075f, 2.075f, 0.0f, false, false, 2.075f, 18.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, 2.037f, -1.1f)
                lineTo(5.532f, 15.0f)
                horizontalLineToRelative(4.551f)
                lineToRelative(-1.94f, 5.453f)
                arcToRelative(2.688f, 2.688f, 0.0f, false, false, 0.363f, 2.426f)
                arcToRelative(2.883f, 2.883f, 0.0f, false, false, 4.807f, -0.425f)
                lineTo(17.58f, 15.0f)
                horizontalLineTo(21.0f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, false, 2.286f, -4.942f)
                close()
            }
        }
        .build()
        return _planeAlt!!
    }

private var _planeAlt: ImageVector? = null
