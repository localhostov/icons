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

public val Icons.Outline.ArrowAltSquareRight: ImageVector
    get() {
        if (_arrowAltSquareRight != null) {
            return _arrowAltSquareRight!!
        }
        _arrowAltSquareRight = Builder(name = "ArrowAltSquareRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.629f, 12.896f)
                lineToRelative(-4.629f, 4.236f)
                verticalLineToRelative(-4.132f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                lineTo(13.0f, 7.0f)
                lineToRelative(4.629f, 4.236f)
                curveToRelative(0.494f, 0.443f, 0.494f, 1.217f, 0.0f, 1.66f)
                close()
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                lineTo(2.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 3.0f)
                close()
            }
        }
        .build()
        return _arrowAltSquareRight!!
    }

private var _arrowAltSquareRight: ImageVector? = null
