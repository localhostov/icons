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

public val Icons.Bold.Picnic: ImageVector
    get() {
        if (_picnic != null) {
            return _picnic!!
        }
        _picnic = Builder(name = "Picnic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2f, 9.181f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.146f, -1.133f)
                arcToRelative(9.118f, 9.118f, 0.0f, false, false, -18.111f, 0.0f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 0.828f, 9.181f)
                arcToRelative(3.328f, 3.328f, 0.0f, false, false, -0.777f, 2.657f)
                lineToRelative(1.011f, 6.893f)
                arcTo(6.259f, 6.259f, 0.0f, false, false, 7.264f, 24.0f)
                horizontalLineToRelative(9.5f)
                arcToRelative(6.259f, 6.259f, 0.0f, false, false, 6.2f, -5.269f)
                lineToRelative(1.012f, -6.893f)
                arcTo(3.326f, 3.326f, 0.0f, false, false, 23.2f, 9.181f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(6.136f, 6.136f, 0.0f, false, true, 6.017f, 5.0f)
                lineTo(5.984f, 8.0f)
                arcTo(6.137f, 6.137f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(20.0f, 18.3f)
                arcTo(3.243f, 3.243f, 0.0f, false, true, 16.767f, 21.0f)
                horizontalLineToRelative(-9.5f)
                arcTo(3.242f, 3.242f, 0.0f, false, true, 4.03f, 18.3f)
                lineTo(3.019f, 11.4f)
                arcToRelative(0.324f, 0.324f, 0.0f, false, true, 0.079f, -0.26f)
                arcTo(0.419f, 0.419f, 0.0f, false, true, 3.422f, 11.0f)
                lineTo(8.374f, 11.0f)
                lineTo(12.7f, 15.33f)
                arcToRelative(2.287f, 2.287f, 0.0f, false, false, 3.234f, 0.0f)
                lineTo(20.256f, 11.0f)
                horizontalLineToRelative(0.353f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, 0.324f, 0.143f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, true, 0.079f, 0.259f)
                close()
            }
        }
        .build()
        return _picnic!!
    }

private var _picnic: ImageVector? = null
