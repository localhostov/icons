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

public val Icons.Filled.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.48f)
                verticalLineToRelative(11.52f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-8.248f)
                lineToRelative(-7.4f, 3.536f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.577f, 0.694f)
                arcToRelative(5.272f, 5.272f, 0.0f, false, true, -2.7f, -0.739f)
                lineToRelative(-7.38f, -3.513f)
                arcToRelative(3.691f, 3.691f, 0.0f, false, true, -0.084f, -6.455f)
                curveToRelative(0.027f, -0.016f, 0.056f, -0.031f, 0.084f, -0.045f)
                lineToRelative(7.457f, -3.558f)
                arcToRelative(5.226f, 5.226f, 0.0f, false, true, 5.282f, 0.045f)
                lineToRelative(7.375f, 3.513f)
                arcToRelative(3.767f, 3.767f, 0.0f, false, true, 1.943f, 3.25f)
                close()
                moveTo(12.022f, 17.98f)
                arcToRelative(7.26f, 7.26f, 0.0f, false, true, -3.645f, -0.972f)
                lineToRelative(-4.377f, -2.089f)
                verticalLineToRelative(2.7f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 3.519f, 4.778f)
                arcToRelative(15.557f, 15.557f, 0.0f, false, false, 4.481f, 0.603f)
                arcToRelative(15.557f, 15.557f, 0.0f, false, false, 4.481f, -0.607f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, false, 3.519f, -4.778f)
                verticalLineToRelative(-2.691f)
                lineToRelative(-4.459f, 2.13f)
                arcToRelative(6.983f, 6.983f, 0.0f, false, true, -3.519f, 0.928f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
