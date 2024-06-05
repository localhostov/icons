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

public val Icons.Bold.Stretcher: ImageVector
    get() {
        if (_stretcher != null) {
            return _stretcher!!
        }
        _stretcher = Builder(name = "Stretcher", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.05f, 12.0f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-3.0f)
                lineTo(7.859f, 9.0f)
                lineTo(2.622f, 0.061f)
                lineTo(0.034f, 1.576f)
                lineToRelative(6.106f, 10.424f)
                horizontalLineToRelative(1.809f)
                lineToRelative(4.732f, 4.013f)
                lineToRelative(-2.586f, 2.194f)
                curveToRelative(-0.339f, -0.133f, -0.708f, -0.207f, -1.095f, -0.207f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.152f, -0.011f, -0.301f, -0.033f, -0.447f)
                lineToRelative(3.033f, -2.573f)
                lineToRelative(3.033f, 2.573f)
                curveToRelative(-0.022f, 0.146f, -0.033f, 0.295f, -0.033f, 0.447f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.386f, 0.0f, -0.755f, 0.074f, -1.095f, 0.207f)
                lineToRelative(-2.586f, -2.194f)
                lineToRelative(4.732f, -4.013f)
                close()
                moveTo(12.587f, 12.0f)
                horizontalLineToRelative(4.825f)
                lineToRelative(-2.413f, 2.046f)
                lineToRelative(-2.413f, -2.046f)
                close()
            }
        }
        .build()
        return _stretcher!!
    }

private var _stretcher: ImageVector? = null
