package me.localx.icons.rounded.outline

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

public val Icons.Outline.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.702f, 20.212f)
                lineToRelative(-3.17f, 3.129f)
                curveToRelative(-0.358f, 0.402f, -0.932f, 0.659f, -1.532f, 0.659f)
                reflectiveCurveToRelative(-1.174f, -0.257f, -1.575f, -0.704f)
                lineToRelative(-3.127f, -3.084f)
                curveToRelative(-0.394f, -0.389f, -0.397f, -1.021f, -0.01f, -1.414f)
                curveToRelative(0.39f, -0.394f, 1.022f, -0.397f, 1.414f, -0.01f)
                lineToRelative(2.298f, 2.238f)
                verticalLineToRelative(-12.526f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineTo(2.944f)
                lineToRelative(-2.298f, 2.268f)
                curveToRelative(-0.392f, 0.388f, -1.024f, 0.384f, -1.414f, -0.01f)
                curveToRelative(-0.388f, -0.393f, -0.384f, -1.025f, 0.01f, -1.414f)
                lineTo(3.468f, 0.659f)
                curveToRelative(0.358f, -0.402f, 0.932f, -0.659f, 1.532f, -0.659f)
                reflectiveCurveToRelative(1.174f, 0.257f, 1.575f, 0.704f)
                lineToRelative(3.127f, 3.084f)
                curveToRelative(0.394f, 0.389f, 0.397f, 1.021f, 0.01f, 1.414f)
                curveToRelative(-0.196f, 0.198f, -0.454f, 0.298f, -0.712f, 0.298f)
                curveToRelative(-0.254f, 0.0f, -0.508f, -0.096f, -0.702f, -0.288f)
                lineToRelative(-2.298f, -2.238f)
                verticalLineToRelative(12.526f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(12.556f)
                lineToRelative(2.298f, -2.268f)
                curveToRelative(0.393f, -0.388f, 1.025f, -0.384f, 1.414f, 0.01f)
                curveToRelative(0.388f, 0.393f, 0.384f, 1.025f, -0.01f, 1.414f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null
