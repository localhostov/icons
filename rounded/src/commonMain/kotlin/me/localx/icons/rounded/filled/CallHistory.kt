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

public val Icons.Filled.CallHistory: ImageVector
    get() {
        if (_callHistory != null) {
            return _callHistory!!
        }
        _callHistory = Builder(name = "CallHistory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.657f, 14.858f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, -4.282f, 0.007f)
                lineToRelative(-1.906f, 1.606f)
                arcTo(12.786f, 12.786f, 0.0f, false, true, 7.537f, 9.526f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.006f, -4.281f)
                reflectiveCurveTo(7.292f, 0.942f, 7.261f, 0.911f)
                arcTo(3.081f, 3.081f, 0.0f, false, false, 2.934f, 0.865f)
                lineToRelative(-1.15f, 1.0f)
                curveToRelative(-7.72f, 8.208f, 12.2f, 28.138f, 20.4f, 20.3f)
                lineToRelative(0.912f, -1.05f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.0f, -4.376f)
                curveTo(23.064f, 16.71f, 20.657f, 14.858f, 20.657f, 14.858f)
                close()
                moveTo(22.565f, 12.575f)
                curveToRelative(4.991f, -7.346f, -3.8f, -16.123f, -11.138f, -11.136f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.145f, 1.64f)
                curveToRelative(5.472f, -3.758f, 12.11f, 2.883f, 8.353f, 8.352f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.64f, 1.144f)
                close()
                moveTo(18.707f, 10.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(17.0f, 7.589f)
                lineTo(17.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(15.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _callHistory!!
    }

private var _callHistory: ImageVector? = null
