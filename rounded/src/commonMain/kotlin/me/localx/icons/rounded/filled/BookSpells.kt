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

public val Icons.Filled.BookSpells: ImageVector
    get() {
        if (_bookSpells != null) {
            return _bookSpells!!
        }
        _bookSpells = Builder(name = "BookSpells", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                lineTo(6.967f, 0.0f)
                curveTo(4.224f, 0.0f, 2.0f, 2.229f, 2.0f, 4.973f)
                verticalLineToRelative(12.052f)
                curveToRelative(0.699f, -0.527f, 1.525f, -0.86f, 2.395f, -0.964f)
                curveToRelative(0.199f, -0.041f, 0.402f, -0.061f, 0.605f, -0.061f)
                horizontalLineToRelative(17.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(9.696f, 7.528f)
                curveToRelative(-0.114f, 0.285f, -0.39f, 0.472f, -0.697f, 0.472f)
                reflectiveCurveToRelative(-0.583f, -0.187f, -0.697f, -0.472f)
                lineToRelative(-0.523f, -1.308f)
                lineToRelative(-1.308f, -0.523f)
                curveToRelative(-0.285f, -0.114f, -0.472f, -0.39f, -0.472f, -0.697f)
                reflectiveCurveToRelative(0.187f, -0.583f, 0.472f, -0.697f)
                lineToRelative(1.308f, -0.523f)
                lineToRelative(0.523f, -1.308f)
                curveToRelative(0.114f, -0.285f, 0.39f, -0.472f, 0.697f, -0.472f)
                reflectiveCurveToRelative(0.583f, 0.187f, 0.697f, 0.472f)
                lineToRelative(0.52f, 1.301f)
                lineToRelative(1.299f, 0.492f)
                curveToRelative(0.287f, 0.108f, 0.479f, 0.381f, 0.484f, 0.687f)
                curveToRelative(0.005f, 0.307f, -0.176f, 0.586f, -0.459f, 0.705f)
                lineToRelative(-1.318f, 0.556f)
                lineToRelative(-0.526f, 1.316f)
                close()
                moveTo(17.259f, 11.427f)
                lineToRelative(-1.432f, 0.385f)
                lineToRelative(-0.357f, 1.43f)
                curveToRelative(-0.111f, 0.445f, -0.511f, 0.757f, -0.97f, 0.757f)
                reflectiveCurveToRelative(-0.859f, -0.312f, -0.97f, -0.757f)
                lineToRelative(-0.354f, -1.418f)
                lineToRelative(-1.418f, -0.354f)
                curveToRelative(-0.445f, -0.111f, -0.757f, -0.511f, -0.757f, -0.97f)
                reflectiveCurveToRelative(0.312f, -0.859f, 0.757f, -0.97f)
                lineToRelative(1.418f, -0.354f)
                lineToRelative(0.354f, -1.418f)
                curveToRelative(0.111f, -0.445f, 0.511f, -0.757f, 0.97f, -0.757f)
                reflectiveCurveToRelative(0.859f, 0.312f, 0.97f, 0.757f)
                lineToRelative(0.351f, 1.406f)
                lineToRelative(1.404f, 0.325f)
                curveToRelative(0.447f, 0.103f, 0.767f, 0.498f, 0.775f, 0.956f)
                curveToRelative(0.008f, 0.459f, -0.297f, 0.865f, -0.74f, 0.984f)
                close()
                moveTo(4.999f, 17.999f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.999f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bookSpells!!
    }

private var _bookSpells: ImageVector? = null
