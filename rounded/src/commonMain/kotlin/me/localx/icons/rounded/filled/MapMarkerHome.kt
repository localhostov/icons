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

public val Icons.Filled.MapMarkerHome: ImageVector
    get() {
        if (_mapMarkerHome != null) {
            return _mapMarkerHome!!
        }
        _mapMarkerHome = Builder(name = "MapMarkerHome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7836f, 3.2543f)
                curveTo(15.5149f, -1.0544f, 8.5616f, -1.0868f, 4.2529f, 3.182f)
                curveTo(-0.0557f, 7.4507f, -0.0881f, 14.404f, 4.1806f, 18.7127f)
                curveTo(4.2139f, 18.7463f, 4.2474f, 18.7796f, 4.2811f, 18.8128f)
                lineTo(8.2177f, 22.4478f)
                curveTo(10.3217f, 24.5074f, 13.6834f, 24.5163f, 15.7982f, 22.4678f)
                lineTo(19.7837f, 18.7848f)
                curveTo(24.0722f, 14.4961f, 24.0722f, 7.543f, 19.7836f, 3.2543f)
                close()
                moveTo(18.0086f, 13.5155f)
                curveTo(18.0086f, 14.8939f, 16.8911f, 16.0114f, 15.5127f, 16.0114f)
                horizontalLineTo(8.5241f)
                curveTo(7.1457f, 16.0114f, 6.0282f, 14.8939f, 6.0282f, 13.5155f)
                verticalLineTo(10.149f)
                curveTo(6.0282f, 9.1672f, 6.5094f, 8.2477f, 7.3161f, 7.688f)
                lineTo(10.3112f, 5.6104f)
                curveTo(11.3386f, 4.9005f, 12.6981f, 4.9005f, 13.7256f, 5.6104f)
                lineTo(16.7207f, 7.688f)
                curveTo(17.5274f, 8.2477f, 18.0086f, 9.1672f, 18.0086f, 10.149f)
                verticalLineTo(13.5155f)
                close()
                moveTo(16.0118f, 10.149f)
                verticalLineTo(13.5154f)
                curveTo(16.0118f, 13.7911f, 15.7883f, 14.0146f, 15.5127f, 14.0146f)
                horizontalLineTo(14.0151f)
                verticalLineTo(12.0179f)
                curveTo(14.0151f, 11.4665f, 13.5681f, 11.0195f, 13.0168f, 11.0195f)
                horizontalLineTo(11.02f)
                curveTo(10.4686f, 11.0195f, 10.0217f, 11.4665f, 10.0217f, 12.0179f)
                verticalLineTo(14.0146f)
                horizontalLineTo(8.5241f)
                curveTo(8.2485f, 14.0146f, 8.025f, 13.7911f, 8.025f, 13.5154f)
                verticalLineTo(10.149f)
                curveTo(8.0248f, 9.8216f, 8.1853f, 9.5149f, 8.4542f, 9.3283f)
                lineTo(11.4493f, 7.2507f)
                curveTo(11.7921f, 7.015f, 12.2447f, 7.015f, 12.5874f, 7.2507f)
                lineTo(15.5825f, 9.3283f)
                curveTo(15.8515f, 9.5149f, 16.0119f, 9.8216f, 16.0118f, 10.149f)
                close()
            }
        }
        .build()
        return _mapMarkerHome!!
    }

private var _mapMarkerHome: ImageVector? = null
