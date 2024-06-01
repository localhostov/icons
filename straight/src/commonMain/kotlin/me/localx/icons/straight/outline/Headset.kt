package me.localx.icons.straight.outline

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

public val Icons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9999f, 12.4236f)
                verticalLineTo(10.9996f)
                curveTo(20.9999f, 8.6127f, 20.0517f, 6.3235f, 18.3638f, 4.6357f)
                curveTo(16.676f, 2.9478f, 14.3868f, 1.9996f, 11.9999f, 1.9996f)
                curveTo(9.6129f, 1.9996f, 7.3238f, 2.9478f, 5.6359f, 4.6357f)
                curveTo(3.9481f, 6.3235f, 2.9999f, 8.6127f, 2.9999f, 10.9996f)
                verticalLineTo(12.4236f)
                curveTo(1.9511f, 12.8855f, 1.0927f, 13.6936f, 0.5685f, 14.7127f)
                curveTo(0.0443f, 15.7318f, -0.1138f, 16.9001f, 0.1204f, 18.0219f)
                curveTo(0.3547f, 19.1437f, 0.9673f, 20.151f, 1.8556f, 20.8751f)
                curveTo(2.7438f, 21.5992f, 3.8539f, 21.9962f, 4.9999f, 21.9996f)
                horizontalLineTo(6.9999f)
                verticalLineTo(11.9996f)
                horizontalLineTo(4.9999f)
                verticalLineTo(10.9996f)
                curveTo(4.9999f, 9.1431f, 5.7374f, 7.3626f, 7.0501f, 6.0499f)
                curveTo(8.3629f, 4.7371f, 10.1434f, 3.9996f, 11.9999f, 3.9996f)
                curveTo(13.8564f, 3.9996f, 15.6369f, 4.7371f, 16.9496f, 6.0499f)
                curveTo(18.2624f, 7.3626f, 18.9999f, 9.1431f, 18.9999f, 10.9996f)
                verticalLineTo(11.9996f)
                horizontalLineTo(16.9999f)
                verticalLineTo(19.9996f)
                horizontalLineTo(12.9999f)
                verticalLineTo(21.9996f)
                horizontalLineTo(18.9999f)
                curveTo(20.1459f, 21.9962f, 21.256f, 21.5992f, 22.1442f, 20.8751f)
                curveTo(23.0325f, 20.151f, 23.645f, 19.1437f, 23.8793f, 18.0219f)
                curveTo(24.1136f, 16.9001f, 23.9554f, 15.7318f, 23.4313f, 14.7127f)
                curveTo(22.9071f, 13.6936f, 22.0487f, 12.8855f, 20.9999f, 12.4236f)
                close()
                moveTo(4.9999f, 19.9996f)
                curveTo(4.2042f, 19.9996f, 3.4412f, 19.6836f, 2.8786f, 19.121f)
                curveTo(2.316f, 18.5583f, 1.9999f, 17.7953f, 1.9999f, 16.9996f)
                curveTo(1.9999f, 16.204f, 2.316f, 15.4409f, 2.8786f, 14.8783f)
                curveTo(3.4412f, 14.3157f, 4.2042f, 13.9996f, 4.9999f, 13.9996f)
                verticalLineTo(19.9996f)
                close()
                moveTo(18.9999f, 19.9996f)
                verticalLineTo(13.9996f)
                curveTo(19.7955f, 13.9996f, 20.5586f, 14.3157f, 21.1212f, 14.8783f)
                curveTo(21.6838f, 15.4409f, 21.9999f, 16.204f, 21.9999f, 16.9996f)
                curveTo(21.9999f, 17.7953f, 21.6838f, 18.5583f, 21.1212f, 19.121f)
                curveTo(20.5586f, 19.6836f, 19.7955f, 19.9996f, 18.9999f, 19.9996f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
