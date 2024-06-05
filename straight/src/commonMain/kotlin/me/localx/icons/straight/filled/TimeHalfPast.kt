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

public val Icons.Filled.TimeHalfPast: ImageVector
    get() {
        if (_timeHalfPast != null) {
            return _timeHalfPast!!
        }
        _timeHalfPast = Builder(name = "TimeHalfPast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.949f, 0.051f)
                verticalLineToRelative(4.013f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 15.872f)
                verticalLineToRelative(4.013f)
                arcToRelative(11.99f, 11.99f, 0.0f, false, false, 0.0f, -23.9f)
                close()
                moveTo(12.949f, 13.723f)
                verticalLineToRelative(3.277f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.277f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, true, 0.0f, -3.446f)
                verticalLineToRelative(-4.277f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.277f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, true, 0.0f, 3.446f)
                close()
                moveTo(1.359f, 6.36f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, true, 1.325f, -1.986f)
                lineToRelative(1.516f, 1.307f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -1.06f, 1.583f)
                close()
                moveTo(2.368f, 9.146f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, false, -0.368f, 1.944f)
                lineToRelative(-1.99f, -0.2f)
                arcToRelative(11.932f, 11.932f, 0.0f, false, true, 0.448f, -2.338f)
                close()
                moveTo(7.287f, 3.157f)
                arcToRelative(10.018f, 10.018f, 0.0f, false, false, -1.646f, 1.087f)
                lineToRelative(-1.241f, -1.563f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, 1.944f, -1.288f)
                close()
                moveTo(11.044f, 2.046f)
                arcToRelative(9.933f, 9.933f, 0.0f, false, false, -1.93f, 0.368f)
                lineToRelative(-0.567f, -1.914f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 2.316f, -0.445f)
                close()
                moveTo(3.144f, 16.736f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, 1.056f, 1.583f)
                lineToRelative(-1.516f, 1.307f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, true, -1.325f, -1.986f)
                close()
                moveTo(0.458f, 15.448f)
                arcToRelative(11.932f, 11.932f, 0.0f, false, true, -0.453f, -2.343f)
                lineToRelative(1.995f, -0.195f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, false, 0.373f, 1.944f)
                close()
                moveTo(6.344f, 22.607f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, -1.944f, -1.288f)
                lineToRelative(1.245f, -1.563f)
                arcToRelative(10.018f, 10.018f, 0.0f, false, false, 1.646f, 1.087f)
                close()
                moveTo(10.863f, 23.945f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -2.316f, -0.445f)
                lineToRelative(0.567f, -1.917f)
                arcToRelative(9.933f, 9.933f, 0.0f, false, false, 1.93f, 0.368f)
                close()
            }
        }
        .build()
        return _timeHalfPast!!
    }

private var _timeHalfPast: ImageVector? = null
