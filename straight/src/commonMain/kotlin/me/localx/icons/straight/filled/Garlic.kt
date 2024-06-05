package me.localx.icons.straight.filled

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

public val Icons.Filled.Garlic: ImageVector
    get() {
        if (_garlic != null) {
            return _garlic!!
        }
        _garlic = Builder(name = "Garlic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                arcTo(22.153f, 22.153f, 0.0f, false, true, 11.154f, 9.466f)
                lineTo(12.0f, 8.127f)
                lineToRelative(0.846f, 1.339f)
                arcTo(22.153f, 22.153f, 0.0f, false, true, 16.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(10.361f, 7.524f)
                curveToRelative(0.479f, -0.688f, 0.819f, -1.1f, 0.871f, -1.165f)
                lineTo(12.0f, 5.438f)
                lineToRelative(0.768f, 0.921f)
                curveToRelative(0.052f, 0.063f, 0.394f, 0.48f, 0.877f, 1.173f)
                arcTo(31.261f, 31.261f, 0.0f, false, true, 16.0f, 3.953f)
                lineTo(16.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 3.883f)
                arcTo(32.391f, 32.391f, 0.0f, false, true, 10.361f, 7.524f)
                close()
                moveTo(16.893f, 6.124f)
                arcToRelative(21.619f, 21.619f, 0.0f, false, false, -2.0f, 3.374f)
                arcTo(21.65f, 21.65f, 0.0f, false, true, 18.0f, 20.0f)
                arcToRelative(5.865f, 5.865f, 0.0f, false, true, -0.579f, 2.479f)
                arcTo(4.46f, 4.46f, 0.0f, false, false, 19.5f, 23.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 18.5f)
                curveTo(24.0f, 12.438f, 19.294f, 8.0f, 16.893f, 6.127f)
                close()
                moveTo(6.0f, 20.0f)
                arcTo(21.644f, 21.644f, 0.0f, false, true, 9.112f, 9.5f)
                arcTo(22.356f, 22.356f, 0.0f, false, false, 7.13f, 6.108f)
                curveTo(4.736f, 7.969f, 0.0f, 12.42f, 0.0f, 18.5f)
                arcToRelative(4.484f, 4.484f, 0.0f, false, false, 6.6f, 3.971f)
                arcTo(5.741f, 5.741f, 0.0f, false, true, 6.0f, 20.0f)
                close()
            }
        }
        .build()
        return _garlic!!
    }

private var _garlic: ImageVector? = null
