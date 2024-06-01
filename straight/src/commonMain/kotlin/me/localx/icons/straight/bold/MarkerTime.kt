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

public val Icons.Bold.MarkerTime: ImageVector
    get() {
        if (_markerTime != null) {
            return _markerTime!!
        }
        _markerTime = Builder(name = "MarkerTime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 23.9944f)
                lineTo(4.9401f, 17.0894f)
                curveTo(3.0632f, 15.2155f, 2.0075f, 12.6728f, 2.0053f, 10.0205f)
                curveTo(2.0032f, 7.3683f, 3.0547f, 4.8238f, 4.9286f, 2.9469f)
                curveTo(6.8025f, 1.07f, 9.3452f, 0.0143f, 11.9975f, 0.0121f)
                curveTo(14.6497f, 0.01f, 17.1942f, 1.0615f, 19.0711f, 2.9354f)
                curveTo(20.9442f, 4.8118f, 21.9962f, 7.3547f, 21.9962f, 10.0059f)
                curveTo(21.9962f, 12.6571f, 20.9442f, 15.2001f, 19.0711f, 17.0764f)
                lineTo(12.0001f, 23.9944f)
                close()
                moveTo(12.0001f, 3.0064f)
                curveTo(10.6156f, 3.0063f, 9.2621f, 3.4168f, 8.1109f, 4.186f)
                curveTo(6.9596f, 4.9551f, 6.0623f, 6.0484f, 5.5325f, 7.3275f)
                curveTo(5.0026f, 8.6067f, 4.864f, 10.0142f, 5.1341f, 11.3722f)
                curveTo(5.4043f, 12.7301f, 6.071f, 13.9774f, 7.0501f, 14.9564f)
                lineTo(12.0001f, 19.8004f)
                lineTo(16.9621f, 14.9474f)
                curveTo(17.9388f, 13.9672f, 18.6031f, 12.7196f, 18.8711f, 11.3621f)
                curveTo(19.1391f, 10.0046f, 18.9987f, 8.5981f, 18.4677f, 7.3203f)
                curveTo(17.9368f, 6.0425f, 17.039f, 4.9507f, 15.8878f, 4.1829f)
                curveTo(14.7367f, 3.4151f, 13.3838f, 3.0057f, 12.0001f, 3.0064f)
                close()
                moveTo(13.9391f, 14.0614f)
                lineTo(10.5001f, 10.6214f)
                verticalLineTo(6.0004f)
                horizontalLineTo(13.5001f)
                verticalLineTo(9.3794f)
                lineTo(16.0611f, 11.9394f)
                lineTo(13.9391f, 14.0614f)
                close()
            }
        }
        .build()
        return _markerTime!!
    }

private var _markerTime: ImageVector? = null
