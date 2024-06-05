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

public val Icons.Bold.Script: ImageVector
    get() {
        if (_script != null) {
            return _script!!
        }
        _script = Builder(name = "Script", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.269f, 6.481f)
                lineTo(20.103f, 0.673f)
                curveToRelative(0.953f, -0.953f, 2.534f, -0.894f, 3.409f, 0.176f)
                curveToRelative(0.761f, 0.93f, 0.598f, 2.317f, -0.252f, 3.167f)
                lineToRelative(-5.741f, 5.715f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.269f, -3.064f, 1.269f)
                horizontalLineToRelative(-0.955f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.955f)
                curveToRelative(0.0f, -1.149f, 0.457f, -2.252f, 1.269f, -3.064f)
                close()
                moveTo(24.0f, 19.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                curveTo(0.0f, 1.898f, 1.635f, 0.158f, 3.697f, 0.0f)
                horizontalLineToRelative(10.803f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.642f)
                curveToRelative(0.084f, 0.322f, 0.142f, 0.653f, 0.142f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(5.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 19.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.345f, -0.044f, 0.681f, -0.127f, 1.0f)
                horizontalLineToRelative(7.127f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _script!!
    }

private var _script: ImageVector? = null
