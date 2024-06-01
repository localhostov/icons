package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.5349f, 17.9004f)
                    lineTo(1.7069f, 23.7074f)
                    lineTo(0.2929f, 22.2934f)
                    lineTo(6.1209f, 16.4844f)
                    lineTo(7.5349f, 17.9004f)
                    close()
                    moveTo(13.8349f, 20.6654f)
                    curveTo(14.7512f, 19.7454f, 15.4121f, 18.6026f, 15.7526f, 17.3496f)
                    curveTo(16.0931f, 16.0967f, 16.1015f, 14.7766f, 15.7769f, 13.5194f)
                    lineTo(15.4649f, 12.2434f)
                    lineTo(19.0849f, 8.6034f)
                    lineTo(19.6549f, 9.1744f)
                    curveTo(20.0758f, 9.6095f, 20.6365f, 9.8827f, 21.2385f, 9.9459f)
                    curveTo(21.8406f, 10.0092f, 22.4458f, 9.8585f, 22.9479f, 9.5204f)
                    curveTo(23.2441f, 9.3096f, 23.4907f, 9.0368f, 23.6707f, 8.721f)
                    curveTo(23.8506f, 8.4052f, 23.9595f, 8.0539f, 23.9898f, 7.6917f)
                    curveTo(24.0201f, 7.3294f, 23.971f, 6.965f, 23.846f, 6.6236f)
                    curveTo(23.7209f, 6.2823f, 23.523f, 5.9724f, 23.2659f, 5.7154f)
                    lineTo(18.3439f, 0.7884f)
                    curveTo(17.9227f, 0.3538f, 17.3622f, 0.081f, 16.7602f, 0.0177f)
                    curveTo(16.1583f, -0.0455f, 15.5533f, 0.1048f, 15.0509f, 0.4424f)
                    curveTo(14.7545f, 0.653f, 14.5077f, 0.9258f, 14.3275f, 1.2417f)
                    curveTo(14.1474f, 1.5576f, 14.0383f, 1.909f, 14.008f, 2.2713f)
                    curveTo(13.9776f, 2.6337f, 14.0266f, 2.9983f, 14.1517f, 3.3398f)
                    curveTo(14.2767f, 3.6812f, 14.4747f, 3.9913f, 14.7319f, 4.2484f)
                    lineTo(15.3789f, 4.8944f)
                    lineTo(11.7579f, 8.5344f)
                    lineTo(10.4899f, 8.2234f)
                    curveTo(9.2316f, 7.8973f, 7.9101f, 7.9049f, 6.6555f, 8.2452f)
                    curveTo(5.401f, 8.5856f, 4.2569f, 9.2471f, 3.3359f, 10.1644f)
                    lineTo(2.9829f, 10.5184f)
                    lineTo(13.4829f, 21.0184f)
                    lineTo(13.8349f, 20.6654f)
                    close()
                }
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
