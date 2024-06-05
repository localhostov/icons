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

public val Icons.Filled.Smile: ImageVector
    get() {
        if (_smile != null) {
            return _smile!!
        }
        _smile = Builder(name = "Smile", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(8.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.0f, -0.895f, 1.0f, -2.0f, 1.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(17.666f, 15.746f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 18.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.666f, -2.254f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.332f, -1.492f)
                arcTo(7.509f, 7.509f, 0.0f, false, false, 12.0f, 16.0f)
                arcToRelative(7.508f, 7.508f, 0.0f, false, false, 4.336f, -1.748f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.33f, 1.494f)
                close()
                moveTo(16.0f, 11.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.0f, -2.0f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                curveTo(18.0f, 11.0f, 17.105f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _smile!!
    }

private var _smile: ImageVector? = null
