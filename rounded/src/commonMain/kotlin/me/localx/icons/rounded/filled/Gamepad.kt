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

public val Icons.Filled.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1011f, 5.0334f)
                curveTo(21.2055f, 3.4412f, 19.6133f, 2.5455f, 17.8219f, 2.5455f)
                horizontalLineTo(5.9795f)
                curveTo(4.1882f, 2.5455f, 2.5959f, 3.4412f, 1.7003f, 5.0334f)
                curveTo(0.6056f, 7.0237f, 0.0085f, 9.2131f, 0.0085f, 11.502f)
                curveTo(0.0085f, 16.9754f, 2.1978f, 21.4536f, 4.9843f, 21.4536f)
                curveTo(6.477f, 21.4536f, 7.6713f, 20.0604f, 8.5669f, 17.1744f)
                curveTo(8.6664f, 16.7764f, 9.0645f, 16.4778f, 9.5621f, 16.4778f)
                horizontalLineTo(14.4384f)
                curveTo(14.8365f, 16.4778f, 15.2345f, 16.7764f, 15.4335f, 17.1744f)
                curveTo(16.3292f, 20.0604f, 17.5234f, 21.4536f, 19.0162f, 21.4536f)
                curveTo(21.8026f, 21.4536f, 23.992f, 16.9754f, 23.992f, 11.502f)
                curveTo(23.793f, 9.2131f, 23.1959f, 7.0237f, 22.1011f, 5.0334f)
                close()
                moveTo(8.965f, 10.5068f)
                horizontalLineTo(7.9698f)
                verticalLineTo(11.502f)
                curveTo(7.9698f, 12.0991f, 7.5718f, 12.4971f, 6.9747f, 12.4971f)
                curveTo(6.3776f, 12.4971f, 5.9795f, 12.0991f, 5.9795f, 11.502f)
                verticalLineTo(10.5068f)
                horizontalLineTo(4.9844f)
                curveTo(4.3873f, 10.5068f, 3.9892f, 10.1088f, 3.9892f, 9.5117f)
                curveTo(3.9892f, 8.9146f, 4.3873f, 8.5165f, 4.9844f, 8.5165f)
                horizontalLineTo(5.9795f)
                verticalLineTo(7.5214f)
                curveTo(5.9795f, 6.9243f, 6.3776f, 6.5262f, 6.9747f, 6.5262f)
                curveTo(7.5718f, 6.5262f, 7.9698f, 6.9243f, 7.9698f, 7.5214f)
                verticalLineTo(8.5165f)
                horizontalLineTo(8.965f)
                curveTo(9.5621f, 8.5165f, 9.9601f, 8.9146f, 9.9601f, 9.5117f)
                curveTo(9.9601f, 10.1088f, 9.5621f, 10.5068f, 8.965f, 10.5068f)
                close()
                moveTo(15.5331f, 12.4971f)
                curveTo(14.7369f, 12.4971f, 14.0403f, 11.8005f, 14.0403f, 11.0044f)
                curveTo(14.0403f, 10.2083f, 14.7369f, 9.5117f, 15.5331f, 9.5117f)
                curveTo(16.3292f, 9.5117f, 17.0258f, 10.2083f, 17.0258f, 11.0044f)
                curveTo(17.0258f, 11.8005f, 16.2297f, 12.4971f, 15.5331f, 12.4971f)
                close()
                moveTo(18.4191f, 9.5117f)
                curveTo(17.7225f, 9.5117f, 16.9263f, 8.8151f, 16.9263f, 8.0189f)
                curveTo(16.9263f, 7.2228f, 17.7225f, 6.5262f, 18.4191f, 6.5262f)
                curveTo(19.1157f, 6.5262f, 19.9118f, 7.2228f, 19.9118f, 8.0189f)
                curveTo(19.9118f, 8.8151f, 19.2152f, 9.5117f, 18.4191f, 9.5117f)
                close()
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
