package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.9999f)
                curveTo(8.1358f, 20.9955f, 5.0044f, 17.8641f, 5.0f, 13.9999f)
                verticalLineTo(4.9999f)
                curveTo(5.0f, 4.7999f, 5.013f, 4.6f, 5.03f, 4.408f)
                curveTo(3.194f, 5.1967f, 2.003f, 7.0017f, 2.0f, 8.9999f)
                verticalLineTo(18.9999f)
                curveTo(2.0033f, 21.7599f, 4.2399f, 23.9966f, 7.0f, 23.9999f)
                horizontalLineTo(13.0f)
                curveTo(14.9982f, 23.9969f, 16.8032f, 22.8059f, 17.592f, 20.9699f)
                curveTo(17.392f, 20.9869f, 17.2f, 20.9999f, 17.0f, 20.9999f)
                horizontalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.155f, 3.2721f)
                lineTo(18.871f, 0.9131f)
                curveTo(18.6195f, 0.6584f, 18.3246f, 0.4508f, 18.0f, 0.3f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.66f)
                curveTo(21.5288f, 3.7336f, 21.3586f, 3.4883f, 21.155f, 3.2721f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.9998f)
                curveTo(17.0f, 4.5521f, 17.4477f, 4.9998f, 18.0f, 4.9998f)
                horizontalLineTo(21.966f)
                curveTo(21.8923f, 4.3505f, 21.6074f, 3.7433f, 21.155f, 3.2718f)
                lineTo(18.871f, 0.9128f)
                curveTo(18.3714f, 0.4064f, 17.7085f, 0.0932f, 17.0f, 0.0288f)
                verticalLineTo(3.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(12.0f)
                curveTo(9.24f, 0.0033f, 7.0033f, 2.24f, 7.0f, 5.0f)
                verticalLineTo(14.0f)
                curveTo(7.0033f, 16.7601f, 9.24f, 18.9967f, 12.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(19.7601f, 18.9967f, 21.9967f, 16.7601f, 22.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                curveTo(16.3432f, 7.0f, 15.0f, 5.6569f, 15.0f, 4.0f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
