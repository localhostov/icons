package me.localx.icons.rounded.outline

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

public val Icons.Outline.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 24.0f)
                lineTo(7.005f, 24.0f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, true, -3.044f, -1.4f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -0.917f, -3.158f)
                arcTo(12.522f, 12.522f, 0.0f, false, true, 7.445f, 12.0f)
                arcToRelative(12.522f, 12.522f, 0.0f, false, true, -4.4f, -7.444f)
                arcTo(3.94f, 3.94f, 0.0f, false, true, 3.961f, 1.4f)
                arcTo(4.014f, 4.014f, 0.0f, false, true, 7.005f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 3.044f, 1.4f)
                arcToRelative(3.943f, 3.943f, 0.0f, false, true, 0.918f, 3.155f)
                arcTo(12.556f, 12.556f, 0.0f, false, true, 16.551f, 12.0f)
                arcToRelative(12.557f, 12.557f, 0.0f, false, true, 4.406f, 7.448f)
                arcToRelative(3.944f, 3.944f, 0.0f, false, true, -0.918f, 3.156f)
                arcTo(4.017f, 4.017f, 0.0f, false, true, 17.0f, 24.0f)
                close()
                moveTo(17.0f, 2.0f)
                lineTo(7.005f, 2.0f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, false, -1.528f, 0.7f)
                arcToRelative(1.921f, 1.921f, 0.0f, false, false, -0.456f, 1.556f)
                curveToRelative(0.376f, 2.5f, 1.924f, 4.84f, 4.6f, 6.957f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.568f)
                curveTo(6.945f, 14.9f, 5.4f, 17.242f, 5.021f, 19.741f)
                arcTo(1.921f, 1.921f, 0.0f, false, false, 5.477f, 21.3f)
                arcToRelative(2.015f, 2.015f, 0.0f, false, false, 1.528f, 0.7f)
                lineTo(17.0f, 22.0f)
                arcToRelative(2.014f, 2.014f, 0.0f, false, false, 1.528f, -0.7f)
                arcToRelative(1.917f, 1.917f, 0.0f, false, false, 0.456f, -1.554f)
                curveToRelative(-0.373f, -2.487f, -1.92f, -4.829f, -4.6f, -6.962f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.564f)
                curveToRelative(2.681f, -2.133f, 4.228f, -4.475f, 4.6f, -6.963f)
                arcTo(1.916f, 1.916f, 0.0f, false, false, 18.523f, 2.7f)
                arcTo(2.014f, 2.014f, 0.0f, false, false, 17.0f, 2.0f)
                close()
                moveTo(15.681f, 20.0f)
                lineTo(8.318f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.927f, -1.374f)
                arcToRelative(11.185f, 11.185f, 0.0f, false, true, 3.471f, -4.272f)
                lineToRelative(0.518f, -0.412f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.245f, 0.0f)
                lineToRelative(0.509f, 0.406f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 3.473f, 4.276f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.681f, 20.0f)
                close()
                moveTo(10.034f, 18.0f)
                horizontalLineToRelative(3.928f)
                arcTo(11.57f, 11.57f, 0.0f, false, false, 12.0f, 16.0f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 10.034f, 18.0f)
                close()
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
