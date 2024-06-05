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

public val Icons.Bold.Piano: ImageVector
    get() {
        if (_piano != null) {
            return _piano!!
        }
        _piano = Builder(name = "Piano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.046f, 9.046f)
                curveToRelative(-0.777f, 0.0f, -1.463f, -0.551f, -1.632f, -1.311f)
                lineToRelative(-0.219f, -0.994f)
                curveToRelative(-0.878f, -3.969f, -4.33f, -6.742f, -8.395f, -6.742f)
                curveTo(3.948f, 0.0f, 0.0f, 3.948f, 0.0f, 8.8f)
                verticalLineToRelative(10.2f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.731f, -2.222f, -4.954f, -4.954f, -4.954f)
                close()
                moveTo(8.8f, 3.0f)
                curveToRelative(2.646f, 0.0f, 4.894f, 1.805f, 5.465f, 4.389f)
                lineToRelative(0.22f, 0.995f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.477f, 2.157f, 2.353f, 3.663f, 4.561f, 3.663f)
                curveToRelative(1.077f, 0.0f, 1.954f, 0.876f, 1.954f, 1.954f)
                lineTo(3.0f, 14.001f)
                verticalLineToRelative(-5.2f)
                curveToRelative(0.0f, -3.198f, 2.602f, -5.8f, 5.8f, -5.8f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _piano!!
    }

private var _piano: ImageVector? = null
