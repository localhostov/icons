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

public val Icons.Bold.ArrowUpFromSquare: ImageVector
    get() {
        if (_arrowUpFromSquare != null) {
            return _arrowUpFromSquare!!
        }
        _arrowUpFromSquare = Builder(name = "ArrowUpFromSquare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.417f, 7.538f)
                curveToRelative(-0.573f, -0.598f, -0.553f, -1.548f, 0.045f, -2.121f)
                lineTo(9.548f, 1.503f)
                curveToRelative(0.638f, -0.639f, 1.517f, -1.003f, 2.452f, -1.003f)
                reflectiveCurveToRelative(1.814f, 0.364f, 2.475f, 1.025f)
                lineToRelative(4.062f, 3.892f)
                curveToRelative(0.598f, 0.573f, 0.619f, 1.522f, 0.045f, 2.121f)
                curveToRelative(-0.294f, 0.308f, -0.688f, 0.462f, -1.083f, 0.462f)
                curveToRelative(-0.374f, 0.0f, -0.747f, -0.138f, -1.038f, -0.417f)
                lineToRelative(-2.962f, -2.838f)
                lineTo(13.499f, 15.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                lineTo(10.499f, 4.745f)
                lineToRelative(-2.962f, 2.838f)
                curveToRelative(-0.598f, 0.573f, -1.548f, 0.553f, -2.121f, -0.045f)
                close()
                moveTo(20.5f, 9.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(5.0f, 10.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(22.0f, 10.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowUpFromSquare!!
    }

private var _arrowUpFromSquare: ImageVector? = null
