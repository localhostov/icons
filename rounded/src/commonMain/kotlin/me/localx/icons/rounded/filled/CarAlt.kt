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

public val Icons.Filled.CarAlt: ImageVector
    get() {
        if (_carAlt != null) {
            return _carAlt!!
        }
        _carAlt = Builder(name = "CarAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 11.0f)
                lineTo(0.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 7.0f)
                reflectiveCurveToRelative(0.959f, 0.0f, 1.0f, 0.0f)
                arcTo(27.327f, 27.327f, 0.0f, false, true, 4.687f, 3.049f)
                arcTo(3.884f, 3.884f, 0.0f, false, true, 6.665f, 1.692f)
                curveToRelative(1.761f, -0.856f, 8.909f, -0.856f, 10.67f, 0.0f)
                arcToRelative(3.884f, 3.884f, 0.0f, false, true, 1.978f, 1.357f)
                arcTo(27.327f, 27.327f, 0.0f, false, true, 21.5f, 7.0f)
                curveToRelative(0.041f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 8.5f)
                lineTo(24.0f, 11.0f)
                arcToRelative(90.636f, 90.636f, 0.0f, false, false, -12.0f, -1.0f)
                arcTo(90.636f, 90.636f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(24.0f, 13.023f)
                lineTo(24.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(4.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(0.0f, 13.027f)
                arcTo(90.835f, 90.835f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(90.835f, 90.835f, 0.0f, false, true, 24.0f, 13.027f)
                close()
                moveTo(6.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 16.0f)
                close()
                moveTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 16.0f)
                close()
                moveTo(6.942f, 21.0f)
                curveToRelative(0.587f, 3.954f, -5.472f, 3.952f, -4.884f, 0.0f)
                close()
                moveTo(21.942f, 21.0f)
                curveToRelative(0.587f, 3.954f, -5.472f, 3.952f, -4.884f, 0.0f)
                close()
            }
        }
        .build()
        return _carAlt!!
    }

private var _carAlt: ImageVector? = null
