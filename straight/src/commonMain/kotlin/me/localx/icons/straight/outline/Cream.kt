package me.localx.icons.straight.outline

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

public val Icons.Outline.Cream: ImageVector
    get() {
        if (_cream != null) {
            return _cream!!
        }
        _cream = Builder(name = "Cream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0f, 12.184f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(20.0f)
                    curveTo(20.0f, 2.56f, 17.028f, 0.291f, 16.9f, 0.2f)
                    lineTo(16.637f, 0.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(1.0f)
                    curveTo(15.0172f, 1.2671f, 14.9772f, 1.5348f, 14.8828f, 1.7852f)
                    curveTo(14.7884f, 2.0357f, 14.6416f, 2.2631f, 14.4524f, 2.4524f)
                    curveTo(14.2631f, 2.6416f, 14.0357f, 2.7884f, 13.7852f, 2.8828f)
                    curveTo(13.5348f, 2.9772f, 13.2671f, 3.0172f, 13.0f, 3.0f)
                    horizontalLineTo(10.0f)
                    curveTo(8.5632f, 2.9237f, 7.1515f, 3.3987f, 6.053f, 4.3279f)
                    curveTo(4.9545f, 5.2571f, 4.252f, 6.5705f, 4.089f, 8.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(12.184f)
                    curveTo(1.4171f, 12.3901f, 0.9121f, 12.7712f, 0.5541f, 13.2753f)
                    curveTo(0.1961f, 13.7794f, 0.0026f, 14.3817f, 0.0f, 15.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(15.0f)
                    curveTo(23.9974f, 14.3817f, 23.8039f, 13.7794f, 23.4459f, 13.2753f)
                    curveTo(23.0879f, 12.7712f, 22.5829f, 12.3901f, 22.0f, 12.184f)
                    close()
                    moveTo(10.0f, 5.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.7431f, 5.0082f, 14.474f, 4.8106f, 15.1117f, 4.429f)
                    curveTo(15.7493f, 4.0474f, 16.269f, 3.4967f, 16.613f, 2.838f)
                    curveTo(17.5826f, 4.3806f, 18.0659f, 6.1792f, 18.0f, 8.0f)
                    horizontalLineTo(6.131f)
                    curveTo(6.2912f, 7.1102f, 6.7752f, 6.3113f, 7.4896f, 5.7573f)
                    curveTo(8.2041f, 5.2033f, 9.0984f, 4.9335f, 10.0f, 5.0f)
                    close()
                    moveTo(20.0f, 10.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(20.0f)
                    close()
                    moveTo(22.0f, 22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(15.0f)
                    curveTo(2.0f, 14.7348f, 2.1054f, 14.4804f, 2.2929f, 14.2929f)
                    curveTo(2.4804f, 14.1054f, 2.7348f, 14.0f, 3.0f, 14.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 14.0f, 21.5196f, 14.1054f, 21.7071f, 14.2929f)
                    curveTo(21.8946f, 14.4804f, 22.0f, 14.7348f, 22.0f, 15.0f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _cream!!
    }

private var _cream: ImageVector? = null
