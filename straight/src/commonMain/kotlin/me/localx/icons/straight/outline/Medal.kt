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

public val Icons.Outline.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.98f, 0.0f)
                horizontalLineToRelative(-9.09f)
                lineToRelative(-2.883f, 5.826f)
                lineTo(9.133f, 0.0f)
                lineTo(0.031f, 0.0f)
                lineToRelative(4.751f, 9.63f)
                curveToRelative(-1.119f, 1.5f, -1.782f, 3.359f, -1.782f, 5.37f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -2.012f, -0.664f, -3.871f, -1.783f, -5.371f)
                lineTo(23.98f, 0.0f)
                close()
                moveTo(16.132f, 2.0f)
                horizontalLineToRelative(4.627f)
                lineToRelative(-3.01f, 6.082f)
                curveToRelative(-1.06f, -0.883f, -2.325f, -1.527f, -3.712f, -1.849f)
                lineToRelative(2.095f, -4.233f)
                close()
                moveTo(7.889f, 2.0f)
                lineToRelative(2.086f, 4.23f)
                curveToRelative(-1.393f, 0.321f, -2.663f, 0.967f, -3.727f, 1.853f)
                lineTo(3.248f, 2.0f)
                horizontalLineToRelative(4.642f)
                close()
                moveTo(11.999f, 22.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(13.417f, 13.5f)
                horizontalLineToRelative(3.582f)
                verticalLineToRelative(0.742f)
                lineToRelative(-2.744f, 1.63f)
                lineToRelative(1.154f, 3.135f)
                lineToRelative(-0.635f, 0.443f)
                lineToRelative(-2.762f, -2.136f)
                lineToRelative(-2.773f, 2.145f)
                lineToRelative(-0.611f, -0.46f)
                lineToRelative(1.074f, -3.175f)
                lineToRelative(-2.702f, -1.578f)
                verticalLineToRelative(-0.747f)
                horizontalLineToRelative(3.602f)
                lineToRelative(0.997f, -3.528f)
                horizontalLineToRelative(0.822f)
                lineToRelative(0.996f, 3.528f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
