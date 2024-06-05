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

public val Icons.Filled.TachometerAltFastest: ImageVector
    get() {
        if (_tachometerAltFastest != null) {
            return _tachometerAltFastest!!
        }
        _tachometerAltFastest = Builder(name = "TachometerAltFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.052f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.611f, 21.571f)
                arcTo(4.994f, 4.994f, 0.0f, false, false, 7.12f, 23.0f)
                horizontalLineToRelative(9.767f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, false, 3.354f, -1.288f)
                arcTo(12.053f, 12.053f, 0.0f, false, false, 20.0f, 4.052f)
                close()
                moveTo(19.419f, 16.189f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.313f, 0.523f)
                lineTo(13.189f, 14.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.787f, -1.839f)
                lineToRelative(4.915f, 2.114f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.414f, 16.189f)
                close()
                moveTo(20.062f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.116f, -0.868f)
                arcToRelative(6.929f, 6.929f, 0.0f, false, false, -2.0f, -4.079f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.9f, 9.9f)
                curveToRelative(0.1f, 0.105f, 0.212f, 0.2f, 0.321f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.324f, 1.5f)
                curveToRelative(-0.141f, -0.124f, -0.277f, -0.253f, -0.411f, -0.387f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 18.364f, 6.636f)
                arcToRelative(8.92f, 8.92f, 0.0f, false, true, 2.567f, 5.245f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.062f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltFastest!!
    }

private var _tachometerAltFastest: ImageVector? = null
