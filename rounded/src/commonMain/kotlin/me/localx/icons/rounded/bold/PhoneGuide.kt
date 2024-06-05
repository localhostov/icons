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
                moveToRelative(11.5f, 21.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                lineToRelative(0.031f, 14.0f)
                curveToRelative(0.0f, 2.5f, 2.092f, 4.5f, 4.469f, 4.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.529f, 0.0f, -1.029f, 0.108f, -1.5f, 0.276f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(23.665f, 22.587f)
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
                lineToRelative(1.302f, 1.208f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                close()
            }
        }
        .build()
        return _phoneGuide!!
    }

private var _phoneGuide: ImageVector? = null
