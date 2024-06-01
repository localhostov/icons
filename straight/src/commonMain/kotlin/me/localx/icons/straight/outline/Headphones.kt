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

public val Icons.Outline.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = Builder(name = "Headphones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0004f, 12.4236f)
                verticalLineTo(10.9996f)
                curveTo(21.0004f, 8.6127f, 20.0522f, 6.3235f, 18.3643f, 4.6357f)
                curveTo(16.6765f, 2.9478f, 14.3873f, 1.9996f, 12.0004f, 1.9996f)
                curveTo(9.6134f, 1.9996f, 7.3242f, 2.9478f, 5.6364f, 4.6357f)
                curveTo(3.9486f, 6.3235f, 3.0004f, 8.6127f, 3.0004f, 10.9996f)
                verticalLineTo(12.4236f)
                curveTo(1.9515f, 12.8855f, 1.0932f, 13.6936f, 0.569f, 14.7127f)
                curveTo(0.0448f, 15.7318f, -0.1134f, 16.9001f, 0.1209f, 18.0219f)
                curveTo(0.3552f, 19.1437f, 0.9678f, 20.151f, 1.8561f, 20.8751f)
                curveTo(2.7443f, 21.5992f, 3.8544f, 21.9962f, 5.0004f, 21.9996f)
                horizontalLineTo(7.0004f)
                verticalLineTo(11.9996f)
                horizontalLineTo(5.0004f)
                verticalLineTo(10.9996f)
                curveTo(5.0004f, 9.1431f, 5.7379f, 7.3626f, 7.0506f, 6.0499f)
                curveTo(8.3634f, 4.7371f, 10.1439f, 3.9996f, 12.0004f, 3.9996f)
                curveTo(13.8569f, 3.9996f, 15.6374f, 4.7371f, 16.9501f, 6.0499f)
                curveTo(18.2629f, 7.3626f, 19.0004f, 9.1431f, 19.0004f, 10.9996f)
                verticalLineTo(11.9996f)
                horizontalLineTo(17.0004f)
                verticalLineTo(21.9996f)
                horizontalLineTo(19.0004f)
                curveTo(20.1464f, 21.9962f, 21.2564f, 21.5992f, 22.1447f, 20.8751f)
                curveTo(23.033f, 20.151f, 23.6455f, 19.1437f, 23.8798f, 18.0219f)
                curveTo(24.1141f, 16.9001f, 23.9559f, 15.7318f, 23.4318f, 14.7127f)
                curveTo(22.9076f, 13.6936f, 22.0492f, 12.8855f, 21.0004f, 12.4236f)
                close()
                moveTo(5.0004f, 19.9996f)
                curveTo(4.2047f, 19.9996f, 3.4417f, 19.6836f, 2.8791f, 19.121f)
                curveTo(2.3165f, 18.5583f, 2.0004f, 17.7953f, 2.0004f, 16.9996f)
                curveTo(2.0004f, 16.204f, 2.3165f, 15.4409f, 2.8791f, 14.8783f)
                curveTo(3.4417f, 14.3157f, 4.2047f, 13.9996f, 5.0004f, 13.9996f)
                verticalLineTo(19.9996f)
                close()
                moveTo(19.0004f, 19.9996f)
                verticalLineTo(13.9996f)
                curveTo(19.796f, 13.9996f, 20.5591f, 14.3157f, 21.1217f, 14.8783f)
                curveTo(21.6843f, 15.4409f, 22.0004f, 16.204f, 22.0004f, 16.9996f)
                curveTo(22.0004f, 17.7953f, 21.6843f, 18.5583f, 21.1217f, 19.121f)
                curveTo(20.5591f, 19.6836f, 19.796f, 19.9996f, 19.0004f, 19.9996f)
                close()
            }
        }
        .build()
        return _headphones!!
    }

private var _headphones: ImageVector? = null
