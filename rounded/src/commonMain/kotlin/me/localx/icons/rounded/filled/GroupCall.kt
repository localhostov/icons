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

public val Icons.Filled.GroupCall: ImageVector
    get() {
        if (_groupCall != null) {
            return _groupCall!!
        }
        _groupCall = Builder(name = "GroupCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.364f, 19.763f)
                lineToRelative(1.302f, 1.208f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(-0.522f, 0.6f)
                curveToRelative(-0.551f, 0.552f, -1.277f, 0.813f, -2.0f, 0.813f)
                curveToRelative(-3.714f, 0.0f, -9.143f, -5.143f, -9.143f, -9.143f)
                curveToRelative(0.0f, -0.723f, 0.261f, -1.449f, 0.813f, -2.0f)
                lineToRelative(0.6f, -0.522f)
                curveToRelative(0.446f, -0.446f, 1.17f, -0.446f, 1.616f, 0.0f)
                lineToRelative(1.208f, 1.302f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(-1.025f, 1.036f)
                curveToRelative(0.901f, 2.244f, 2.429f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.036f, -1.025f)
                curveToRelative(0.446f, -0.446f, 1.17f, -0.446f, 1.616f, 0.0f)
                close()
                moveTo(9.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(2.0f, 1.57f, 2.0f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(18.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(5.148f, 14.0f)
                lineTo(1.006f, 14.0f)
                curveToRelative(-0.541f, 0.0f, -1.003f, -0.431f, -1.006f, -0.972f)
                curveToRelative(-0.017f, -3.013f, 2.648f, -5.419f, 5.742f, -4.971f)
                curveToRelative(-0.76f, 0.943f, -1.218f, 2.14f, -1.218f, 3.443f)
                curveToRelative(0.0f, 0.886f, 0.227f, 1.737f, 0.623f, 2.5f)
                close()
                moveTo(10.111f, 16.0f)
                horizontalLineToRelative(-0.611f)
                curveToRelative(-2.765f, 0.0f, -5.515f, 2.257f, -5.5f, 5.025f)
                curveToRelative(0.003f, 0.541f, 0.465f, 0.972f, 1.006f, 0.972f)
                horizontalLineToRelative(8.407f)
                curveToRelative(-1.69f, -1.782f, -2.947f, -3.934f, -3.301f, -5.997f)
                close()
                moveTo(10.0f, 15.0f)
                reflectiveCurveToRelative(0.007f, -0.001f, 0.01f, -0.001f)
                curveToRelative(-0.001f, -0.047f, -0.01f, -0.095f, -0.01f, -0.142f)
                curveToRelative(0.0f, -1.301f, 0.497f, -2.514f, 1.4f, -3.416f)
                lineToRelative(0.66f, -0.581f)
                curveToRelative(0.338f, -0.32f, 0.746f, -0.538f, 1.18f, -0.673f)
                curveToRelative(-0.521f, -1.281f, -1.774f, -2.188f, -3.24f, -2.188f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _groupCall!!
    }

private var _groupCall: ImageVector? = null
