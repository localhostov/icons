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

public val Icons.Bold.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0001f, 23.7608f)
                verticalLineTo(0.2798f)
                lineTo(19.0291f, 9.2358f)
                curveTo(19.4963f, 9.5316f, 19.881f, 9.941f, 20.1473f, 10.4256f)
                curveTo(20.4136f, 10.9103f, 20.5529f, 11.4545f, 20.5521f, 12.0075f)
                curveTo(20.5513f, 12.5605f, 20.4104f, 13.1043f, 20.1427f, 13.5882f)
                curveTo(19.875f, 14.0721f, 19.4891f, 14.4803f, 19.0211f, 14.7748f)
                lineTo(5.0001f, 23.7608f)
                close()
                moveTo(8.0001f, 5.7548f)
                verticalLineTo(18.2738f)
                lineTo(17.4121f, 12.2418f)
                curveTo(17.4552f, 12.2188f, 17.4912f, 12.1843f, 17.5159f, 12.1421f)
                curveTo(17.5406f, 12.0999f, 17.5532f, 12.0517f, 17.5521f, 12.0028f)
                curveTo(17.5537f, 11.956f, 17.5426f, 11.9097f, 17.5198f, 11.8688f)
                curveTo(17.4971f, 11.828f, 17.4636f, 11.7941f, 17.4231f, 11.7708f)
                lineTo(8.0001f, 5.7548f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
