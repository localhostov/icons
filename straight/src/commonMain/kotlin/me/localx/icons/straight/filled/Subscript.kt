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

public val Icons.Filled.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.808f, 0.0f)
                lineToRelative(-6.574f, 9.0f)
                lineToRelative(6.574f, 9.0f)
                horizontalLineToRelative(-2.48f)
                lineToRelative(-5.334f, -7.309f)
                lineToRelative(-5.359f, 7.309f)
                lineTo(0.154f, 18.0f)
                lineToRelative(6.599f, -9.0f)
                lineTo(0.135f, 0.0f)
                horizontalLineToRelative(2.48f)
                lineToRelative(5.378f, 7.309f)
                lineTo(13.327f, 0.0f)
                horizontalLineToRelative(2.48f)
                close()
                moveTo(22.488f, 13.0f)
                lineToRelative(-2.972f, 3.07f)
                lineToRelative(1.441f, 1.387f)
                lineToRelative(1.043f, -1.064f)
                verticalLineToRelative(7.607f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-1.513f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
