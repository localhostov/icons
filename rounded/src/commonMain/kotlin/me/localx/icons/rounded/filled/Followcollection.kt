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

public val Icons.Filled.Followcollection: ImageVector
    get() {
        if (_followcollection != null) {
            return _followcollection!!
        }
        _followcollection = Builder(name = "Followcollection", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.79f, 11.0f, 0.0f, 9.21f, 0.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 1.79f, 1.79f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(20.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(21.25f, 0.0f)
                curveToRelative(-1.34f, 0.0f, -2.51f, 1.05f, -2.76f, 2.44f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.25f, -1.39f, -1.4f, -2.44f, -2.74f, -2.44f)
                curveToRelative(-1.52f, 0.0f, -2.75f, 1.35f, -2.75f, 3.02f)
                curveToRelative(0.0f, 2.38f, 3.1f, 5.21f, 4.65f, 6.45f)
                curveToRelative(0.5f, 0.4f, 1.21f, 0.4f, 1.71f, 0.0f)
                curveToRelative(1.54f, -1.24f, 4.65f, -4.07f, 4.65f, -6.45f)
                curveToRelative(0.0f, -1.67f, -1.23f, -3.02f, -2.75f, -3.02f)
                close()
            }
        }
        .build()
        return _followcollection!!
    }

private var _followcollection: ImageVector? = null
