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

public val Icons.Filled.BaseballAlt: ImageVector
    get() {
        if (_baseballAlt != null) {
            return _baseballAlt!!
        }
        _baseballAlt = Builder(name = "BaseballAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 20.5f)
                close()
                moveTo(22.747f, 7.1f)
                arcTo(4.132f, 4.132f, 0.0f, false, false, 16.9f, 1.253f)
                lineTo(14.434f, 3.722f)
                arcToRelative(31.369f, 31.369f, 0.0f, false, false, -4.5f, 5.685f)
                reflectiveCurveTo(8.776f, 11.3f, 8.437f, 11.821f)
                lineTo(12.212f, 15.6f)
                curveToRelative(0.447f, -0.284f, 2.21f, -1.366f, 2.574f, -1.6f)
                arcToRelative(31.182f, 31.182f, 0.0f, false, false, 5.358f, -4.3f)
                close()
                moveTo(7.187f, 13.4f)
                lineTo(2.5f, 18.086f)
                lineToRelative(-0.793f, -0.793f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 0.293f, 18.707f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineTo(5.914f, 21.5f)
                lineTo(10.6f, 16.813f)
                close()
            }
        }
        .build()
        return _baseballAlt!!
    }

private var _baseballAlt: ImageVector? = null
