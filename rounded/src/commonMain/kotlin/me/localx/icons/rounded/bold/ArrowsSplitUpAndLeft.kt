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

public val Icons.Bold.ArrowsSplitUpAndLeft: ImageVector
    get() {
        if (_arrowsSplitUpAndLeft != null) {
            return _arrowsSplitUpAndLeft!!
        }
        _arrowsSplitUpAndLeft = Builder(name = "ArrowsSplitUpAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineTo(4.351f)
                lineToRelative(2.184f, 2.081f)
                curveToRelative(0.6f, 0.571f, 0.623f, 1.521f, 0.051f, 2.121f)
                curveToRelative(-0.294f, 0.31f, -0.69f, 0.465f, -1.086f, 0.465f)
                curveToRelative(-0.372f, 0.0f, -0.744f, -0.137f, -1.035f, -0.414f)
                lineToRelative(-3.414f, -3.252f)
                curveToRelative(-0.687f, -0.686f, -1.051f, -1.564f, -1.051f, -2.5f)
                reflectiveCurveToRelative(0.364f, -1.814f, 1.026f, -2.476f)
                lineToRelative(3.439f, -3.277f)
                curveToRelative(0.6f, -0.571f, 1.549f, -0.55f, 2.121f, 0.051f)
                curveToRelative(0.571f, 0.6f, 0.548f, 1.549f, -0.051f, 2.121f)
                lineToRelative(-2.184f, 2.081f)
                horizontalLineToRelative(7.649f)
                verticalLineTo(4.351f)
                lineToRelative(-2.081f, 2.184f)
                curveToRelative(-0.572f, 0.6f, -1.522f, 0.622f, -2.121f, 0.051f)
                curveToRelative(-0.6f, -0.571f, -0.623f, -1.521f, -0.051f, -2.121f)
                lineToRelative(3.252f, -3.414f)
                curveToRelative(1.371f, -1.374f, 3.653f, -1.349f, 4.976f, -0.025f)
                lineToRelative(3.277f, 3.439f)
                curveToRelative(0.572f, 0.6f, 0.548f, 1.549f, -0.051f, 2.121f)
                curveToRelative(-0.291f, 0.277f, -0.663f, 0.414f, -1.035f, 0.414f)
                curveToRelative(-0.396f, 0.0f, -0.791f, -0.156f, -1.086f, -0.465f)
                lineToRelative(-2.081f, -2.184f)
                verticalLineToRelative(14.149f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _arrowsSplitUpAndLeft!!
    }

private var _arrowsSplitUpAndLeft: ImageVector? = null
