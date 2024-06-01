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

public val Icons.Bold.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8148f, 6.7041f)
                curveTo(22.2706f, 4.1745f, 20.0387f, 2.3649f, 17.4512f, 2.3553f)
                horizontalLineTo(5.4822f)
                curveTo(2.4556f, 2.3591f, 0.0033f, 4.812f, 0.0f, 7.8384f)
                verticalLineTo(12.8222f)
                curveTo(0.0033f, 15.8486f, 2.4558f, 18.3011f, 5.4822f, 18.3044f)
                horizontalLineTo(7.5564f)
                lineTo(9.0646f, 21.2578f)
                curveTo(9.7588f, 22.6108f, 11.1603f, 23.4529f, 12.6808f, 23.4308f)
                curveTo(14.8558f, 23.4336f, 16.6213f, 21.6728f, 16.6241f, 19.4978f)
                curveTo(16.6244f, 19.2742f, 16.6057f, 19.0511f, 16.5681f, 18.8307f)
                lineTo(16.4784f, 18.3045f)
                horizontalLineTo(18.5098f)
                curveTo(21.5375f, 18.3045f, 23.9919f, 15.85f, 23.9919f, 12.8223f)
                curveTo(23.9919f, 12.4411f, 23.9522f, 12.0609f, 23.8733f, 11.688f)
                lineTo(22.8148f, 6.7041f)
                close()
                moveTo(2.9903f, 12.8222f)
                verticalLineTo(7.8384f)
                curveTo(2.9903f, 6.4622f, 4.1059f, 5.3466f, 5.4821f, 5.3466f)
                horizontalLineTo(6.9773f)
                verticalLineTo(15.3141f)
                horizontalLineTo(5.4821f)
                curveTo(4.1059f, 15.3141f, 2.9903f, 14.1985f, 2.9903f, 12.8222f)
                close()
                moveTo(20.4405f, 14.3921f)
                curveTo(19.9681f, 14.9767f, 19.2563f, 15.3157f, 18.5047f, 15.3141f)
                horizontalLineTo(12.9309f)
                lineTo(13.6156f, 19.333f)
                curveTo(13.6647f, 19.6084f, 13.5875f, 19.8913f, 13.4053f, 20.1035f)
                curveTo(13.2115f, 20.3284f, 12.9255f, 20.4525f, 12.6288f, 20.4404f)
                curveTo(12.2514f, 20.4444f, 11.9042f, 20.2349f, 11.7317f, 19.8992f)
                lineTo(9.9675f, 16.4534f)
                verticalLineTo(5.3466f)
                horizontalLineTo(17.4511f)
                curveTo(18.6273f, 5.35f, 19.642f, 6.173f, 19.8882f, 7.3231f)
                lineTo(20.9428f, 12.3069f)
                curveTo(21.0999f, 13.0422f, 20.9151f, 13.809f, 20.4405f, 14.3921f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
