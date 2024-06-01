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

public val Icons.Filled.ChessPiece: ImageVector
    get() {
        if (_chessPiece != null) {
            return _chessPiece!!
        }
        _chessPiece = Builder(name = "ChessPiece", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.026f, 4.9998f)
                    curveTo(9.026f, 3.9228f, 10.293f, 1.8828f, 11.18f, 0.4668f)
                    curveTo(11.2701f, 0.324f, 11.3949f, 0.2064f, 11.5428f, 0.125f)
                    curveTo(11.6906f, 0.0435f, 11.8567f, 7.0E-4f, 12.0255f, 7.0E-4f)
                    curveTo(12.1943f, 7.0E-4f, 12.3604f, 0.0435f, 12.5082f, 0.125f)
                    curveTo(12.6561f, 0.2064f, 12.7809f, 0.324f, 12.871f, 0.4668f)
                    curveTo(13.758f, 1.8828f, 15.026f, 3.9228f, 15.026f, 4.9998f)
                    curveTo(15.026f, 5.7954f, 14.7099f, 6.5585f, 14.1473f, 7.1211f)
                    curveTo(13.5847f, 7.6837f, 12.8217f, 7.9998f, 12.026f, 7.9998f)
                    curveTo(11.2304f, 7.9998f, 10.4673f, 7.6837f, 9.9047f, 7.1211f)
                    curveTo(9.3421f, 6.5585f, 9.026f, 5.7954f, 9.026f, 4.9998f)
                    close()
                    moveTo(19.026f, 22.0258f)
                    verticalLineTo(20.0258f)
                    horizontalLineTo(5.026f)
                    verticalLineTo(22.0258f)
                    horizontalLineTo(3.026f)
                    verticalLineTo(24.0258f)
                    horizontalLineTo(21.026f)
                    verticalLineTo(22.0258f)
                    horizontalLineTo(19.026f)
                    close()
                    moveTo(15.039f, 10.0258f)
                    horizontalLineTo(17.026f)
                    verticalLineTo(8.0258f)
                    horizontalLineTo(7.026f)
                    verticalLineTo(10.0258f)
                    horizontalLineTo(9.013f)
                    curveTo(8.949f, 13.7988f, 8.008f, 16.0388f, 5.65f, 18.0258f)
                    horizontalLineTo(18.4f)
                    curveTo(16.043f, 16.0388f, 15.1f, 13.7998f, 15.038f, 10.0258f)
                    horizontalLineTo(15.039f)
                    close()
                }
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
