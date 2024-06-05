package me.localx.icons.straight.bold

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

public val Icons.Bold.Sack: ImageVector
    get() {
        if (_sack != null) {
            return _sack!!
        }
        _sack = Builder(name = "Sack", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.682f, 5.188f)
                curveToRelative(1.452f, -1.073f, 3.318f, -2.897f, 3.318f, -5.188f)
                lineTo(7.0f, 0.0f)
                curveToRelative(0.0f, 2.291f, 1.866f, 4.115f, 3.318f, 5.188f)
                curveTo(5.147f, 6.34f, 1.0f, 12.576f, 1.0f, 17.772f)
                curveToRelative(0.0f, 3.434f, 2.804f, 6.228f, 6.25f, 6.228f)
                horizontalLineToRelative(9.5f)
                curveToRelative(3.446f, 0.0f, 6.25f, -2.794f, 6.25f, -6.228f)
                curveToRelative(0.0f, -5.196f, -4.147f, -11.432f, -9.318f, -12.584f)
                close()
                moveTo(16.75f, 21.0f)
                lineTo(7.25f, 21.0f)
                curveToRelative(-1.792f, 0.0f, -3.25f, -1.448f, -3.25f, -3.228f)
                curveToRelative(0.0f, -4.566f, 4.262f, -9.772f, 8.0f, -9.772f)
                reflectiveCurveToRelative(8.0f, 5.206f, 8.0f, 9.772f)
                curveToRelative(0.0f, 1.78f, -1.458f, 3.228f, -3.25f, 3.228f)
                close()
            }
        }
        .build()
        return _sack!!
    }

private var _sack: ImageVector? = null
