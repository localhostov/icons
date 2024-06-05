package me.localx.icons.straight.filled

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
                moveTo(11.017f, 2.445f)
                curveToRelative(0.262f, -0.297f, 0.623f, -0.445f, 0.983f, -0.445f)
                reflectiveCurveToRelative(0.721f, 0.148f, 0.983f, 0.445f)
                lineToRelative(5.017f, 5.555f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                lineTo(11.017f, 2.445f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _arrowAltToTop!!
    }

private var _arrowAltToTop: ImageVector? = null
