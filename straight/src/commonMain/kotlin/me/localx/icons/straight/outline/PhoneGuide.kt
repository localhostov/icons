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

public val Icons.Outline.PhoneGuide: ImageVector
    get() {
        if (_phoneGuide != null) {
            return _phoneGuide!!
        }
        _phoneGuide = Builder(name = "PhoneGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 22.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.508f)
                curveToRelative(-0.404f, -0.65f, -0.735f, -1.322f, -0.986f, -2.0f)
                horizontalLineToRelative(-4.522f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(10.998f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.273f)
                curveToRelative(-0.805f, -0.578f, -1.558f, -1.257f, -2.235f, -2.0f)
                lineTo(3.0f, 22.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.352f, 0.0f, -0.686f, 0.072f, -1.0f, 0.184f)
                lineTo(2.0f, 3.0f)
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
