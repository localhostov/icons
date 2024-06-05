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

public val Icons.Bold.GrateDroplet: ImageVector
    get() {
        if (_grateDroplet != null) {
            return _grateDroplet!!
        }
        _grateDroplet = Builder(name = "GrateDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(7.0f, 10.5f)
                lineTo(3.0f, 10.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(19.549f, 11.83f)
                curveToRelative(-0.584f, -0.57f, -1.514f, -0.57f, -2.098f, 0.0f)
                lineToRelative(-2.84f, 2.777f)
                curveToRelative(-1.039f, 1.039f, -1.611f, 2.42f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.572f, 2.851f, 1.611f, 3.89f)
                reflectiveCurveToRelative(2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.851f, -0.572f, 3.889f, -1.611f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.42f, 1.611f, -3.89f)
                reflectiveCurveToRelative(-0.572f, -2.85f, -1.623f, -3.9f)
                lineToRelative(-2.828f, -2.766f)
                close()
                moveTo(20.268f, 20.265f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.94f, 0.943f, -2.588f, 0.945f, -3.534f, 0.0f)
                curveToRelative(-0.473f, -0.473f, -0.732f, -1.101f, -0.732f, -1.769f)
                reflectiveCurveToRelative(0.26f, -1.295f, 0.721f, -1.756f)
                lineToRelative(1.779f, -1.74f)
                lineToRelative(1.768f, 1.729f)
                curveToRelative(0.473f, 0.473f, 0.732f, 1.101f, 0.732f, 1.768f)
                reflectiveCurveToRelative(-0.26f, 1.296f, -0.732f, 1.769f)
                close()
            }
        }
        .build()
        return _grateDroplet!!
    }

private var _grateDroplet: ImageVector? = null
