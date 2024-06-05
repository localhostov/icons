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
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(13.418f)
                curveToRelative(-0.073f, -0.068f, -0.15f, -0.129f, -0.221f, -0.2f)
                curveToRelative(-0.803f, -0.803f, -1.394f, -1.76f, -1.761f, -2.8f)
                horizontalLineToRelative(-1.436f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(2.919f)
                curveToRelative(0.092f, -0.103f, 0.18f, -0.208f, 0.278f, -0.307f)
                lineToRelative(3.803f, -3.719f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(6.952f)
                lineToRelative(2.775f, 2.714f)
                curveToRelative(0.079f, 0.079f, 0.149f, 0.165f, 0.225f, 0.247f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 10.5f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(7.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(14.0f, 10.5f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(18.5f, 10.805f)
                lineToRelative(-3.889f, 3.803f)
                curveToRelative(-1.039f, 1.039f, -1.611f, 2.42f, -1.611f, 3.889f)
                reflectiveCurveToRelative(0.572f, 2.851f, 1.611f, 3.89f)
                reflectiveCurveToRelative(2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.851f, -0.572f, 3.889f, -1.611f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.42f, 1.611f, -3.89f)
                reflectiveCurveToRelative(-0.572f, -2.85f, -1.623f, -3.9f)
                lineToRelative(-3.877f, -3.791f)
                close()
                moveTo(20.268f, 20.265f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.94f, 0.944f, -2.588f, 0.946f, -3.534f, 0.0f)
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
