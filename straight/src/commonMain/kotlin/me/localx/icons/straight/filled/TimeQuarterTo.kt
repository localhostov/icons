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

public val Icons.Filled.TimeQuarterTo: ImageVector
    get() {
        if (_timeQuarterTo != null) {
            return _timeQuarterTo!!
        }
        _timeQuarterTo = Builder(name = "TimeQuarterTo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.141f, 7.264f)
                lineToRelative(-1.782f, -0.9f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, true, 1.325f, -1.99f)
                lineToRelative(1.516f, 1.307f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -1.059f, 1.583f)
                close()
                moveTo(2.368f, 9.146f)
                lineTo(0.458f, 8.552f)
                arcToRelative(11.932f, 11.932f, 0.0f, false, false, -0.453f, 2.348f)
                lineToRelative(1.99f, 0.2f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, true, 0.373f, -1.954f)
                close()
                moveTo(7.287f, 3.157f)
                lineTo(6.344f, 1.393f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -1.944f, 1.288f)
                lineToRelative(1.241f, 1.563f)
                arcToRelative(10.018f, 10.018f, 0.0f, false, true, 1.646f, -1.087f)
                close()
                moveTo(11.044f, 2.046f)
                lineTo(10.863f, 0.055f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -2.316f, 0.445f)
                lineToRelative(0.567f, 1.917f)
                arcToRelative(9.933f, 9.933f, 0.0f, false, true, 1.93f, -0.371f)
                close()
                moveTo(23.949f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.949f, 1.0f)
                horizontalLineToRelative(4.023f)
                arcToRelative(7.844f, 7.844f, 0.0f, false, true, -0.074f, -1.0f)
                arcToRelative(7.991f, 7.991f, 0.0f, false, true, 9.0f, -7.936f)
                verticalLineToRelative(-4.013f)
                arcToRelative(12.009f, 12.009f, 0.0f, false, true, 11.0f, 11.949f)
                close()
                moveTo(13.949f, 12.0f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, -1.0f, -1.723f)
                verticalLineToRelative(-4.277f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.278f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, -0.722f, 0.722f)
                horizontalLineToRelative(-3.278f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.278f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 3.723f, -1.0f)
                close()
            }
        }
        .build()
        return _timeQuarterTo!!
    }

private var _timeQuarterTo: ImageVector? = null
