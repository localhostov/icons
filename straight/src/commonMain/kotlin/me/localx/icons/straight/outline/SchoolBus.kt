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

public val Icons.Outline.SchoolBus: ImageVector
    get() {
        if (_schoolBus != null) {
            return _schoolBus!!
        }
        _schoolBus = Builder(name = "SchoolBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(2.041f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, -0.5f)
                horizontalLineToRelative(6.082f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -0.041f, -0.5f)
                horizontalLineToRelative(2.041f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(2.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(7.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, -0.5f)
                horizontalLineToRelative(2.814f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, 0.5f)
                close()
                moveTo(20.0f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, -0.5f)
                horizontalLineToRelative(2.814f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 0.093f, 0.5f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _schoolBus!!
    }

private var _schoolBus: ImageVector? = null
