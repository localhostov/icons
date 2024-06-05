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

public val Icons.Outline.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 2.0f)
                horizontalLineToRelative(-4.54f)
                arcToRelative(5.973f, 5.973f, 0.0f, false, false, -8.92f, 0.0f)
                horizontalLineToRelative(-4.54f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.382f)
                lineToRelative(1.282f, -2.553f)
                lineToRelative(-1.79f, -0.894f)
                lineToRelative(-1.728f, 3.447f)
                horizontalLineToRelative(-2.382f)
                verticalLineToRelative(-1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.35f)
                arcToRelative(5.976f, 5.976f, 0.0f, false, false, -0.35f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(5.976f, 5.976f, 0.0f, false, false, -0.35f, -2.0f)
                horizontalLineToRelative(3.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
