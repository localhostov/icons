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

public val Icons.Bold.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = Builder(name = "CaretDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4141f, 9.0f)
                horizontalLineTo(17.5861f)
                curveTo(17.7838f, 9.0f, 17.9771f, 9.0587f, 18.1416f, 9.1686f)
                curveTo(18.306f, 9.2785f, 18.4341f, 9.4347f, 18.5098f, 9.6173f)
                curveTo(18.5854f, 9.8f, 18.6052f, 10.0011f, 18.5667f, 10.195f)
                curveTo(18.5281f, 10.389f, 18.4329f, 10.5671f, 18.2931f, 10.707f)
                lineTo(12.7071f, 16.293f)
                curveTo(12.5196f, 16.4805f, 12.2653f, 16.5858f, 12.0001f, 16.5858f)
                curveTo(11.7349f, 16.5858f, 11.4806f, 16.4805f, 11.2931f, 16.293f)
                lineTo(5.7071f, 10.707f)
                curveTo(5.5673f, 10.5671f, 5.4721f, 10.389f, 5.4335f, 10.195f)
                curveTo(5.3949f, 10.0011f, 5.4148f, 9.8f, 5.4904f, 9.6173f)
                curveTo(5.5661f, 9.4347f, 5.6942f, 9.2785f, 5.8586f, 9.1686f)
                curveTo(6.023f, 9.0587f, 6.2163f, 9.0f, 6.4141f, 9.0f)
                close()
            }
        }
        .build()
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
