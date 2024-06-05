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

public val Icons.Outline.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = Builder(name = "Form", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.828f, 3.414f)
                lineToRelative(-2.242f, -2.242f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, -2.829f, -1.172f)
                horizontalLineToRelative(-8.757f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-17.758f)
                arcToRelative(4.022f, 4.022f, 0.0f, false, false, -1.172f, -2.828f)
                close()
                moveTo(18.414f, 4.828f)
                arcToRelative(1.923f, 1.923f, 0.0f, false, true, 0.141f, 0.172f)
                horizontalLineToRelative(-2.555f)
                verticalLineToRelative(-2.555f)
                arcToRelative(1.923f, 1.923f, 0.0f, false, true, 0.172f, 0.141f)
                close()
                moveTo(5.0f, 22.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _form!!
    }

private var _form: ImageVector? = null
