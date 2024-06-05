package me.localx.icons.straight.filled

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

public val Icons.Filled.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = Builder(name = "Form", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 14.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(19.828f, 3.414f)
                lineTo(17.586f, 1.172f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.586f, -0.953f)
                verticalLineToRelative(4.781f)
                horizontalLineToRelative(4.785f)
                arcToRelative(3.969f, 3.969f, 0.0f, false, false, -0.957f, -1.586f)
                close()
            }
        }
        .build()
        return _form!!
    }

private var _form: ImageVector? = null
