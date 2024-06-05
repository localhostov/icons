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
                moveToRelative(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(6.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-14.0f)
                close()
            }
        }
        .build()
        return _tableList!!
    }

private var _tableList: ImageVector? = null
