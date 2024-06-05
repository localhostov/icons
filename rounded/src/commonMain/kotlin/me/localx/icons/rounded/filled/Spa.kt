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

public val Icons.Filled.Spa: ImageVector
    get() {
        if (_spa != null) {
            return _spa!!
        }
        _spa = Builder(name = "Spa", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                curveToRelative(-7.851f, 0.0f, -12.0f, -1.383f, -12.0f, -4.0f)
                reflectiveCurveToRelative(4.149f, -4.0f, 12.0f, -4.0f)
                curveToRelative(7.963f, 0.0f, 12.0f, 1.346f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-4.037f, 4.0f, -12.0f, 4.0f)
                close()
                moveTo(12.5f, 15.0f)
                curveToRelative(-7.852f, 0.0f, -9.5f, -2.175f, -9.5f, -4.0f)
                reflectiveCurveToRelative(1.648f, -4.0f, 9.5f, -4.0f)
                curveToRelative(5.948f, 0.0f, 9.5f, 1.495f, 9.5f, 4.0f)
                reflectiveCurveToRelative(-3.552f, 4.0f, -9.5f, 4.0f)
                close()
                moveTo(10.0f, 6.0f)
                curveToRelative(-3.645f, 0.0f, -6.0f, -1.178f, -6.0f, -3.0f)
                reflectiveCurveToRelative(2.355f, -3.0f, 6.0f, -3.0f)
                reflectiveCurveToRelative(6.0f, 1.178f, 6.0f, 3.0f)
                reflectiveCurveToRelative(-2.355f, 3.0f, -6.0f, 3.0f)
                close()
            }
        }
        .build()
        return _spa!!
    }

private var _spa: ImageVector? = null
