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

public val Icons.Outline.TableList: ImageVector
    get() {
        if (_tableList != null) {
            return _tableList!!
        }
        _tableList = Builder(name = "TableList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(2.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _tableList!!
    }

private var _tableList: ImageVector? = null
