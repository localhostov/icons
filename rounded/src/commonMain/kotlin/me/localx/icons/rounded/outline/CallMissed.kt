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

public val Icons.Outline.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                lineTo(3.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 1.0f)
                lineTo(9.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 3.0f)
                lineTo(6.439f, 3.0f)
                lineToRelative(5.906f, 5.926f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, 0.157f, 0.065f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.218f, 0.218f, 0.0f, false, false, 0.156f, -0.064f)
                lineToRelative(6.884f, -6.884f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 1.414f)
                lineToRelative(-6.884f, 6.884f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.57f, 0.65f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.206f, 2.206f, 0.0f, false, true, -1.572f, -0.653f)
                lineTo(5.0f, 4.389f)
                lineTo(5.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 7.0f)
                close()
                moveTo(24.0f, 20.107f)
                lineToRelative(-0.085f, 1.264f)
                arcTo(2.707f, 2.707f, 0.0f, false, true, 21.2f, 24.022f)
                curveToRelative(-0.044f, 0.0f, -2.522f, -0.322f, -2.522f, -0.322f)
                arcToRelative(2.726f, 2.726f, 0.0f, false, true, -2.649f, -2.654f)
                lineToRelative(-0.155f, -1.292f)
                arcTo(11.11f, 11.11f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(10.68f, 10.68f, 0.0f, false, false, -3.863f, 0.744f)
                lineToRelative(-0.157f, 1.3f)
                arcTo(2.726f, 2.726f, 0.0f, false, true, 5.326f, 23.7f)
                reflectiveCurveToRelative(-2.478f, 0.322f, -2.522f, 0.322f)
                arcTo(2.724f, 2.724f, 0.0f, false, true, 0.083f, 21.3f)
                lineTo(0.0f, 20.176f)
                arcTo(5.249f, 5.249f, 0.0f, false, true, 1.556f, 16.4f)
                curveToRelative(4.491f, -4.488f, 16.4f, -4.487f, 20.887f, 0.0f)
                arcTo(5.216f, 5.216f, 0.0f, false, true, 24.0f, 20.107f)
                close()
                moveTo(22.0f, 20.037f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -0.974f, -2.22f)
                curveToRelative(-3.982f, -3.985f, -14.627f, -3.429f, -18.057f, 0.0f)
                arcTo(3.225f, 3.225f, 0.0f, false, false, 2.0f, 20.105f)
                lineToRelative(0.081f, 1.127f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, false, 0.671f, 0.789f)
                reflectiveCurveToRelative(2.458f, -0.32f, 2.5f, -0.32f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, 0.722f, -0.722f)
                curveToRelative(0.0f, -0.04f, 0.239f, -2.05f, 0.239f, -2.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.585f, -0.794f)
                arcTo(12.532f, 12.532f, 0.0f, false, true, 11.942f, 17.0f)
                horizontalLineToRelative(0.063f)
                arcToRelative(13.354f, 13.354f, 0.0f, false, true, 5.18f, 1.128f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.6f, 0.8f)
                reflectiveCurveToRelative(0.239f, 2.01f, 0.239f, 2.05f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, 0.722f, 0.722f)
                curveToRelative(0.044f, 0.0f, 2.5f, 0.32f, 2.5f, 0.32f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, false, 0.669f, -0.719f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
