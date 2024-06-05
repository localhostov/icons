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

public val Icons.Bold.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.024f, 1.976f)
                curveToRelative(-3.524f, -3.529f, -12.647f, -2.153f, -17.424f, 2.624f)
                reflectiveCurveToRelative(-6.151f, 13.9f, -2.624f, 17.424f)
                arcToRelative(8.323f, 8.323f, 0.0f, false, false, 5.937f, 1.976f)
                arcToRelative(17.032f, 17.032f, 0.0f, false, false, 11.487f, -4.6f)
                curveToRelative(4.777f, -4.779f, 6.151f, -13.9f, 2.624f, -17.424f)
                close()
                moveTo(17.278f, 17.276f)
                arcToRelative(14.038f, 14.038f, 0.0f, false, true, -7.845f, 3.609f)
                lineToRelative(-6.319f, -6.317f)
                arcToRelative(14.036f, 14.036f, 0.0f, false, true, 3.608f, -7.846f)
                arcToRelative(14.036f, 14.036f, 0.0f, false, true, 7.846f, -3.608f)
                lineToRelative(6.318f, 6.318f)
                arcToRelative(14.036f, 14.036f, 0.0f, false, true, -3.608f, 7.846f)
                close()
                moveTo(17.561f, 11.559f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 0.0f)
                lineToRelative(-0.439f, -0.438f)
                lineToRelative(-0.879f, 0.879f)
                lineToRelative(0.44f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                lineToRelative(-0.439f, -0.44f)
                lineToRelative(-0.879f, 0.879f)
                lineToRelative(0.44f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.122f, 2.122f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineToRelative(0.439f, 0.44f)
                lineToRelative(0.879f, -0.879f)
                lineToRelative(-0.44f, -0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineToRelative(0.439f, 0.44f)
                lineToRelative(0.879f, -0.879f)
                lineToRelative(-0.44f, -0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.122f, -2.122f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                close()
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
