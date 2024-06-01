package me.localx.icons.rounded.outline

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

public val Icons.Outline.CaretUp: ImageVector
    get() {
        if (_caretUp != null) {
            return _caretUp!!
        }
        _caretUp = Builder(name = "CaretUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4099f, 16.0001f)
                horizontalLineTo(17.5899f)
                curveTo(17.7876f, 15.9993f, 17.9807f, 15.9398f, 18.1447f, 15.8292f)
                curveTo(18.3087f, 15.7187f, 18.4362f, 15.562f, 18.5111f, 15.3789f)
                curveTo(18.5861f, 15.1959f, 18.605f, 14.9948f, 18.5656f, 14.801f)
                curveTo(18.5263f, 14.6071f, 18.4303f, 14.4294f, 18.2899f, 14.2901f)
                lineTo(12.7099f, 8.7101f)
                curveTo(12.6169f, 8.6164f, 12.5063f, 8.542f, 12.3844f, 8.4912f)
                curveTo(12.2626f, 8.4404f, 12.1319f, 8.4143f, 11.9999f, 8.4143f)
                curveTo(11.8679f, 8.4143f, 11.7372f, 8.4404f, 11.6153f, 8.4912f)
                curveTo(11.4934f, 8.542f, 11.3828f, 8.6164f, 11.2899f, 8.7101f)
                lineTo(5.7099f, 14.2901f)
                curveTo(5.5694f, 14.4294f, 5.4735f, 14.6071f, 5.4341f, 14.801f)
                curveTo(5.3947f, 14.9948f, 5.4137f, 15.1959f, 5.4886f, 15.3789f)
                curveTo(5.5635f, 15.562f, 5.691f, 15.7187f, 5.855f, 15.8292f)
                curveTo(6.019f, 15.9398f, 6.2121f, 15.9993f, 6.4099f, 16.0001f)
                close()
            }
        }
        .build()
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
