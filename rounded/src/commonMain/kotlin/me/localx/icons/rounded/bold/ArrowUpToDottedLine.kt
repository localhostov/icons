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

public val Icons.Bold.ArrowUpToDottedLine: ImageVector
    get() {
        if (_arrowUpToDottedLine != null) {
            return _arrowUpToDottedLine!!
        }
        _arrowUpToDottedLine = Builder(name = "ArrowUpToDottedLine", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.538f, 9.917f)
                curveToRelative(0.598f, 0.573f, 0.618f, 1.522f, 0.045f, 2.121f)
                curveToRelative(-0.294f, 0.308f, -0.688f, 0.462f, -1.083f, 0.462f)
                curveToRelative(-0.373f, 0.0f, -0.747f, -0.138f, -1.038f, -0.417f)
                lineToRelative(-2.962f, -2.838f)
                verticalLineToRelative(13.255f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                lineTo(10.5f, 9.245f)
                lineToRelative(-2.962f, 2.838f)
                curveToRelative(-0.598f, 0.574f, -1.548f, 0.552f, -2.121f, -0.045f)
                curveToRelative(-0.573f, -0.598f, -0.553f, -1.548f, 0.045f, -2.121f)
                lineToRelative(4.086f, -3.914f)
                curveToRelative(0.638f, -0.639f, 1.517f, -1.003f, 2.452f, -1.003f)
                reflectiveCurveToRelative(1.814f, 0.364f, 2.475f, 1.025f)
                lineToRelative(4.063f, 3.892f)
                close()
                moveTo(22.0f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(7.0f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(2.0f, 0.0f)
                curveTo(1.172f, 0.0f, 0.5f, 0.672f, 0.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowUpToDottedLine!!
    }

private var _arrowUpToDottedLine: ImageVector? = null
