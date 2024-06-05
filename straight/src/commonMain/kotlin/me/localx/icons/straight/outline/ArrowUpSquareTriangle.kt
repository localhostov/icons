package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.ArrowUpSquareTriangle: ImageVector
    get() {
        if (_arrowUpSquareTriangle != null) {
            return _arrowUpSquareTriangle!!
        }
        _arrowUpSquareTriangle = Builder(name = "ArrowUpSquareTriangle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.415f, 0.586f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(7.001f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.001f, 3.0f)
                lineTo(1.5f, 6.5f)
                lineTo(0.086f, 5.086f)
                lineTo(4.586f, 0.586f)
                curveToRelative(0.756f, -0.756f, 2.074f, -0.756f, 2.829f, 0.0f)
                close()
                moveTo(23.0f, 10.0f)
                lineTo(14.0f, 10.0f)
                lineTo(14.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                lineTo(23.0f, 10.0f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(23.975f, 23.0f)
                lineTo(13.025f, 23.0f)
                lineToRelative(5.475f, -10.098f)
                lineToRelative(5.475f, 10.098f)
                close()
                moveTo(16.385f, 21.0f)
                horizontalLineToRelative(4.23f)
                lineToRelative(-2.115f, -3.902f)
                lineToRelative(-2.115f, 3.902f)
                close()
            }
        }
        .build()
        return _arrowUpSquareTriangle!!
    }

private var _arrowUpSquareTriangle: ImageVector? = null
