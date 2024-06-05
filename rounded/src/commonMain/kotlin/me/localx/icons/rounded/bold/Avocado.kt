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

public val Icons.Bold.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                curveToRelative(0.0f, -2.545f, 1.0f, -5.0f, 3.0f, -5.0f)
                reflectiveCurveToRelative(3.0f, 2.455f, 3.0f, 5.0f)
                arcToRelative(2.908f, 2.908f, 0.0f, false, true, -3.0f, 3.0f)
                arcTo(2.908f, 2.908f, 0.0f, false, true, 9.0f, 16.0f)
                close()
                moveTo(22.091f, 14.69f)
                arcToRelative(8.474f, 8.474f, 0.0f, false, false, -1.985f, -5.779f)
                arcToRelative(13.742f, 13.742f, 0.0f, false, true, -2.249f, -4.366f)
                arcTo(6.027f, 6.027f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(8.51f, 0.0f, 2.0f, 4.98f, 2.0f, 14.5f)
                arcTo(9.771f, 9.771f, 0.0f, false, false, 12.0f, 24.0f)
                curveTo(17.564f, 24.0f, 22.091f, 19.824f, 22.091f, 14.69f)
                close()
                moveTo(14.984f, 5.408f)
                arcToRelative(16.765f, 16.765f, 0.0f, false, false, 2.734f, 5.319f)
                arcToRelative(5.554f, 5.554f, 0.0f, false, true, 1.373f, 3.963f)
                curveTo(19.091f, 18.169f, 15.91f, 21.0f, 12.0f, 21.0f)
                arcToRelative(6.772f, 6.772f, 0.0f, false, true, -7.0f, -6.5f)
                curveTo(5.0f, 7.03f, 9.968f, 3.0f, 12.0f, 3.0f)
                arcTo(3.051f, 3.051f, 0.0f, false, true, 14.984f, 5.408f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
