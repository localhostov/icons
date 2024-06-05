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

public val Icons.Filled.ArrowAltToTop: ImageVector
    get() {
        if (_arrowAltToTop != null) {
            return _arrowAltToTop!!
        }
        _arrowAltToTop = Builder(name = "ArrowAltToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.652f)
                curveToRelative(-0.074f, 0.037f, -0.143f, 0.086f, -0.204f, 0.148f)
                lineTo(7.087f, 6.65f)
                curveToRelative(-0.492f, 0.498f, -0.143f, 1.35f, 0.552f, 1.35f)
                horizontalLineToRelative(3.361f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.361f)
                curveToRelative(0.695f, 0.0f, 1.044f, -0.852f, 0.552f, -1.35f)
                lineTo(12.552f, 2.148f)
                curveToRelative(-0.061f, -0.062f, -0.13f, -0.111f, -0.204f, -0.148f)
                horizontalLineToRelative(7.652f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowAltToTop!!
    }

private var _arrowAltToTop: ImageVector? = null
