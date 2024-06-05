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

public val Icons.Filled.RingsWedding: ImageVector
    get() {
        if (_ringsWedding != null) {
            return _ringsWedding!!
        }
        _ringsWedding = Builder(name = "RingsWedding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcToRelative(7.974f, 7.974f, 0.0f, false, false, -5.974f, 2.7f)
                arcToRelative(6.882f, 6.882f, 0.0f, false, false, -1.495f, -0.524f)
                lineTo(9.9f, 7.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.043f, -0.971f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 7.0f, 5.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 4.148f, 6.476f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.043f, 0.971f)
                lineToRelative(1.364f, 2.727f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 5.866f, 12.312f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 16.0f, 8.0f)
                close()
                moveTo(11.234f, 19.63f)
                arcToRelative(5.946f, 5.946f, 0.0f, false, true, -0.678f, -6.137f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, true, 0.678f, 6.137f)
                close()
                moveTo(2.0f, 17.0f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, true, 6.879f, -4.627f)
                arcToRelative(7.957f, 7.957f, 0.0f, false, false, 0.966f, 8.73f)
                arcTo(4.99f, 4.99f, 0.0f, false, true, 2.0f, 17.0f)
                close()
                moveTo(16.0f, 22.0f)
                arcToRelative(5.961f, 5.961f, 0.0f, false, true, -3.278f, -0.981f)
                arcTo(6.963f, 6.963f, 0.0f, false, false, 11.7f, 11.826f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 16.0f, 22.0f)
                close()
                moveTo(10.105f, 3.553f)
                lineToRelative(1.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.79f, 0.894f)
                lineToRelative(-1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.79f, -0.894f)
                close()
                moveTo(1.105f, 2.447f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.9f, 1.553f)
                lineToRelative(1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.79f, 0.894f)
                close()
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 1.0f)
                lineTo(8.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 3.0f)
                close()
            }
        }
        .build()
        return _ringsWedding!!
    }

private var _ringsWedding: ImageVector? = null
