package me.localx.icons.rounded.outline

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

public val Icons.Outline.ChessQueenAlt: ImageVector
    get() {
        if (_chessQueenAlt != null) {
            return _chessQueenAlt!!
        }
        _chessQueenAlt = Builder(name = "ChessQueenAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-0.316f)
                arcTo(44.01f, 44.01f, 0.0f, false, true, 16.069f, 8.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.472f)
                reflectiveCurveToRelative(1.281f, -2.214f, 1.294f, -2.245f)
                arcToRelative(1.942f, 1.942f, 0.0f, false, false, -2.864f, -2.4f)
                lineToRelative(-0.677f, 0.364f)
                reflectiveCurveTo(13.461f, 0.634f, 13.432f, 0.6f)
                arcToRelative(2.045f, 2.045f, 0.0f, false, false, -2.864f, 0.0f)
                curveToRelative(-0.029f, 0.03f, -0.849f, 1.11f, -0.849f, 1.11f)
                lineTo(9.042f, 1.35f)
                arcToRelative(1.942f, 1.942f, 0.0f, false, false, -2.864f, 2.4f)
                curveTo(6.191f, 3.786f, 7.472f, 6.0f, 7.472f, 6.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 8.0f)
                horizontalLineToRelative(0.931f)
                arcTo(44.084f, 44.084f, 0.0f, false, true, 5.316f, 18.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(9.526f, 3.881f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.8f, 3.6f)
                lineTo(12.0f, 2.013f)
                lineTo(13.2f, 3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.272f, 0.277f)
                lineToRelative(1.409f, -0.758f)
                lineTo(14.215f, 6.0f)
                horizontalLineTo(9.785f)
                lineTo(8.11f, 3.119f)
                close()
                moveTo(9.939f, 8.0f)
                horizontalLineToRelative(4.122f)
                arcToRelative(43.091f, 43.091f, 0.0f, false, false, 2.487f, 10.0f)
                horizontalLineToRelative(-9.1f)
                arcTo(43.091f, 43.091f, 0.0f, false, false, 9.939f, 8.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _chessQueenAlt!!
    }

private var _chessQueenAlt: ImageVector? = null
