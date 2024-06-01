package me.localx.icons.rounded.bold

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

public val Icons.Bold.CaretUp: ImageVector
    get() {
        if (_caretUp != null) {
            return _caretUp!!
        }
        _caretUp = Builder(name = "CaretUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4141f, 15.586f)
                horizontalLineTo(17.5861f)
                curveTo(17.7838f, 15.586f, 17.9771f, 15.5273f, 18.1416f, 15.4174f)
                curveTo(18.306f, 15.3075f, 18.4341f, 15.1514f, 18.5098f, 14.9687f)
                curveTo(18.5854f, 14.786f, 18.6052f, 14.5849f, 18.5667f, 14.391f)
                curveTo(18.5281f, 14.197f, 18.4329f, 14.0189f, 18.2931f, 13.879f)
                lineTo(12.7071f, 8.293f)
                curveTo(12.5196f, 8.1056f, 12.2653f, 8.0002f, 12.0001f, 8.0002f)
                curveTo(11.7349f, 8.0002f, 11.4806f, 8.1056f, 11.2931f, 8.293f)
                lineTo(5.7071f, 13.879f)
                curveTo(5.5673f, 14.0189f, 5.4721f, 14.197f, 5.4335f, 14.391f)
                curveTo(5.3949f, 14.5849f, 5.4148f, 14.786f, 5.4904f, 14.9687f)
                curveTo(5.5661f, 15.1514f, 5.6942f, 15.3075f, 5.8586f, 15.4174f)
                curveTo(6.023f, 15.5273f, 6.2163f, 15.586f, 6.4141f, 15.586f)
                close()
            }
        }
        .build()
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
