package me.localx.icons.straight.outline

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

public val Icons.Outline.LocationDotSlash: ImageVector
    get() {
        if (_locationDotSlash != null) {
            return _locationDotSlash!!
        }
        _locationDotSlash = Builder(name = "LocationDotSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.778f, 17.364f)
                lineToRelative(0.293f, -0.287f)
                curveToRelative(1.889f, -1.889f, 2.929f, -4.399f, 2.929f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.183f, -2.929f, -7.071f)
                curveTo(17.183f, 1.047f, 14.672f, 0.007f, 12.001f, 0.007f)
                horizontalLineToRelative(-0.004f)
                curveTo(9.327f, 0.007f, 6.817f, 1.047f, 4.93f, 2.935f)
                curveToRelative(-0.097f, 0.097f, -0.192f, 0.197f, -0.284f, 0.297f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.179f, -5.179f)
                close()
                moveTo(6.343f, 4.35f)
                curveToRelative(1.511f, -1.511f, 3.518f, -2.343f, 5.654f, -2.343f)
                horizontalLineToRelative(0.003f)
                curveToRelative(2.137f, 0.0f, 4.146f, 0.832f, 5.656f, 2.343f)
                curveToRelative(1.511f, 1.511f, 2.343f, 3.52f, 2.343f, 5.657f)
                reflectiveCurveToRelative(-0.832f, 4.146f, -2.336f, 5.648f)
                lineToRelative(-0.301f, 0.294f)
                lineToRelative(-2.844f, -2.844f)
                curveToRelative(0.917f, -0.746f, 1.48f, -1.88f, 1.48f, -3.106f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.227f, 0.0f, -2.36f, 0.563f, -3.106f, 1.48f)
                lineToRelative(-2.833f, -2.833f)
                curveToRelative(0.091f, -0.101f, 0.185f, -0.2f, 0.282f, -0.297f)
                close()
                moveTo(13.091f, 11.677f)
                lineToRelative(-2.768f, -2.768f)
                curveToRelative(0.363f, -0.557f, 0.991f, -0.909f, 1.677f, -0.909f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.685f, -0.352f, 1.313f, -0.909f, 1.677f)
                close()
                moveTo(14.504f, 18.747f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.918f, 3.833f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-2.782f, -2.782f, -3.608f, -6.792f, -2.403f, -10.308f)
                lineToRelative(1.624f, 1.624f)
                curveToRelative(-0.524f, 2.555f, 0.218f, 5.295f, 2.185f, 7.263f)
                lineToRelative(5.657f, 5.532f)
                lineToRelative(2.504f, -2.449f)
                close()
            }
        }
        .build()
        return _locationDotSlash!!
    }

private var _locationDotSlash: ImageVector? = null
