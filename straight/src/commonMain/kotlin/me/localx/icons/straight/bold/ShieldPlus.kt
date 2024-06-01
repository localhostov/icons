package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.ShieldPlus: ImageVector
    get() {
        if (_shieldPlus != null) {
            return _shieldPlus!!
        }
        _shieldPlus = Builder(name = "ShieldPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 7.1813f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.4993f)
                horizontalLineTo(8.182f)
                verticalLineTo(12.4993f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.8173f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.4993f)
                horizontalLineTo(15.818f)
                verticalLineTo(9.4993f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.1813f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9219f, 23.9994f)
                lineTo(11.3909f, 23.7624f)
                curveTo(11.0069f, 23.5884f, 1.9999f, 19.4994f, 1.9999f, 11.9994f)
                verticalLineTo(5.5244f)
                curveTo(2.0f, 4.8947f, 2.1982f, 4.281f, 2.5665f, 3.7702f)
                curveTo(2.9348f, 3.2594f, 3.4544f, 2.8774f, 4.0519f, 2.6784f)
                lineTo(11.9999f, 0.0294f)
                lineTo(19.9489f, 2.6794f)
                curveTo(20.5465f, 2.8777f, 21.0664f, 3.2594f, 21.4346f, 3.7702f)
                curveTo(21.8028f, 4.2809f, 22.0006f, 4.8948f, 21.9999f, 5.5244f)
                verticalLineTo(11.9994f)
                curveTo(21.9999f, 20.5384f, 12.8629f, 23.6814f, 12.4739f, 23.8114f)
                lineTo(11.9219f, 23.9994f)
                close()
                moveTo(11.9999f, 3.1914f)
                lineTo(4.9999f, 5.5244f)
                verticalLineTo(11.9994f)
                curveTo(4.9999f, 16.6694f, 10.3439f, 19.8464f, 12.0769f, 20.7524f)
                curveTo(13.8189f, 20.0254f, 18.9999f, 17.4074f, 18.9999f, 11.9994f)
                verticalLineTo(5.5244f)
                lineTo(11.9999f, 3.1914f)
                close()
            }
        }
        .build()
        return _shieldPlus!!
    }

private var _shieldPlus: ImageVector? = null
