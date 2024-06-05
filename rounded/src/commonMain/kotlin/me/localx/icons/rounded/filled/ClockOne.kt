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

public val Icons.Filled.ClockOne: ImageVector
    get() {
        if (_clockOne != null) {
            return _clockOne!!
        }
        _clockOne = Builder(name = "ClockOne", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.229f, 9.438f)
                lineToRelative(-2.437f, 3.172f)
                curveToRelative(-0.193f, 0.251f, -0.488f, 0.391f, -0.793f, 0.391f)
                curveToRelative(-0.107f, 0.0f, -0.216f, -0.017f, -0.321f, -0.053f)
                curveToRelative(-0.406f, -0.138f, -0.679f, -0.519f, -0.679f, -0.947f)
                lineTo(10.999f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.057f)
                lineToRelative(0.644f, -0.838f)
                curveToRelative(0.337f, -0.437f, 0.963f, -0.521f, 1.402f, -0.184f)
                curveToRelative(0.438f, 0.336f, 0.521f, 0.964f, 0.184f, 1.402f)
                close()
            }
        }
        .build()
        return _clockOne!!
    }

private var _clockOne: ImageVector? = null
