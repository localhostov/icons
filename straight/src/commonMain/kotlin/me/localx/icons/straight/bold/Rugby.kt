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

public val Icons.Bold.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.024f, 1.976f)
                curveToRelative(-3.524f, -3.529f, -12.647f, -2.153f, -17.424f, 2.624f)
                reflectiveCurveToRelative(-6.151f, 13.9f, -2.624f, 17.424f)
                arcToRelative(8.323f, 8.323f, 0.0f, false, false, 5.937f, 1.976f)
                arcToRelative(17.032f, 17.032f, 0.0f, false, false, 11.487f, -4.6f)
                curveToRelative(4.777f, -4.779f, 6.151f, -13.9f, 2.624f, -17.424f)
                close()
                moveTo(17.278f, 17.276f)
                arcToRelative(14.162f, 14.162f, 0.0f, false, true, -8.489f, 3.677f)
                lineToRelative(-5.743f, -5.741f)
                arcToRelative(14.167f, 14.167f, 0.0f, false, true, 3.676f, -8.49f)
                arcToRelative(14.169f, 14.169f, 0.0f, false, true, 8.491f, -3.676f)
                lineToRelative(5.741f, 5.741f)
                arcToRelative(14.167f, 14.167f, 0.0f, false, true, -3.676f, 8.491f)
                close()
                moveTo(18.317f, 9.681f)
                lineTo(16.2f, 11.8f)
                lineTo(15.261f, 10.86f)
                lineTo(14.121f, 12.0f)
                lineTo(15.061f, 12.939f)
                lineTo(12.939f, 15.061f)
                lineTo(12.0f, 14.121f)
                lineTo(10.878f, 15.243f)
                lineTo(11.817f, 16.183f)
                lineTo(9.7f, 18.3f)
                lineTo(5.7f, 14.3f)
                lineTo(7.821f, 12.179f)
                lineTo(8.761f, 13.118f)
                lineTo(9.879f, 12.0f)
                lineTo(8.939f, 11.061f)
                lineTo(11.061f, 8.939f)
                lineTo(12.0f, 9.879f)
                lineTo(13.136f, 8.743f)
                lineTo(12.2f, 7.8f)
                lineTo(14.321f, 5.679f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
