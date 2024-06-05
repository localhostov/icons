package me.localx.icons.straight.bold

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

public val Icons.Bold.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.8f, 0.0f)
                lineToRelative(-6.6f, 9.0f)
                lineToRelative(6.6f, 9.0f)
                horizontalLineToRelative(-3.721f)
                lineToRelative(-4.74f, -6.463f)
                lineToRelative(-4.74f, 6.463f)
                lineTo(0.879f, 18.0f)
                lineToRelative(6.6f, -9.0f)
                lineTo(0.879f, 0.0f)
                horizontalLineToRelative(3.721f)
                lineToRelative(4.74f, 6.463f)
                lineTo(14.079f, 0.0f)
                horizontalLineToRelative(3.721f)
                close()
                moveTo(21.782f, 13.0f)
                lineToRelative(-2.661f, 2.724f)
                lineToRelative(1.879f, 1.836f)
                verticalLineToRelative(6.44f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-2.218f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
