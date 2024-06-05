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

public val Icons.Bold.EmailPending: ImageVector
    get() {
        if (_emailPending != null) {
            return _emailPending!!
        }
        _emailPending = Builder(name = "EmailPending", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 11.706f)
                curveToRelative(1.153f, -0.343f, 2.18f, -0.974f, 3.0f, -1.812f)
                verticalLineToRelative(14.106f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.794f)
                curveToRelative(-0.189f, 0.634f, -0.294f, 1.305f, -0.294f, 2.0f)
                curveToRelative(0.0f, 0.34f, 0.033f, 0.673f, 0.08f, 1.0f)
                lineTo(3.5f, 6.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(0.383f)
                lineToRelative(7.374f, 7.446f)
                curveToRelative(0.861f, 0.861f, 2.386f, 0.866f, 3.258f, -0.005f)
                lineToRelative(2.812f, -2.812f)
                curveToRelative(0.793f, 0.311f, 1.653f, 0.488f, 2.556f, 0.488f)
                curveToRelative(0.454f, 0.0f, 0.897f, -0.047f, 1.328f, -0.13f)
                lineToRelative(-4.575f, 4.575f)
                curveToRelative(-1.003f, 1.003f, -2.336f, 1.555f, -3.753f, 1.555f)
                reflectiveCurveToRelative(-2.75f, -0.552f, -3.753f, -1.555f)
                lineToRelative(-5.247f, -5.299f)
                verticalLineToRelative(9.853f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-9.294f)
                close()
                moveTo(14.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, 2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                close()
                moveTo(18.0f, 5.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.707f, -1.707f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.414f)
                close()
            }
        }
        .build()
        return _emailPending!!
    }

private var _emailPending: ImageVector? = null
