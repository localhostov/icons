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

public val Icons.Bold.ArrowAltToTop: ImageVector
    get() {
        if (_arrowAltToTop != null) {
            return _arrowAltToTop!!
        }
        _arrowAltToTop = Builder(name = "ArrowAltToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.653f, 3.0f)
                horizontalLineToRelative(0.694f)
                curveToRelative(0.237f, 0.083f, 0.459f, 0.244f, 0.636f, 0.445f)
                lineToRelative(5.017f, 5.555f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                lineTo(11.017f, 3.445f)
                curveToRelative(0.177f, -0.2f, 0.4f, -0.361f, 0.636f, -0.445f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.653f)
                curveToRelative(0.114f, -0.04f, 0.23f, -0.062f, 0.347f, -0.062f)
                reflectiveCurveToRelative(0.234f, 0.022f, 0.347f, 0.062f)
                horizontalLineToRelative(8.653f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _arrowAltToTop!!
    }

private var _arrowAltToTop: ImageVector? = null
