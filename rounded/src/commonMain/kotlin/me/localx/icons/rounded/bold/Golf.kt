package me.localx.icons.rounded.bold

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

public val Icons.Bold.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, -3.0f, 0.211f)
                verticalLineToRelative(-1.271f)
                lineToRelative(4.609f, -1.908f)
                curveToRelative(0.035f, -0.014f, 0.07f, -0.03f, 0.1f, -0.047f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.34f, -4.256f)
                curveToRelative(-0.049f, -0.036f, -4.431f, -2.464f, -4.431f, -2.464f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.618f, 2.235f)
                verticalLineToRelative(8.383f)
                curveToRelative(-3.639f, 1.176f, -6.0f, 3.417f, -6.0f, 6.117f)
                curveToRelative(0.0f, 3.991f, 5.159f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.009f, 12.0f, -7.0f)
                reflectiveCurveToRelative(-5.159f, -7.0f, -12.0f, -7.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-5.151f, 0.0f, -9.0f, -2.112f, -9.0f, -4.0f)
                curveToRelative(0.0f, -1.025f, 1.14f, -2.113f, 3.0f, -2.9f)
                verticalLineToRelative(2.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-3.246f)
                arcToRelative(17.713f, 17.713f, 0.0f, false, true, 3.0f, -0.254f)
                curveToRelative(5.151f, 0.0f, 9.0f, 2.112f, 9.0f, 4.0f)
                reflectiveCurveToRelative(-3.849f, 4.0f, -9.0f, 4.0f)
                close()
                moveTo(17.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
