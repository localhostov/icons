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

public val Icons.Bold.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.44f)
                lineToRelative(-1.879f, -1.836f)
                lineToRelative(2.661f, -2.724f)
                horizontalLineToRelative(2.218f)
                close()
                moveTo(14.079f, 6.0f)
                lineToRelative(-4.74f, 6.463f)
                lineToRelative(-4.74f, -6.463f)
                lineTo(0.879f, 6.0f)
                lineToRelative(6.6f, 9.0f)
                lineTo(0.879f, 24.0f)
                horizontalLineToRelative(3.721f)
                lineToRelative(4.74f, -6.463f)
                lineToRelative(4.74f, 6.463f)
                horizontalLineToRelative(3.721f)
                lineToRelative(-6.6f, -9.0f)
                lineToRelative(6.6f, -9.0f)
                horizontalLineToRelative(-3.721f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
