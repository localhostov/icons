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

public val Icons.Filled.TachometerAverage: ImageVector
    get() {
        if (_tachometerAverage != null) {
            return _tachometerAverage!!
        }
        _tachometerAverage = Builder(name = "TachometerAverage", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.052f)
                curveTo(8.353f, -5.659f, -6.712f, 9.5f, 3.138f, 21.081f)
                arcTo(2.318f, 2.318f, 0.0f, false, false, 7.1f, 20.616f)
                curveToRelative(0.347f, -0.519f, 0.682f, -1.687f, 1.486f, -1.616f)
                horizontalLineToRelative(6.824f)
                curveToRelative(0.8f, -0.074f, 1.161f, 1.129f, 1.5f, 1.646f)
                arcTo(2.367f, 2.367f, 0.0f, false, false, 19.0f, 22.0f)
                arcToRelative(2.734f, 2.734f, 0.0f, false, false, 1.814f, -0.867f)
                arcTo(12.058f, 12.058f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, true, -1.0f, -3.732f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.268f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tachometerAverage!!
    }

private var _tachometerAverage: ImageVector? = null
