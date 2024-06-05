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

public val Icons.Bold.Method: ImageVector
    get() {
        if (_method != null) {
            return _method!!
        }
        _method = Builder(name = "Method", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 6.0f)
                curveToRelative(0.0f, -0.28f, -0.033f, -0.552f, -0.083f, -0.818f)
                lineToRelative(1.529f, -0.883f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(-1.542f, 0.89f)
                curveToRelative(-0.413f, -0.352f, -0.884f, -0.629f, -1.404f, -0.815f)
                lineTo(19.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.776f)
                curveToRelative(-0.521f, 0.186f, -0.992f, 0.463f, -1.404f, 0.815f)
                lineToRelative(-1.542f, -0.89f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(1.529f, 0.883f)
                curveToRelative(-0.049f, 0.266f, -0.083f, 0.538f, -0.083f, 0.818f)
                reflectiveCurveToRelative(0.033f, 0.552f, 0.083f, 0.818f)
                lineToRelative(-1.529f, 0.883f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(1.542f, -0.89f)
                curveToRelative(0.413f, 0.352f, 0.884f, 0.629f, 1.404f, 0.815f)
                verticalLineToRelative(1.776f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.776f)
                curveToRelative(0.521f, -0.186f, 0.992f, -0.463f, 1.404f, -0.815f)
                lineToRelative(1.542f, 0.89f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.529f, -0.883f)
                curveToRelative(0.049f, -0.266f, 0.083f, -0.538f, 0.083f, -0.819f)
                close()
                moveTo(18.0f, 7.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.121f, 16.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(0.0f, 6.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.121f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(1.879f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-1.879f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(7.879f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.879f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(13.879f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _method!!
    }

private var _method: ImageVector? = null
