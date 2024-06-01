package me.localx.icons.rounded.outline

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

public val Icons.Outline.RectanglePanoramic: ImageVector
    get() {
        if (_rectanglePanoramic != null) {
            return _rectanglePanoramic!!
        }
        _rectanglePanoramic = Builder(name = "RectanglePanoramic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 5.0006f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6739f, 5.0006f, 2.4021f, 5.5274f, 1.4645f, 6.4651f)
                    curveTo(0.5268f, 7.4028f, 0.0f, 8.6745f, 0.0f, 10.0006f)
                    lineTo(0.0f, 14.0006f)
                    curveTo(0.0f, 15.3267f, 0.5268f, 16.5985f, 1.4645f, 17.5361f)
                    curveTo(2.4021f, 18.4738f, 3.6739f, 19.0006f, 5.0f, 19.0006f)
                    horizontalLineTo(19.0f)
                    curveTo(19.6566f, 19.0006f, 20.3068f, 18.8713f, 20.9134f, 18.62f)
                    curveTo(21.52f, 18.3687f, 22.0712f, 18.0004f, 22.5355f, 17.5361f)
                    curveTo(22.9998f, 17.0719f, 23.3681f, 16.5207f, 23.6194f, 15.914f)
                    curveTo(23.8707f, 15.3074f, 24.0f, 14.6572f, 24.0f, 14.0006f)
                    verticalLineTo(10.0006f)
                    curveTo(24.0f, 9.344f, 23.8707f, 8.6938f, 23.6194f, 8.0872f)
                    curveTo(23.3681f, 7.4806f, 22.9998f, 6.9294f, 22.5355f, 6.4651f)
                    curveTo(22.0712f, 6.0008f, 21.52f, 5.6325f, 20.9134f, 5.3812f)
                    curveTo(20.3068f, 5.1299f, 19.6566f, 5.0006f, 19.0f, 5.0006f)
                    close()
                    moveTo(22.0f, 14.0006f)
                    curveTo(22.0f, 14.7963f, 21.6839f, 15.5593f, 21.1213f, 16.1219f)
                    curveTo(20.5587f, 16.6845f, 19.7956f, 17.0006f, 19.0f, 17.0006f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 17.0006f, 3.4413f, 16.6845f, 2.8787f, 16.1219f)
                    curveTo(2.3161f, 15.5593f, 2.0f, 14.7963f, 2.0f, 14.0006f)
                    verticalLineTo(10.0006f)
                    curveTo(2.0f, 9.205f, 2.3161f, 8.4419f, 2.8787f, 7.8793f)
                    curveTo(3.4413f, 7.3167f, 4.2043f, 7.0006f, 5.0f, 7.0006f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 7.0006f, 20.5587f, 7.3167f, 21.1213f, 7.8793f)
                    curveTo(21.6839f, 8.4419f, 22.0f, 9.205f, 22.0f, 10.0006f)
                    verticalLineTo(14.0006f)
                    close()
                }
            }
        }
        .build()
        return _rectanglePanoramic!!
    }

private var _rectanglePanoramic: ImageVector? = null
