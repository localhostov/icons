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

public val Icons.Outline.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.946f, 7.803f)
                lineToRelative(-1.946f, -2.502f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(7.5f, 0.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.8f)
                lineToRelative(-1.946f, 2.502f)
                curveToRelative(-0.68f, 0.874f, -1.054f, 1.964f, -1.054f, 3.07f)
                verticalLineToRelative(8.127f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.127f)
                curveToRelative(0.0f, -1.106f, -0.374f, -2.196f, -1.054f, -3.07f)
                close()
                moveTo(14.263f, 7.699f)
                curveToRelative(-0.347f, 0.389f, -0.611f, 0.833f, -0.819f, 1.301f)
                lineTo(3.655f, 9.0f)
                lineToRelative(2.334f, -3.0f)
                horizontalLineToRelative(9.784f)
                lineToRelative(-1.51f, 1.699f)
                close()
                moveTo(7.5f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(10.002f)
                curveToRelative(0.0f, 0.007f, -0.002f, 0.014f, -0.002f, 0.021f)
                verticalLineToRelative(7.979f)
                curveToRelative(0.0f, 1.13f, 0.391f, 2.162f, 1.026f, 3.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-7.979f)
                curveToRelative(0.0f, -0.736f, 0.27f, -1.443f, 0.758f, -1.993f)
                lineToRelative(2.457f, -2.765f)
                lineToRelative(2.153f, 2.767f)
                curveToRelative(0.407f, 0.524f, 0.632f, 1.179f, 0.632f, 1.842f)
                verticalLineToRelative(8.127f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
