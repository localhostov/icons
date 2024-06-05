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

public val Icons.Bold.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 2.0f)
                horizontalLineToRelative(-4.04f)
                arcToRelative(5.973f, 5.973f, 0.0f, false, false, -8.92f, 0.0f)
                horizontalLineToRelative(-4.04f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2.59f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.09f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.291f)
                lineToRelative(2.427f, -5.0f)
                lineToRelative(2.682f, 1.342f)
                lineToRelative(-1.7f, 3.658f)
                horizontalLineToRelative(5.3f)
                verticalLineToRelative(-2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.09f, -1.0f)
                horizontalLineToRelative(2.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
