package me.localx.icons.rounded.bold

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

public val Icons.Bold.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.011f)
                curveToRelative(-2.051f, 0.0f, -3.86f, -1.233f, -4.609f, -3.142f)
                lineTo(0.101f, 2.042f)
                curveTo(-0.198f, 1.269f, 0.186f, 0.4f, 0.958f, 0.102f)
                curveToRelative(0.771f, -0.301f, 1.641f, 0.085f, 1.94f, 0.856f)
                lineToRelative(7.287f, 18.82f)
                curveToRelative(0.697f, 1.663f, 2.932f, 1.665f, 3.632f, -0.007f)
                lineTo(21.101f, 0.958f)
                curveToRelative(0.299f, -0.771f, 1.17f, -1.157f, 1.94f, -0.856f)
                curveToRelative(0.772f, 0.299f, 1.156f, 1.167f, 0.857f, 1.94f)
                lineToRelative(-7.287f, 18.82f)
                curveToRelative(-0.752f, 1.915f, -2.562f, 3.148f, -4.612f, 3.148f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
