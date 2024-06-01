package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.954f, 10.663f)
                    curveTo(18.6096f, 9.6039f, 18.9702f, 8.3886f, 18.9982f, 7.1433f)
                    curveTo(19.0263f, 5.898f, 18.7208f, 4.6677f, 18.1135f, 3.5801f)
                    curveTo(17.5062f, 2.4925f, 16.6192f, 1.5871f, 15.5443f, 0.9576f)
                    curveTo(14.4693f, 0.3281f, 13.2457f, -0.0025f, 12.0f, 0.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.4696f, 0.0f, 3.9609f, 0.2107f, 3.5858f, 0.5858f)
                    curveTo(3.2107f, 0.9609f, 3.0f, 1.4696f, 3.0f, 2.0f)
                    verticalLineTo(22.0f)
                    curveTo(3.0f, 22.5304f, 3.2107f, 23.0392f, 3.5858f, 23.4142f)
                    curveTo(3.9609f, 23.7893f, 4.4696f, 24.0f, 5.0f, 24.0f)
                    horizontalLineTo(15.0f)
                    curveTo(16.5934f, 24.0017f, 18.1397f, 23.4592f, 19.3828f, 22.4624f)
                    curveTo(20.6259f, 21.4656f, 21.4914f, 20.0742f, 21.8359f, 18.5185f)
                    curveTo(22.1805f, 16.9627f, 21.9835f, 15.336f, 21.2776f, 13.9075f)
                    curveTo(20.5717f, 12.479f, 19.3991f, 11.3343f, 17.954f, 10.663f)
                    close()
                    moveTo(7.0f, 4.0f)
                    horizontalLineTo(12.0f)
                    curveTo(12.7956f, 4.0f, 13.5587f, 4.3161f, 14.1213f, 4.8787f)
                    curveTo(14.6839f, 5.4413f, 15.0f, 6.2044f, 15.0f, 7.0f)
                    curveTo(15.0f, 7.7957f, 14.6839f, 8.5587f, 14.1213f, 9.1213f)
                    curveTo(13.5587f, 9.6839f, 12.7956f, 10.0f, 12.0f, 10.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(4.0f)
                    close()
                    moveTo(15.0f, 20.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(15.0f)
                    curveTo(15.7956f, 14.0f, 16.5587f, 14.3161f, 17.1213f, 14.8787f)
                    curveTo(17.6839f, 15.4413f, 18.0f, 16.2044f, 18.0f, 17.0f)
                    curveTo(18.0f, 17.7957f, 17.6839f, 18.5587f, 17.1213f, 19.1213f)
                    curveTo(16.5587f, 19.6839f, 15.7956f, 20.0f, 15.0f, 20.0f)
                    close()
                }
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
