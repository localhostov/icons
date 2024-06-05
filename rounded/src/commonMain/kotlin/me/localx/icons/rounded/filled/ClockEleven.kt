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

public val Icons.Filled.ClockEleven: ImageVector
    get() {
        if (_clockEleven != null) {
            return _clockEleven!!
        }
        _clockEleven = Builder(name = "ClockEleven", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.0f, 0.428f, -0.273f, 0.809f, -0.678f, 0.947f)
                curveToRelative(-0.105f, 0.036f, -0.214f, 0.053f, -0.322f, 0.053f)
                curveToRelative(-0.305f, 0.0f, -0.6f, -0.14f, -0.793f, -0.391f)
                lineToRelative(-2.437f, -3.172f)
                curveToRelative(-0.336f, -0.438f, -0.254f, -1.066f, 0.184f, -1.402f)
                curveToRelative(0.438f, -0.336f, 1.066f, -0.254f, 1.402f, 0.184f)
                lineToRelative(0.644f, 0.838f)
                verticalLineToRelative(-3.057f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _clockEleven!!
    }

private var _clockEleven: ImageVector? = null
