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

public val Icons.Bold.ChessPiece: ImageVector
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
                    moveTo(19.0f, 21.0002f)
                    verticalLineTo(18.2792f)
                    lineTo(18.438f, 17.8292f)
                    curveTo(16.066f, 15.9322f, 16.0f, 13.9732f, 16.0f, 10.5222f)
                    horizontalLineTo(18.0f)
                    lineTo(18.006f, 7.5222f)
                    horizontalLineTo(15.551f)
                    curveTo(15.8598f, 6.9527f, 16.0237f, 6.316f, 16.028f, 5.6682f)
                    curveTo(16.028f, 4.4242f, 15.111f, 2.8602f, 14.005f, 1.0952f)
                    curveTo(13.7952f, 0.7605f, 13.5038f, 0.4845f, 13.1582f, 0.2932f)
                    curveTo(12.8126f, 0.1019f, 12.424f, 0.0016f, 12.029f, 0.0016f)
                    curveTo(11.634f, 0.0016f, 11.2454f, 0.1019f, 10.8998f, 0.2932f)
                    curveTo(10.5542f, 0.4845f, 10.2628f, 0.7605f, 10.053f, 1.0952f)
                    curveTo(8.942f, 2.8612f, 8.026f, 4.4252f, 8.026f, 5.6672f)
                    curveTo(8.0303f, 6.3089f, 8.1913f, 6.9399f, 8.495f, 7.5052f)
                    lineTo(6.0f, 7.5002f)
                    verticalLineTo(10.5002f)
                    horizontalLineTo(8.0f)
                    curveTo(8.0f, 13.9632f, 7.931f, 15.9292f, 5.562f, 17.8252f)
                    lineTo(5.0f, 18.2792f)
                    verticalLineTo(21.0002f)
                    horizontalLineTo(3.026f)
                    verticalLineTo(24.0002f)
                    horizontalLineTo(21.026f)
                    verticalLineTo(21.0002f)
                    horizontalLineTo(19.0f)
                    close()
                    moveTo(13.0f, 10.5152f)
                    curveTo(13.0f, 13.2742f, 13.055f, 15.7592f, 14.541f, 18.0002f)
                    horizontalLineTo(9.459f)
                    curveTo(10.943f, 15.7612f, 11.0f, 13.2732f, 11.0f, 10.5112f)
                    lineTo(13.0f, 10.5152f)
                    close()
                }
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
