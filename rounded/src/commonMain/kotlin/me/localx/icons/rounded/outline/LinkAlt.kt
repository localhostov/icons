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

public val Icons.Outline.LinkAlt: ImageVector
    get() {
        if (_linkAlt != null) {
            return _linkAlt!!
        }
        _linkAlt = Builder(name = "LinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.835f, 16.17f)
                curveToRelative(-0.23f, -0.23f, -0.446f, -0.482f, -0.641f, -0.748f)
                curveToRelative(-0.325f, -0.446f, -0.227f, -1.072f, 0.22f, -1.397f)
                curveToRelative(0.446f, -0.325f, 1.071f, -0.227f, 1.397f, 0.219f)
                curveToRelative(0.129f, 0.178f, 0.274f, 0.349f, 0.437f, 0.511f)
                curveToRelative(0.803f, 0.803f, 1.87f, 1.245f, 3.005f, 1.245f)
                reflectiveCurveToRelative(2.203f, -0.442f, 3.005f, -1.245f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(1.657f, -1.657f, 1.657f, -4.354f, 0.0f, -6.011f)
                reflectiveCurveToRelative(-4.354f, -1.657f, -6.011f, 0.0f)
                lineToRelative(-1.058f, 1.058f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.058f, -1.058f)
                curveToRelative(2.437f, -2.438f, 6.402f, -2.438f, 8.839f, 0.0f)
                curveToRelative(2.437f, 2.437f, 2.437f, 6.402f, 0.0f, 8.839f)
                lineToRelative(-5.5f, 5.5f)
                curveToRelative(-1.18f, 1.181f, -2.75f, 1.831f, -4.419f, 1.831f)
                reflectiveCurveToRelative(-3.239f, -0.65f, -4.418f, -1.83f)
                close()
                moveTo(6.253f, 24.0f)
                curveToRelative(1.67f, 0.0f, 3.239f, -0.65f, 4.419f, -1.831f)
                lineToRelative(1.058f, -1.058f)
                curveToRelative(0.391f, -0.39f, 0.391f, -1.023f, 0.0f, -1.414f)
                curveToRelative(-0.39f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-1.059f, 1.058f)
                curveToRelative(-0.803f, 0.803f, -1.87f, 1.245f, -3.005f, 1.245f)
                reflectiveCurveToRelative(-2.202f, -0.442f, -3.005f, -1.245f)
                reflectiveCurveToRelative(-1.245f, -1.87f, -1.245f, -3.005f)
                reflectiveCurveToRelative(0.442f, -2.203f, 1.245f, -3.005f)
                lineToRelative(5.5f, -5.5f)
                curveToRelative(0.803f, -0.803f, 1.87f, -1.245f, 3.005f, -1.245f)
                reflectiveCurveToRelative(2.203f, 0.442f, 3.005f, 1.245f)
                curveToRelative(0.16f, 0.161f, 0.306f, 0.332f, 0.436f, 0.51f)
                curveToRelative(0.324f, 0.447f, 0.949f, 0.547f, 1.397f, 0.221f)
                curveToRelative(0.447f, -0.325f, 0.546f, -0.95f, 0.221f, -1.397f)
                curveToRelative(-0.19f, -0.262f, -0.405f, -0.513f, -0.639f, -0.747f)
                curveToRelative(-1.181f, -1.182f, -2.751f, -1.832f, -4.42f, -1.832f)
                reflectiveCurveToRelative(-3.239f, 0.65f, -4.419f, 1.831f)
                lineTo(1.834f, 13.331f)
                curveTo(0.653f, 14.511f, 0.003f, 16.081f, 0.003f, 17.75f)
                curveToRelative(0.0f, 1.669f, 0.65f, 3.239f, 1.831f, 4.419f)
                curveToRelative(1.18f, 1.181f, 2.749f, 1.831f, 4.419f, 1.831f)
                close()
            }
        }
        .build()
        return _linkAlt!!
    }

private var _linkAlt: ImageVector? = null
