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

public val Icons.Outline.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0001f, 7.964f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(20.0001f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(12.0001f)
                    curveTo(11.2044f, 0.0f, 10.4414f, 0.3161f, 9.8787f, 0.8787f)
                    curveTo(9.3161f, 1.4413f, 9.0001f, 2.2043f, 9.0001f, 3.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(7.964f)
                    curveTo(5.4984f, 8.7017f, 4.2337f, 9.8458f, 3.3499f, 11.2663f)
                    curveTo(2.466f, 12.6869f, 1.9984f, 14.3269f, 2.0001f, 16.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(16.0f)
                    curveTo(22.0018f, 14.3269f, 21.5341f, 12.6869f, 20.6503f, 11.2663f)
                    curveTo(19.7664f, 9.8458f, 18.5017f, 8.7017f, 17.0001f, 7.964f)
                    close()
                    moveTo(11.0001f, 3.0f)
                    curveTo(11.0001f, 2.7348f, 11.1054f, 2.4804f, 11.293f, 2.2929f)
                    curveTo(11.4805f, 2.1054f, 11.7348f, 2.0f, 12.0001f, 2.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(3.0f)
                    close()
                    moveTo(9.0001f, 6.0f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(6.0f)
                    close()
                    moveTo(20.0001f, 22.0f)
                    horizontalLineTo(4.0001f)
                    verticalLineTo(16.0f)
                    curveTo(3.9971f, 14.7915f, 4.3084f, 13.6029f, 4.9034f, 12.551f)
                    curveTo(5.4984f, 11.4991f, 6.3567f, 10.62f, 7.3941f, 10.0f)
                    horizontalLineTo(16.6061f)
                    curveTo(17.6434f, 10.62f, 18.5017f, 11.4991f, 19.0967f, 12.551f)
                    curveTo(19.6918f, 13.6029f, 20.0031f, 14.7915f, 20.0001f, 16.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(6.0001f, 20.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(20.0f)
                    close()
                    moveTo(8.0001f, 16.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(16.0f)
                    close()
                }
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
