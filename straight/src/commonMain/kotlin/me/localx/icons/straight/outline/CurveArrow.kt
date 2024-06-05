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

public val Icons.Outline.CurveArrow: ImageVector
    get() {
        if (_curveArrow != null) {
            return _curveArrow!!
        }
        _curveArrow = Builder(name = "CurveArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.772f, 19.45f)
                lineToRelative(-2.772f, -2.95f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.956f, 0.0f, -1.954f, -1.876f, -2.756f, -3.383f)
                curveToRelative(-0.99f, -1.86f, -1.925f, -3.617f, -3.494f, -3.617f)
                reflectiveCurveToRelative(-2.504f, 1.757f, -3.494f, 3.617f)
                curveToRelative(-0.802f, 1.507f, -1.8f, 3.383f, -2.756f, 3.383f)
                horizontalLineToRelative(-0.754f)
                curveToRelative(0.613f, -1.295f, 1.175f, -3.208f, 1.884f, -5.716f)
                curveToRelative(0.687f, -2.43f, 1.959f, -6.93f, 2.869f, -7.274f)
                curveToRelative(0.571f, 0.211f, 1.284f, 2.057f, 1.906f, 4.01f)
                curveToRelative(0.114f, -0.009f, 0.226f, -0.02f, 0.345f, -0.02f)
                curveToRelative(0.716f, 0.0f, 1.338f, 0.176f, 1.888f, 0.469f)
                curveToRelative(-1.212f, -4.057f, -2.255f, -6.469f, -4.138f, -6.469f)
                curveToRelative(-2.213f, 0.0f, -3.264f, 3.321f, -4.795f, 8.74f)
                curveToRelative(-0.616f, 2.181f, -1.527f, 5.401f, -2.205f, 6.164f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(2.5f)
                lineTo(4.55f, 0.228f)
                curveToRelative(-0.304f, -0.304f, -0.796f, -0.304f, -1.1f, 0.0f)
                lineTo(0.5f, 3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(2.772f, -2.95f)
                curveToRelative(0.304f, -0.304f, 0.304f, -0.796f, 0.0f, -1.1f)
                close()
                moveTo(12.521f, 16.557f)
                curveToRelative(0.46f, -0.864f, 1.315f, -2.471f, 1.721f, -2.557f)
                curveToRelative(0.421f, 0.086f, 1.276f, 1.693f, 1.736f, 2.557f)
                curveToRelative(0.44f, 0.828f, 0.908f, 1.693f, 1.442f, 2.443f)
                horizontalLineToRelative(-6.341f)
                curveToRelative(0.534f, -0.75f, 1.001f, -1.616f, 1.442f, -2.443f)
                close()
            }
        }
        .build()
        return _curveArrow!!
    }

private var _curveArrow: ImageVector? = null
