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

public val Icons.Filled.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5002f, 18.0f)
                curveTo(22.3031f, 18.0f, 22.1079f, 17.9611f, 21.9259f, 17.8856f)
                curveTo(21.7438f, 17.8101f, 21.5784f, 17.6995f, 21.4392f, 17.56f)
                lineTo(13.7682f, 9.8891f)
                curveTo(13.536f, 9.6568f, 13.2604f, 9.4726f, 12.957f, 9.3469f)
                curveTo(12.6537f, 9.2213f, 12.3285f, 9.1566f, 12.0002f, 9.1566f)
                curveTo(11.6718f, 9.1566f, 11.3467f, 9.2213f, 11.0433f, 9.3469f)
                curveTo(10.74f, 9.4726f, 10.4643f, 9.6568f, 10.2322f, 9.8891f)
                lineTo(2.5702f, 17.551f)
                curveTo(2.2873f, 17.8243f, 1.9084f, 17.9755f, 1.5151f, 17.9721f)
                curveTo(1.1218f, 17.9686f, 0.7456f, 17.8109f, 0.4674f, 17.5328f)
                curveTo(0.1893f, 17.2547f, 0.0316f, 16.8784f, 0.0282f, 16.4851f)
                curveTo(0.0247f, 16.0919f, 0.1759f, 15.713f, 0.4492f, 15.43f)
                lineTo(8.1112f, 7.7681f)
                curveTo(9.1433f, 6.7379f, 10.5419f, 6.1593f, 12.0002f, 6.1593f)
                curveTo(13.4584f, 6.1593f, 14.8571f, 6.7379f, 15.8892f, 7.7681f)
                lineTo(23.5612f, 15.44f)
                curveTo(23.7707f, 15.6499f, 23.9134f, 15.9171f, 23.9712f, 16.208f)
                curveTo(24.0289f, 16.4989f, 23.9991f, 16.8004f, 23.8856f, 17.0744f)
                curveTo(23.772f, 17.3483f, 23.5798f, 17.5825f, 23.3332f, 17.7472f)
                curveTo(23.0866f, 17.912f, 22.7967f, 18.0f, 22.5002f, 18.0f)
                close()
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
