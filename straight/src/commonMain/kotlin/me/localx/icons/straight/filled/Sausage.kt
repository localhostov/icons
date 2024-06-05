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

public val Icons.Filled.Sausage: ImageVector
    get() {
        if (_sausage != null) {
            return _sausage!!
        }
        _sausage = Builder(name = "Sausage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.333f, 3.2f)
                arcTo(4.589f, 4.589f, 0.0f, false, false, 22.0f, 0.0f)
                horizontalLineTo(20.0f)
                arcToRelative(2.732f, 2.732f, 0.0f, false, true, -1.0f, 1.709f)
                arcTo(2.739f, 2.739f, 0.0f, false, true, 18.0f, 0.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.585f, 4.585f, 0.0f, false, false, 1.665f, 3.2f)
                arcTo(4.932f, 4.932f, 0.0f, false, false, 14.0f, 7.905f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -2.2f, 3.916f)
                arcToRelative(7.091f, 7.091f, 0.0f, false, true, -3.881f, 2.2f)
                arcToRelative(4.934f, 4.934f, 0.0f, false, false, -4.716f, 3.652f)
                arcTo(4.586f, 4.586f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.732f, 2.732f, 0.0f, false, true, 1.709f, 1.0f)
                arcTo(2.734f, 2.734f, 0.0f, false, true, 0.0f, 20.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.587f, 4.587f, 0.0f, false, false, 3.2f, -1.664f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 8.0f, 24.0f)
                curveToRelative(0.962f, 0.0f, 6.011f, -0.271f, 10.865f, -5.115f)
                curveTo(23.753f, 14.014f, 24.0f, 8.987f, 24.0f, 8.029f)
                arcTo(5.017f, 5.017f, 0.0f, false, false, 20.333f, 3.2f)
                close()
            }
        }
        .build()
        return _sausage!!
    }

private var _sausage: ImageVector? = null
