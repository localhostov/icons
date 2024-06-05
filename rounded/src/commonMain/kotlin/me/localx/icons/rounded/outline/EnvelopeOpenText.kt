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

public val Icons.Outline.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(8.0f, 7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 12.708f)
                verticalLineToRelative(6.292f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.292f)
                curveToRelative(0.0f, -1.356f, 0.562f, -2.673f, 1.541f, -3.611f)
                lineToRelative(1.459f, -1.398f)
                verticalLineToRelative(-3.699f)
                curveTo(3.0f, 1.794f, 4.794f, 0.0f, 7.0f, 0.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(3.699f)
                lineToRelative(1.459f, 1.397f)
                curveToRelative(0.979f, 0.938f, 1.541f, 2.254f, 1.541f, 3.611f)
                close()
                moveTo(5.0f, 4.0f)
                lineTo(5.0f, 12.243f)
                lineToRelative(4.878f, 4.879f)
                curveToRelative(1.134f, 1.133f, 3.11f, 1.133f, 4.243f, 0.0f)
                lineToRelative(4.879f, -4.879f)
                lineTo(19.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                close()
                moveTo(22.0f, 12.708f)
                curveToRelative(0.0f, -0.195f, -0.02f, -0.389f, -0.058f, -0.579f)
                lineToRelative(-6.407f, 6.407f)
                curveToRelative(-0.944f, 0.944f, -2.199f, 1.464f, -3.535f, 1.464f)
                reflectiveCurveToRelative(-2.591f, -0.52f, -3.536f, -1.464f)
                lineTo(2.058f, 12.128f)
                curveToRelative(-0.038f, 0.19f, -0.058f, 0.384f, -0.058f, 0.579f)
                verticalLineToRelative(6.292f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.292f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
