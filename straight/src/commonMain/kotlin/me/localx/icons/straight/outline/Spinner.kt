package me.localx.icons.straight.outline

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

public val Icons.Outline.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.4148f, 12.0003f)
                    curveTo(0.4197f, 9.2068f, 1.3992f, 6.5024f, 3.1843f, 4.3536f)
                    curveTo(4.9694f, 2.2048f, 7.4483f, 0.746f, 10.1937f, 0.229f)
                    curveTo(12.939f, -0.2881f, 15.7787f, 0.1689f, 18.2232f, 1.5211f)
                    curveTo(20.6677f, 2.8733f, 22.5639f, 5.036f, 23.5848f, 7.6364f)
                    lineTo(21.7218f, 8.3644f)
                    curveTo(21.0601f, 6.6689f, 19.9482f, 5.1863f, 18.506f, 4.0761f)
                    curveTo(17.0638f, 2.966f, 15.346f, 2.2705f, 13.5377f, 2.0646f)
                    curveTo(11.7294f, 1.8586f, 9.8992f, 2.1501f, 8.2443f, 2.9076f)
                    curveTo(6.5895f, 3.665f, 5.1727f, 4.8597f, 4.1467f, 6.363f)
                    curveTo(3.1207f, 7.8662f, 2.5244f, 9.6209f, 2.4221f, 11.438f)
                    curveTo(2.3197f, 13.2551f, 2.7152f, 15.0657f, 3.5659f, 16.6746f)
                    curveTo(4.4166f, 18.2835f, 5.6902f, 19.6298f, 7.2496f, 20.5683f)
                    curveTo(8.8089f, 21.5068f, 10.5948f, 22.0019f, 12.4148f, 22.0003f)
                    curveTo(14.4281f, 22.0071f, 16.396f, 21.4022f, 18.058f, 20.2658f)
                    curveTo(19.72f, 19.1293f, 20.9976f, 17.515f, 21.7218f, 15.6363f)
                    lineTo(23.5848f, 16.3643f)
                    curveTo(22.5639f, 18.9647f, 20.6677f, 21.1274f, 18.2232f, 22.4796f)
                    curveTo(15.7787f, 23.8318f, 12.939f, 24.2888f, 10.1937f, 23.7717f)
                    curveTo(7.4483f, 23.2546f, 4.9694f, 21.7959f, 3.1843f, 19.6471f)
                    curveTo(1.3992f, 17.4983f, 0.4197f, 14.7939f, 0.4148f, 12.0003f)
                    close()
                }
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
