package me.localx.icons.rounded.bold

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

public val Icons.Bold.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.632f, 24.0f)
                horizontalLineToRelative(-9.264f)
                arcToRelative(4.379f, 4.379f, 0.0f, false, true, -3.319f, -1.523f)
                arcToRelative(4.307f, 4.307f, 0.0f, false, true, -1.0f, -3.451f)
                arcToRelative(12.207f, 12.207f, 0.0f, false, true, 3.934f, -7.026f)
                arcToRelative(12.207f, 12.207f, 0.0f, false, true, -3.935f, -7.025f)
                arcToRelative(4.307f, 4.307f, 0.0f, false, true, 1.0f, -3.451f)
                arcToRelative(4.379f, 4.379f, 0.0f, false, true, 3.32f, -1.524f)
                horizontalLineToRelative(9.264f)
                arcToRelative(4.378f, 4.378f, 0.0f, false, true, 3.318f, 1.523f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 1.0f, 3.448f)
                arcToRelative(12.235f, 12.235f, 0.0f, false, true, -3.938f, 7.029f)
                arcToRelative(12.234f, 12.234f, 0.0f, false, true, 3.94f, 7.03f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -1.0f, 3.447f)
                arcToRelative(4.378f, 4.378f, 0.0f, false, true, -3.32f, 1.523f)
                close()
                moveTo(16.632f, 3.0f)
                horizontalLineToRelative(-9.264f)
                arcToRelative(1.382f, 1.382f, 0.0f, false, false, -1.046f, 0.48f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.307f, 1.048f)
                curveToRelative(0.337f, 2.243f, 1.746f, 4.362f, 4.188f, 6.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.352f)
                curveToRelative(-2.442f, 1.933f, -3.851f, 4.052f, -4.188f, 6.3f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 0.307f, 1.048f)
                arcToRelative(1.382f, 1.382f, 0.0f, false, false, 1.046f, 0.472f)
                horizontalLineToRelative(9.264f)
                arcToRelative(1.384f, 1.384f, 0.0f, false, false, 1.046f, -0.481f)
                arcToRelative(1.294f, 1.294f, 0.0f, false, false, 0.307f, -1.044f)
                curveToRelative(-0.335f, -2.236f, -1.745f, -4.355f, -4.191f, -6.3f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -2.348f)
                curveToRelative(2.446f, -1.946f, 3.856f, -4.065f, 4.191f, -6.3f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.307f, -1.045f)
                arcToRelative(1.384f, 1.384f, 0.0f, false, false, -1.046f, -0.482f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
