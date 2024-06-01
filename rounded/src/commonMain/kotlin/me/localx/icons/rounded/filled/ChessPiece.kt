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

public val Icons.Filled.ChessPiece: ImageVector
    get() {
        if (_chessPiece != null) {
            return _chessPiece!!
        }
        _chessPiece = Builder(name = "ChessPiece", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.026f)
                curveTo(15.0f, 5.8216f, 14.6839f, 6.5847f, 14.1213f, 7.1473f)
                curveTo(13.5587f, 7.7099f, 12.7956f, 8.026f, 12.0f, 8.026f)
                curveTo(11.2044f, 8.026f, 10.4413f, 7.7099f, 9.8787f, 7.1473f)
                curveTo(9.3161f, 6.5847f, 9.0f, 5.8216f, 9.0f, 5.026f)
                curveTo(9.2686f, 3.4748f, 9.8611f, 1.9977f, 10.739f, 0.691f)
                curveTo(10.8749f, 0.48f, 11.0615f, 0.3065f, 11.2818f, 0.1864f)
                curveTo(11.5021f, 0.0662f, 11.7491f, 0.0033f, 12.0f, 0.0033f)
                curveTo(12.2509f, 0.0033f, 12.4979f, 0.0662f, 12.7182f, 0.1864f)
                curveTo(12.9385f, 0.3065f, 13.1251f, 0.48f, 13.261f, 0.691f)
                curveTo(14.1389f, 1.9977f, 14.7314f, 3.4748f, 15.0f, 5.026f)
                close()
                moveTo(5.8f, 18.0f)
                horizontalLineTo(18.2f)
                curveTo(18.0739f, 17.8218f, 17.9331f, 17.6546f, 17.779f, 17.5f)
                curveTo(15.856f, 15.641f, 15.071f, 13.485f, 15.013f, 10.0f)
                horizontalLineTo(16.0f)
                curveTo(16.2652f, 10.0f, 16.5196f, 9.8946f, 16.7071f, 9.7071f)
                curveTo(16.8946f, 9.5195f, 17.0f, 9.2652f, 17.0f, 9.0f)
                curveTo(17.0f, 8.7347f, 16.8946f, 8.4804f, 16.7071f, 8.2929f)
                curveTo(16.5196f, 8.1053f, 16.2652f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(7.7348f, 8.0f, 7.4804f, 8.1053f, 7.2929f, 8.2929f)
                curveTo(7.1054f, 8.4804f, 7.0f, 8.7347f, 7.0f, 9.0f)
                curveTo(7.0f, 9.2652f, 7.1054f, 9.5195f, 7.2929f, 9.7071f)
                curveTo(7.4804f, 9.8946f, 7.7348f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(8.989f)
                curveTo(8.931f, 13.487f, 8.146f, 15.643f, 6.223f, 17.5f)
                curveTo(6.0688f, 17.655f, 5.9274f, 17.8222f, 5.8f, 18.0f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.371f)
                curveTo(19.0f, 20.246f, 18.974f, 20.124f, 18.962f, 20.0f)
                horizontalLineTo(5.038f)
                curveTo(5.026f, 20.124f, 5.0f, 20.246f, 5.0f, 20.371f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 22.0f, 3.4804f, 22.1053f, 3.2929f, 22.2929f)
                curveTo(3.1054f, 22.4804f, 3.0f, 22.7347f, 3.0f, 23.0f)
                curveTo(3.0f, 23.2652f, 3.1054f, 23.5195f, 3.2929f, 23.7071f)
                curveTo(3.4804f, 23.8946f, 3.7348f, 24.0f, 4.0f, 24.0f)
                horizontalLineTo(20.0f)
                curveTo(20.2652f, 24.0f, 20.5196f, 23.8946f, 20.7071f, 23.7071f)
                curveTo(20.8946f, 23.5195f, 21.0f, 23.2652f, 21.0f, 23.0f)
                curveTo(21.0f, 22.7347f, 20.8946f, 22.4804f, 20.7071f, 22.2929f)
                curveTo(20.5196f, 22.1053f, 20.2652f, 22.0f, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _chessPiece!!
    }

private var _chessPiece: ImageVector? = null
