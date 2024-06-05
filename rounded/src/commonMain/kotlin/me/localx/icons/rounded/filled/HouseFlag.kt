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

public val Icons.Filled.HouseFlag: ImageVector
    get() {
        if (_houseFlag != null) {
            return _houseFlag!!
        }
        _houseFlag = Builder(name = "HouseFlag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.728f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-2.005f)
                lineToRelative(-0.016f, -6.893f)
                lineToRelative(4.911f, -2.058f)
                curveToRelative(0.634f, -0.32f, 1.047f, -0.935f, 1.103f, -1.643f)
                curveToRelative(0.057f, -0.708f, -0.253f, -1.379f, -0.828f, -1.796f)
                curveToRelative(-0.031f, -0.022f, -4.271f, -2.402f, -4.271f, -2.402f)
                curveToRelative(-0.626f, -0.312f, -1.353f, -0.279f, -1.946f, 0.087f)
                curveToRelative(-0.594f, 0.367f, -0.948f, 1.003f, -0.948f, 1.702f)
                verticalLineToRelative(13.003f)
                lineTo(5.0f, 24.004f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.203f, -4.145f)
                lineTo(9.203f, 0.859f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.203f, 4.88f)
                curveToRelative(1.252f, 0.942f, 2.0f, 2.41f, 2.0f, 3.989f)
                close()
                moveTo(16.972f, 14.947f)
                lineToRelative(4.082f, -1.708f)
                lineToRelative(-4.096f, -2.259f)
                lineToRelative(0.014f, 3.968f)
                close()
            }
        }
        .build()
        return _houseFlag!!
    }

private var _houseFlag: ImageVector? = null
