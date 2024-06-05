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

public val Icons.Bold.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 5.002f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.501f)
                curveToRelative(0.0f, -0.936f, -0.364f, -1.814f, -1.025f, -2.476f)
                reflectiveCurveTo(15.436f, 0.0f, 14.502f, 0.0f)
                horizontalLineToRelative(-0.003f)
                lineTo(3.5f, 0.005f)
                curveTo(2.567f, 0.005f, 1.688f, 0.37f, 1.026f, 1.032f)
                reflectiveCurveTo(0.0f, 2.573f, 0.0f, 3.507f)
                lineToRelative(0.005f, 13.622f)
                curveToRelative(0.0f, 1.031f, 0.838f, 1.871f, 1.868f, 1.871f)
                curveToRelative(0.184f, 0.0f, 0.366f, -0.027f, 0.542f, -0.081f)
                lineToRelative(3.585f, -1.497f)
                verticalLineToRelative(4.58f)
                horizontalLineToRelative(11.0f)
                lineToRelative(4.443f, 1.863f)
                lineToRelative(0.142f, 0.052f)
                curveToRelative(0.176f, 0.054f, 0.358f, 0.081f, 0.542f, 0.081f)
                curveToRelative(1.03f, 0.0f, 1.868f, -0.84f, 1.868f, -1.871f)
                lineToRelative(0.005f, -13.625f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 3.505f)
                curveToRelative(0.0f, -0.177f, 0.093f, -0.297f, 0.148f, -0.352f)
                curveToRelative(0.055f, -0.056f, 0.175f, -0.148f, 0.353f, -0.148f)
                lineToRelative(11.0f, -0.004f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.179f, 0.0f, 0.297f, 0.092f, 0.352f, 0.146f)
                curveToRelative(0.055f, 0.055f, 0.146f, 0.174f, 0.146f, 0.354f)
                verticalLineToRelative(10.504f)
                lineTo(6.396f, 14.005f)
                lineToRelative(-3.392f, 1.422f)
                lineToRelative(-0.005f, -11.922f)
                close()
                moveTo(20.995f, 20.425f)
                lineToRelative(-3.392f, -1.423f)
                horizontalLineToRelative(-8.604f)
                verticalLineToRelative(-1.997f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.003f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.499f)
                lineToRelative(-0.005f, 11.924f)
                close()
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null
