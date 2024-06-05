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

public val Icons.Filled.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.551f, 12.0f)
                arcToRelative(12.556f, 12.556f, 0.0f, false, false, 4.406f, -7.449f)
                arcToRelative(3.943f, 3.943f, 0.0f, false, false, -0.918f, -3.151f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, false, -3.039f, -1.4f)
                horizontalLineToRelative(-9.995f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, -3.044f, 1.4f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -0.917f, 3.158f)
                arcToRelative(12.522f, 12.522f, 0.0f, false, false, 4.401f, 7.442f)
                arcToRelative(12.522f, 12.522f, 0.0f, false, false, -4.4f, 7.444f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 0.916f, 3.156f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, false, 3.044f, 1.4f)
                horizontalLineToRelative(9.995f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, false, 3.044f, -1.4f)
                arcToRelative(3.944f, 3.944f, 0.0f, false, false, 0.918f, -3.156f)
                arcToRelative(12.557f, 12.557f, 0.0f, false, false, -4.411f, -7.444f)
                close()
                moveTo(17.828f, 20.559f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.828f, 0.441f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.928f, -1.374f)
                arcToRelative(14.856f, 14.856f, 0.0f, false, true, 4.6f, -5.656f)
                lineToRelative(0.7f, -0.559f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.245f, 0.0f)
                lineToRelative(0.69f, 0.551f)
                arcToRelative(15.013f, 15.013f, 0.0f, false, true, 4.61f, 5.662f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.089f, 0.935f)
                close()
                moveTo(15.349f, 19.0f)
                horizontalLineToRelative(-6.7f)
                arcToRelative(14.962f, 14.962f, 0.0f, false, true, 3.271f, -3.462f)
                lineToRelative(0.08f, -0.066f)
                lineToRelative(0.071f, 0.055f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, true, 3.278f, 3.473f)
                close()
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
