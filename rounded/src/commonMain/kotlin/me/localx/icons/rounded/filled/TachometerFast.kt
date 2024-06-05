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

public val Icons.Filled.TachometerFast: ImageVector
    get() {
        if (_tachometerFast != null) {
            return _tachometerFast!!
        }
        _tachometerFast = Builder(name = "TachometerFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.052f)
                curveTo(8.353f, -5.659f, -6.712f, 9.5f, 3.138f, 21.081f)
                arcTo(2.318f, 2.318f, 0.0f, false, false, 7.1f, 20.616f)
                curveToRelative(0.347f, -0.519f, 0.682f, -1.687f, 1.486f, -1.616f)
                horizontalLineToRelative(6.824f)
                curveToRelative(0.8f, -0.074f, 1.161f, 1.129f, 1.5f, 1.646f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, false, 3.9f, 0.487f)
                arcTo(12.058f, 12.058f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(17.707f, 8.707f)
                lineToRelative(-3.775f, 3.775f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.414f, -1.414f)
                lineToRelative(3.775f, -3.775f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.707f, 8.707f)
                close()
            }
        }
        .build()
        return _tachometerFast!!
    }

private var _tachometerFast: ImageVector? = null
