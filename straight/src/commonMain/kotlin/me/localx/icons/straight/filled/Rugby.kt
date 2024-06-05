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

public val Icons.Filled.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.322f, 23.736f)
                arcToRelative(16.126f, 16.126f, 0.0f, false, true, -2.655f, 0.244f)
                arcToRelative(8.106f, 8.106f, 0.0f, false, true, -5.767f, -1.88f)
                curveToRelative(-1.746f, -1.751f, -2.218f, -5.02f, -1.644f, -8.429f)
                close()
                moveTo(23.207f, 12.621f)
                arcToRelative(16.314f, 16.314f, 0.0f, false, true, -3.859f, 6.727f)
                arcToRelative(16.316f, 16.316f, 0.0f, false, true, -6.734f, 3.852f)
                lineToRelative(-11.821f, -11.821f)
                arcToRelative(16.314f, 16.314f, 0.0f, false, true, 3.859f, -6.727f)
                arcToRelative(16.314f, 16.314f, 0.0f, false, true, 6.727f, -3.859f)
                close()
                moveTo(17.707f, 10.293f)
                lineTo(13.707f, 6.293f)
                lineTo(12.293f, 7.707f)
                lineTo(13.586f, 9.0f)
                lineTo(12.0f, 10.586f)
                lineTo(10.707f, 9.293f)
                lineTo(9.293f, 10.707f)
                lineTo(10.586f, 12.0f)
                lineTo(9.0f, 13.586f)
                lineTo(7.707f, 12.293f)
                lineTo(6.293f, 13.707f)
                lineTo(10.293f, 17.707f)
                lineTo(11.707f, 16.293f)
                lineTo(10.414f, 15.0f)
                lineTo(12.0f, 13.414f)
                lineTo(13.293f, 14.707f)
                lineTo(14.707f, 13.293f)
                lineTo(13.414f, 12.0f)
                lineTo(15.0f, 10.414f)
                lineTo(16.293f, 11.707f)
                close()
                moveTo(23.744f, 10.329f)
                curveToRelative(0.574f, -3.409f, 0.1f, -6.678f, -1.646f, -8.427f)
                reflectiveCurveToRelative(-5.018f, -2.221f, -8.428f, -1.646f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
