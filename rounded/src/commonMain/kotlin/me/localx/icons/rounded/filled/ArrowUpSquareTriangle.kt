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

public val Icons.Filled.ArrowUpSquareTriangle: ImageVector
    get() {
        if (_arrowUpSquareTriangle != null) {
            return _arrowUpSquareTriangle!!
        }
        _arrowUpSquareTriangle = Builder(name = "ArrowUpSquareTriangle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(23.196f, 19.583f)
                lineToRelative(-2.689f, -4.387f)
                curveToRelative(-0.399f, -0.737f, -1.169f, -1.195f, -2.007f, -1.195f)
                reflectiveCurveToRelative(-1.608f, 0.458f, -1.981f, 1.149f)
                lineToRelative(-2.741f, 4.479f)
                curveToRelative(-0.387f, 0.714f, -0.37f, 1.558f, 0.046f, 2.256f)
                reflectiveCurveToRelative(1.149f, 1.115f, 1.962f, 1.115f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.812f, 0.0f, 1.546f, -0.417f, 1.962f, -1.115f)
                reflectiveCurveToRelative(0.433f, -1.542f, 0.02f, -2.302f)
                close()
                moveTo(11.707f, 6.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineTo(7.414f, 0.586f)
                curveTo(7.024f, 0.196f, 6.512f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(-1.024f, 0.195f, -1.414f, 0.585f)
                lineTo(0.293f, 4.879f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(3.293f, -3.293f)
                lineTo(5.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(7.0f, 3.0f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.391f, 0.391f, 1.023f, 0.391f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _arrowUpSquareTriangle!!
    }

private var _arrowUpSquareTriangle: ImageVector? = null
