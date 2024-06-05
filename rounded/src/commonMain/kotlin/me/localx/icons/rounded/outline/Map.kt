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

public val Icons.Outline.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.68f, 1.167f)
                lineToRelative(-0.021f, -0.007f)
                lineToRelative(-2.715f, -0.9f)
                arcToRelative(5.017f, 5.017f, 0.0f, false, false, -2.9f, -0.079f)
                lineTo(9.468f, 1.8f)
                arcTo(3.025f, 3.025f, 0.0f, false, true, 7.42f, 1.62f)
                lineToRelative(-0.5f, -0.232f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 6.0f)
                lineTo(0.0f, 18.075f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, 3.6f, 4.8f)
                lineToRelative(2.869f, 0.9f)
                arcTo(4.991f, 4.991f, 0.0f, false, false, 7.964f, 24.0f)
                arcTo(4.592f, 4.592f, 0.0f, false, false, 9.3f, 23.819f)
                lineToRelative(5.8f, -1.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.617f, 0.013f)
                lineToRelative(2.343f, 0.676f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 19.021f)
                lineTo(24.0f, 5.876f)
                arcTo(5.01f, 5.01f, 0.0f, false, false, 20.68f, 1.167f)
                close()
                moveTo(4.176f, 20.959f)
                arcTo(3.013f, 3.013f, 0.0f, false, true, 2.0f, 18.075f)
                lineTo(2.0f, 6.0f)
                arcToRelative(2.953f, 2.953f, 0.0f, false, true, 1.336f, -2.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 1.112f, 0.222f)
                reflectiveCurveToRelative(0.745f, 0.319f, 0.887f, 0.37f)
                lineTo(6.999f, 21.842f)
                close()
                moveTo(9.0f, 21.827f)
                lineTo(9.0f, 3.879f)
                arcToRelative(5.105f, 5.105f, 0.0f, false, false, 1.006f, -0.155f)
                lineTo(15.0f, 2.273f)
                lineTo(15.0f, 20.2f)
                close()
                moveTo(22.0f, 19.021f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.433f, 1.954f)
                lineTo(17.0f, 20.252f)
                lineTo(17.0f, 2.075f)
                lineToRelative(3.018f, 0.979f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 22.0f, 5.876f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
