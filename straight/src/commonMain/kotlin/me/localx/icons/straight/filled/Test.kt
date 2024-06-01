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

public val Icons.Filled.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.191f, 13.0f)
                    curveTo(11.2538f, 12.7382f, 11.3381f, 12.482f, 11.443f, 12.234f)
                    lineTo(12.018f, 11.041f)
                    lineTo(12.557f, 12.233f)
                    curveTo(12.6617f, 12.4814f, 12.746f, 12.7379f, 12.809f, 13.0f)
                    horizontalLineTo(11.191f)
                    close()
                    moveTo(21.0f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(14.0f, 0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(21.0f)
                    close()
                    moveTo(11.96f, 19.456f)
                    lineTo(10.54f, 18.048f)
                    lineTo(8.677f, 19.929f)
                    curveTo(8.6314f, 19.9751f, 8.5697f, 20.0016f, 8.5049f, 20.0029f)
                    curveTo(8.4401f, 20.0042f, 8.3774f, 19.9802f, 8.33f, 19.936f)
                    lineTo(7.464f, 19.052f)
                    lineTo(6.036f, 20.452f)
                    lineTo(6.909f, 21.343f)
                    curveTo(7.3317f, 21.7647f, 7.9044f, 22.0015f, 8.5015f, 22.0015f)
                    curveTo(9.0986f, 22.0015f, 9.6713f, 21.7647f, 10.094f, 21.343f)
                    lineTo(11.96f, 19.456f)
                    close()
                    moveTo(13.0f, 15.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(14.3f)
                    curveTo(15.0012f, 13.3057f, 14.7894f, 12.3226f, 14.379f, 11.417f)
                    lineTo(13.857f, 10.264f)
                    curveTo(13.7103f, 9.8955f, 13.4574f, 9.5789f, 13.1304f, 9.3545f)
                    curveTo(12.8034f, 9.1301f, 12.417f, 9.008f, 12.0204f, 9.0037f)
                    curveTo(11.6238f, 8.9995f, 11.2349f, 9.1132f, 10.9031f, 9.3305f)
                    curveTo(10.5713f, 9.5477f, 10.3116f, 9.8588f, 10.157f, 10.224f)
                    lineTo(9.618f, 11.418f)
                    curveTo(9.2085f, 12.3235f, 8.9978f, 13.3062f, 9.0f, 14.3f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(13.0f)
                    close()
                    moveTo(18.0f, 19.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(20.785f, 5.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(0.219f)
                    curveTo(16.5959f, 0.4083f, 17.1391f, 0.7347f, 17.586f, 1.172f)
                    lineTo(19.828f, 3.414f)
                    curveTo(20.2676f, 3.8598f, 20.5956f, 4.4033f, 20.785f, 5.0f)
                    close()
                }
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
