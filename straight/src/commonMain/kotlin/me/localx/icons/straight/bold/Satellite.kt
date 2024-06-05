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

public val Icons.Bold.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.025f, 14.904f)
                lineToRelative(-4.283f, -4.283f)
                lineToRelative(3.232f, -3.232f)
                curveToRelative(1.365f, -1.365f, 1.365f, -3.585f, 0.0f, -4.95f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-1.322f, -1.322f, -3.629f, -1.321f, -4.949f, 0.0f)
                lineToRelative(-3.232f, 3.232f)
                lineTo(9.11f, -0.011f)
                lineTo(2.739f, 6.36f)
                lineToRelative(3.98f, 3.98f)
                curveToRelative(-0.133f, -0.007f, -0.264f, -0.019f, -0.398f, -0.019f)
                curveToRelative(-1.966f, 0.0f, -3.813f, 0.766f, -5.203f, 2.155f)
                lineTo(0.058f, 13.537f)
                lineToRelative(4.142f, 4.142f)
                lineToRelative(-1.582f, 1.582f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.582f, -1.582f)
                lineToRelative(4.142f, 4.142f)
                lineToRelative(1.061f, -1.061f)
                curveToRelative(1.39f, -1.39f, 2.155f, -3.237f, 2.155f, -5.203f)
                curveToRelative(0.0f, -0.134f, -0.012f, -0.266f, -0.019f, -0.399f)
                lineToRelative(3.995f, 3.995f)
                lineToRelative(6.371f, -6.371f)
                close()
                moveTo(19.783f, 14.904f)
                lineToRelative(-2.129f, 2.129f)
                lineToRelative(-2.162f, -2.162f)
                lineToRelative(2.129f, -2.129f)
                lineToRelative(2.162f, 2.162f)
                close()
                moveTo(18.733f, 3.146f)
                curveToRelative(0.127f, -0.127f, 0.275f, -0.146f, 0.353f, -0.146f)
                reflectiveCurveToRelative(0.226f, 0.019f, 0.354f, 0.146f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0.0f, 0.708f)
                lineToRelative(-8.379f, 8.378f)
                curveToRelative(-0.274f, -0.417f, -0.591f, -0.809f, -0.951f, -1.17f)
                reflectiveCurveToRelative(-0.753f, -0.677f, -1.17f, -0.951f)
                lineTo(18.733f, 3.146f)
                close()
                moveTo(9.11f, 4.231f)
                lineToRelative(2.147f, 2.147f)
                lineToRelative(-2.129f, 2.129f)
                lineToRelative(-2.147f, -2.147f)
                lineToRelative(2.129f, -2.129f)
                close()
                moveTo(10.276f, 19.513f)
                lineToRelative(-5.79f, -5.791f)
                curveToRelative(0.567f, -0.263f, 1.19f, -0.402f, 1.835f, -0.402f)
                curveToRelative(1.164f, 0.0f, 2.258f, 0.453f, 3.081f, 1.276f)
                reflectiveCurveToRelative(1.276f, 1.918f, 1.276f, 3.082f)
                curveToRelative(0.0f, 0.644f, -0.139f, 1.267f, -0.402f, 1.834f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
