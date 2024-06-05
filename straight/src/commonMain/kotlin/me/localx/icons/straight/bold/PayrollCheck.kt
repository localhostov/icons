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

public val Icons.Bold.PayrollCheck: ImageVector
    get() {
        if (_payrollCheck != null) {
            return _payrollCheck!!
        }
        _payrollCheck = Builder(name = "PayrollCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveTo(1.57f, 2.0f, 0.0f, 3.57f, 0.0f, 5.5f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(19.292f, 13.626f)
                curveToRelative(0.0f, 1.199f, -0.975f, 2.173f, -2.174f, 2.173f)
                horizontalLineToRelative(-0.326f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-1.201f, 0.0f, -2.189f, -0.925f, -2.291f, -2.1f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.086f, 0.289f, 0.354f, 0.5f, 0.671f, 0.5f)
                horizontalLineToRelative(2.126f)
                curveToRelative(0.316f, 0.0f, 0.574f, -0.257f, 0.574f, -0.574f)
                curveToRelative(0.0f, -0.272f, -0.194f, -0.509f, -0.462f, -0.563f)
                lineToRelative(-2.791f, -0.559f)
                curveToRelative(-1.013f, -0.203f, -1.747f, -1.099f, -1.747f, -2.131f)
                curveToRelative(0.0f, -1.199f, 0.975f, -2.173f, 2.173f, -2.173f)
                horizontalLineToRelative(0.327f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(0.2f)
                curveToRelative(1.201f, 0.0f, 2.189f, 0.925f, 2.291f, 2.1f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.086f, -0.289f, -0.354f, -0.5f, -0.671f, -0.5f)
                horizontalLineToRelative(-2.127f)
                curveToRelative(-0.316f, 0.0f, -0.573f, 0.257f, -0.573f, 0.574f)
                curveToRelative(0.0f, 0.272f, 0.194f, 0.509f, 0.461f, 0.562f)
                lineToRelative(2.792f, 0.559f)
                curveToRelative(1.013f, 0.202f, 1.747f, 1.099f, 1.747f, 2.131f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _payrollCheck!!
    }

private var _payrollCheck: ImageVector? = null
