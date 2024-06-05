package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowsSplitRightAndLeft: ImageVector
    get() {
        if (_arrowsSplitRightAndLeft != null) {
            return _arrowsSplitRightAndLeft!!
        }
        _arrowsSplitRightAndLeft = Builder(name = "ArrowsSplitRightAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, 0.759f, -0.295f, 1.473f, -0.832f, 2.009f)
                lineToRelative(-3.665f, 3.695f)
                curveToRelative(-0.195f, 0.197f, -0.453f, 0.296f, -0.71f, 0.296f)
                curveToRelative(-0.254f, 0.0f, -0.509f, -0.097f, -0.704f, -0.29f)
                curveToRelative(-0.392f, -0.389f, -0.395f, -1.021f, -0.006f, -1.414f)
                lineToRelative(3.268f, -3.296f)
                horizontalLineToRelative(-3.352f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(2.648f)
                lineToRelative(3.268f, 3.296f)
                curveToRelative(0.389f, 0.393f, 0.386f, 1.025f, -0.006f, 1.414f)
                curveToRelative(-0.195f, 0.193f, -0.45f, 0.29f, -0.704f, 0.29f)
                curveToRelative(-0.257f, 0.0f, -0.515f, -0.099f, -0.71f, -0.296f)
                lineTo(0.829f, 8.006f)
                curveToRelative(-0.534f, -0.533f, -0.829f, -1.247f, -0.829f, -2.006f)
                reflectiveCurveToRelative(0.295f, -1.473f, 0.832f, -2.009f)
                lineTo(4.497f, 0.296f)
                curveToRelative(0.388f, -0.394f, 1.021f, -0.396f, 1.414f, -0.006f)
                curveToRelative(0.392f, 0.389f, 0.395f, 1.021f, 0.006f, 1.414f)
                lineToRelative(-3.268f, 3.296f)
                horizontalLineToRelative(3.352f)
                curveToRelative(2.548f, 0.0f, 4.775f, 1.373f, 6.0f, 3.413f)
                curveToRelative(1.225f, -2.04f, 3.452f, -3.413f, 6.0f, -3.413f)
                horizontalLineToRelative(3.352f)
                lineToRelative(-3.268f, -3.296f)
                curveToRelative(-0.389f, -0.393f, -0.386f, -1.025f, 0.006f, -1.414f)
                curveToRelative(0.393f, -0.389f, 1.026f, -0.387f, 1.414f, 0.006f)
                lineToRelative(3.667f, 3.698f)
                curveToRelative(0.534f, 0.533f, 0.829f, 1.247f, 0.829f, 2.006f)
                close()
            }
        }
        .build()
        return _arrowsSplitRightAndLeft!!
    }

private var _arrowsSplitRightAndLeft: ImageVector? = null
