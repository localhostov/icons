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

public val Icons.Outline.Golf: ImageVector
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
                arcToRelative(20.378f, 20.378f, 0.0f, false, false, -4.0f, 0.392f)
                verticalLineToRelative(-2.339f)
                lineToRelative(6.915f, -3.494f)
                lineToRelative(-5.881f, -4.259f)
                lineToRelative(-0.134f, -0.088f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.9f, 1.788f)
                verticalLineToRelative(8.914f)
                curveToRelative(-3.609f, 1.195f, -6.0f, 3.446f, -6.0f, 6.086f)
                curveToRelative(0.0f, 3.925f, 5.271f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.075f, 12.0f, -7.0f)
                reflectiveCurveToRelative(-5.271f, -7.0f, -12.0f, -7.0f)
                close()
                moveTo(8.0f, 2.018f)
                lineTo(11.085f, 4.253f)
                lineTo(8.0f, 5.812f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.42f, 0.0f, -10.0f, -2.29f, -10.0f, -5.0f)
                curveToRelative(0.0f, -1.594f, 1.591f, -3.039f, 4.0f, -3.962f)
                verticalLineToRelative(3.962f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.563f)
                arcToRelative(18.274f, 18.274f, 0.0f, false, true, 4.0f, -0.437f)
                curveToRelative(5.42f, 0.0f, 10.0f, 2.29f, 10.0f, 5.0f)
                reflectiveCurveToRelative(-4.58f, 5.0f, -10.0f, 5.0f)
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
