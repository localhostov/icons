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

public val Icons.Bold.PhoneGuide: ImageVector
    get() {
        if (_phoneGuide != null) {
            return _phoneGuide!!
        }
        _phoneGuide = Builder(name = "PhoneGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.202f, 21.0f)
                lineTo(4.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.952f)
                curveToRelative(-0.49f, -0.989f, -0.803f, -2.005f, -0.905f, -3.0f)
                horizontalLineToRelative(-1.048f)
                lineTo(8.999f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.999f)
                lineToRelative(3.0f, 3.0f)
                lineTo(21.999f, 2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(11.273f)
                curveToRelative(-1.154f, -0.829f, -2.21f, -1.862f, -3.071f, -3.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.347f, 0.0f, -0.678f, 0.058f, -1.0f, 0.142f)
                lineTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 21.827f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.539f, 0.539f, -1.249f, 0.795f, -1.957f, 0.795f)
                curveToRelative(-3.634f, 0.0f, -8.665f, -4.752f, -8.665f, -8.665f)
                curveToRelative(0.0f, -0.708f, 0.255f, -1.418f, 0.795f, -1.957f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(2.712f, 2.712f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(0.882f, 2.195f, 2.376f, 3.63f, 4.403f, 4.403f)
                lineToRelative(1.775f, -1.775f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(2.712f, 2.713f, 2.712f, 2.713f)
                close()
            }
        }
        .build()
        return _phoneGuide!!
    }

private var _phoneGuide: ImageVector? = null
