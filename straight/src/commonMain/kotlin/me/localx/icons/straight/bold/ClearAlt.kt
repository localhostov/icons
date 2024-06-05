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

public val Icons.Bold.ClearAlt: ImageVector
    get() {
        if (_clearAlt != null) {
            return _clearAlt!!
        }
        _clearAlt = Builder(name = "ClearAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveTo(21.314f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(21.536f, 8.121f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(2.121f, 2.121f)
                close()
                moveTo(13.001f, 12.235f)
                curveToRelative(0.794f, 0.638f, 1.711f, 1.128f, 2.711f, 1.427f)
                lineToRelative(-0.711f, 0.864f)
                verticalLineToRelative(9.486f)
                lineToRelative(-8.0f, -4.8f)
                verticalLineToRelative(-4.686f)
                lineTo(0.0f, 6.026f)
                verticalLineToRelative(-2.538f)
                curveTo(0.0f, 1.558f, 1.57f, -0.012f, 3.5f, -0.012f)
                horizontalLineToRelative(9.24f)
                curveToRelative(-0.93f, 0.815f, -1.672f, 1.838f, -2.146f, 3.0f)
                lineTo(3.5f, 2.988f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.462f)
                lineToRelative(7.0f, 8.5f)
                verticalLineToRelative(4.064f)
                lineToRelative(2.0f, 1.2f)
                verticalLineToRelative(-5.264f)
                lineToRelative(1.0f, -1.214f)
                close()
            }
        }
        .build()
        return _clearAlt!!
    }

private var _clearAlt: ImageVector? = null
