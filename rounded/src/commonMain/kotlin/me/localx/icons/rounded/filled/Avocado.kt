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

public val Icons.Filled.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                curveToRelative(0.074f, 2.641f, -4.074f, 2.641f, -4.0f, 0.0f)
                curveTo(10.029f, 10.7f, 13.972f, 10.7f, 14.0f, 16.0f)
                close()
                moveTo(22.0f, 14.818f)
                curveTo(22.0f, 19.881f, 17.514f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveTo(2.0f, 19.881f, 2.0f, 14.818f)
                curveTo(2.0f, 5.23f, 8.606f, 0.0f, 12.0f, 0.0f)
                arcToRelative(5.762f, 5.762f, 0.0f, false, true, 5.589f, 4.355f)
                curveTo(18.494f, 8.118f, 22.376f, 10.707f, 22.0f, 14.818f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.094f, -7.959f, -8.094f, -7.958f, -8.0f, 0.0f)
                curveTo(8.041f, 21.3f, 15.96f, 21.3f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
