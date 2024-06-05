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

public val Icons.Outline.ChessKingAlt: ImageVector
    get() {
        if (_chessKingAlt != null) {
            return _chessKingAlt!!
        }
        _chessKingAlt = Builder(name = "ChessKingAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(-0.394f)
                arcToRelative(25.306f, 25.306f, 0.0f, false, true, -2.531f, -8.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.392f)
                reflectiveCurveTo(17.7f, 6.318f, 17.715f, 6.277f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.288f, 6.277f)
                curveTo(6.307f, 6.318f, 7.4f, 8.0f, 7.4f, 8.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.926f)
                arcToRelative(25.327f, 25.327f, 0.0f, false, true, -2.532f, 8.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(8.075f, 5.374f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.928f, 1.374f)
                lineTo(14.224f, 8.0f)
                horizontalLineTo(9.779f)
                close()
                moveTo(9.935f, 10.0f)
                horizontalLineToRelative(4.13f)
                arcToRelative(25.75f, 25.75f, 0.0f, false, false, 2.318f, 8.0f)
                horizontalLineTo(7.617f)
                arcTo(25.75f, 25.75f, 0.0f, false, false, 9.935f, 10.0f)
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
        return _chessKingAlt!!
    }

private var _chessKingAlt: ImageVector? = null
