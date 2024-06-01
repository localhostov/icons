package me.localx.icons.straight.bold

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

public val Icons.Bold.FileCheck: ImageVector
    get() {
        if (_fileCheck != null) {
            return _fileCheck!!
        }
        _fileCheck = Builder(name = "FileCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9389f, 11.268f)
                    lineTo(17.0609f, 13.389f)
                    lineTo(13.4749f, 16.975f)
                    curveTo(13.1499f, 17.3f, 12.764f, 17.5579f, 12.3394f, 17.7338f)
                    curveTo(11.9147f, 17.9097f, 11.4596f, 18.0003f, 10.9999f, 18.0003f)
                    curveTo(10.5403f, 18.0003f, 10.0851f, 17.9097f, 9.6604f, 17.7338f)
                    curveTo(9.2358f, 17.5579f, 8.8499f, 17.3f, 8.5249f, 16.975f)
                    lineTo(6.9389f, 15.39f)
                    lineTo(9.0609f, 13.268f)
                    lineTo(10.6459f, 14.853f)
                    curveTo(10.7397f, 14.9467f, 10.8668f, 14.9994f, 10.9994f, 14.9994f)
                    curveTo(11.132f, 14.9994f, 11.2591f, 14.9467f, 11.3529f, 14.853f)
                    lineTo(14.9389f, 11.268f)
                    close()
                    moveTo(21.9999f, 5.879f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(1.9999f)
                    verticalLineTo(3.0f)
                    curveTo(1.9999f, 2.2043f, 2.316f, 1.4413f, 2.8786f, 0.8787f)
                    curveTo(3.4412f, 0.3161f, 4.2043f, 0.0f, 4.9999f, 0.0f)
                    lineTo(16.1209f, 0.0f)
                    lineTo(21.9999f, 5.879f)
                    close()
                    moveTo(18.9999f, 21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.9999f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(4.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(18.9999f)
                    close()
                }
            }
        }
        .build()
        return _fileCheck!!
    }

private var _fileCheck: ImageVector? = null
