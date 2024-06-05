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

public val Icons.Filled.Total: ImageVector
    get() {
        if (_total != null) {
            return _total!!
        }
        _total = Builder(name = "Total", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 24.0f)
                horizontalLineTo(4.394f)
                curveToRelative(-0.97f, 0.0f, -1.83f, -0.582f, -2.191f, -1.481f)
                curveToRelative(-0.361f, -0.9f, -0.143f, -1.916f, 0.559f, -2.587f)
                lineToRelative(8.293f, -7.932f)
                lineTo(2.761f, 4.068f)
                curveToRelative(-0.701f, -0.671f, -0.92f, -1.686f, -0.559f, -2.586f)
                reflectiveCurveToRelative(1.222f, -1.482f, 2.191f, -1.482f)
                horizontalLineToRelative(13.606f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.394f)
                curveToRelative(-0.213f, 0.0f, -0.302f, 0.142f, -0.336f, 0.227f)
                curveToRelative(-0.033f, 0.085f, -0.067f, 0.249f, 0.086f, 0.396f)
                lineToRelative(9.048f, 8.654f)
                curveToRelative(0.197f, 0.188f, 0.309f, 0.45f, 0.309f, 0.723f)
                reflectiveCurveToRelative(-0.111f, 0.534f, -0.309f, 0.723f)
                lineToRelative(-9.048f, 8.654f)
                curveToRelative(-0.153f, 0.146f, -0.119f, 0.312f, -0.086f, 0.396f)
                curveToRelative(0.034f, 0.084f, 0.123f, 0.227f, 0.336f, 0.227f)
                horizontalLineToRelative(13.606f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _total!!
    }

private var _total: ImageVector? = null
