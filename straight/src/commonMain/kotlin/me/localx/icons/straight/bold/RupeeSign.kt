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

public val Icons.Bold.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.5f)
                curveTo(15.0f, 3.364f, 11.636f, 0.0f, 7.5f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 15.0f)
                horizontalLineToRelative(3.315f)
                lineToRelative(4.846f, 9.0f)
                horizontalLineToRelative(3.407f)
                lineToRelative(-5.002f, -9.289f)
                curveToRelative(3.135f, -0.899f, 5.435f, -3.791f, 5.435f, -7.211f)
                close()
                moveTo(3.0f, 3.0f)
                lineTo(7.5f, 3.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(3.0f, 12.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(21.0f, 16.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.251f, 0.159f, 0.473f, 0.397f, 0.552f)
                lineToRelative(3.153f, 1.051f)
                curveToRelative(1.465f, 0.488f, 2.449f, 1.854f, 2.449f, 3.397f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.251f, -0.159f, -0.473f, -0.397f, -0.552f)
                lineToRelative(-3.153f, -1.051f)
                curveToRelative(-1.465f, -0.488f, -2.449f, -1.854f, -2.449f, -3.397f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
