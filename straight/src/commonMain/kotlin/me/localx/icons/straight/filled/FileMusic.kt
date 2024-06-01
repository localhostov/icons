package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) {
            return _fileMusic!!
        }
        _fileMusic = Builder(name = "FileMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.4142f, 5.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(0.586f)
                    lineTo(21.4142f, 5.0f)
                    close()
                    moveTo(22.0002f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(3.0f)
                    curveTo(2.0001f, 2.2043f, 2.3162f, 1.4413f, 2.8788f, 0.8787f)
                    curveTo(3.4414f, 0.3161f, 4.2045f, 0.0f, 5.0002f, 0.0f)
                    lineTo(15.0002f, 0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(22.0002f)
                    close()
                    moveTo(15.0002f, 10.0f)
                    horizontalLineTo(13.0002f)
                    curveTo(12.4697f, 10.0f, 11.961f, 10.2107f, 11.5859f, 10.5858f)
                    curveTo(11.2109f, 10.9609f, 11.0002f, 11.4696f, 11.0002f, 12.0f)
                    verticalLineTo(15.05f)
                    curveTo(10.8355f, 15.0171f, 10.668f, 15.0003f, 10.5002f, 15.0f)
                    curveTo(10.0057f, 15.0f, 9.5224f, 15.1466f, 9.1112f, 15.4213f)
                    curveTo(8.7001f, 15.696f, 8.3797f, 16.0865f, 8.1904f, 16.5433f)
                    curveTo(8.0012f, 17.0001f, 7.9517f, 17.5028f, 8.0482f, 17.9877f)
                    curveTo(8.1447f, 18.4727f, 8.3827f, 18.9181f, 8.7324f, 19.2678f)
                    curveTo(9.082f, 19.6174f, 9.5275f, 19.8555f, 10.0124f, 19.952f)
                    curveTo(10.4974f, 20.0484f, 11.0f, 19.9989f, 11.4569f, 19.8097f)
                    curveTo(11.9137f, 19.6205f, 12.3041f, 19.3f, 12.5788f, 18.8889f)
                    curveTo(12.8535f, 18.4778f, 13.0002f, 17.9945f, 13.0002f, 17.5f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(10.0f)
                    close()
                }
            }
        }
        .build()
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
