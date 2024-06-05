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

public val Icons.Bold.WaterLadder: ImageVector
    get() {
        if (_waterLadder != null) {
            return _waterLadder!!
        }
        _waterLadder = Builder(name = "WaterLadder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.5f, 18.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-3.032f, 0.0f, -5.5f, 2.468f, -5.5f, 5.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(23.798f, 21.346f)
                curveToRelative(0.415f, 0.717f, 0.171f, 1.634f, -0.546f, 2.05f)
                curveToRelative(-0.682f, 0.396f, -1.461f, 0.604f, -2.252f, 0.604f)
                curveToRelative(-0.983f, 0.0f, -1.977f, -0.32f, -2.796f, -0.903f)
                curveToRelative(-0.131f, -0.092f, -0.277f, -0.093f, -0.406f, 0.0f)
                curveToRelative(-1.643f, 1.168f, -3.955f, 1.167f, -5.594f, 0.0f)
                curveToRelative(-0.131f, -0.092f, -0.277f, -0.093f, -0.406f, 0.0f)
                curveToRelative(-1.643f, 1.168f, -3.955f, 1.167f, -5.594f, 0.0f)
                curveToRelative(-0.131f, -0.092f, -0.277f, -0.093f, -0.406f, 0.0f)
                curveToRelative(-1.484f, 1.055f, -3.525f, 1.186f, -5.052f, 0.299f)
                curveToRelative(-0.716f, -0.416f, -0.959f, -1.334f, -0.543f, -2.051f)
                curveToRelative(0.416f, -0.716f, 1.334f, -0.958f, 2.051f, -0.543f)
                curveToRelative(0.529f, 0.308f, 1.265f, 0.233f, 1.806f, -0.149f)
                curveToRelative(1.16f, -0.827f, 2.723f, -0.825f, 3.883f, 0.0f)
                curveToRelative(0.621f, 0.441f, 1.492f, 0.442f, 2.117f, 0.0f)
                curveToRelative(1.16f, -0.827f, 2.723f, -0.825f, 3.883f, 0.0f)
                curveToRelative(0.621f, 0.441f, 1.492f, 0.442f, 2.117f, 0.0f)
                curveToRelative(1.161f, -0.827f, 2.724f, -0.825f, 3.883f, 0.0f)
                curveToRelative(0.541f, 0.384f, 1.267f, 0.459f, 1.806f, 0.147f)
                curveToRelative(0.715f, -0.412f, 1.635f, -0.172f, 2.05f, 0.546f)
                close()
            }
        }
        .build()
        return _waterLadder!!
    }

private var _waterLadder: ImageVector? = null
