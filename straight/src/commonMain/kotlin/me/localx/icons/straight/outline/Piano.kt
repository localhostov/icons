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

public val Icons.Outline.Piano: ImageVector
    get() {
        if (_piano != null) {
            return _piano!!
        }
        _piano = Builder(name = "Piano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.382f, 9.477f)
                curveToRelative(-1.081f, 0.0f, -2.034f, -0.766f, -2.267f, -1.82f)
                lineToRelative(-0.23f, -1.042f)
                curveToRelative(-0.861f, -3.895f, -4.248f, -6.615f, -8.237f, -6.615f)
                curveTo(3.879f, 0.0f, 0.0f, 3.879f, 0.0f, 8.648f)
                verticalLineToRelative(15.352f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-9.905f)
                curveToRelative(0.0f, -2.546f, -2.072f, -4.618f, -4.618f, -4.618f)
                close()
                moveTo(8.648f, 2.0f)
                curveToRelative(2.995f, 0.0f, 5.637f, 2.123f, 6.284f, 5.046f)
                lineToRelative(0.23f, 1.042f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.441f, 1.996f, 2.177f, 3.389f, 4.22f, 3.389f)
                curveToRelative(1.444f, 0.0f, 2.618f, 1.174f, 2.618f, 2.618f)
                verticalLineToRelative(0.905f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-6.352f)
                curveToRelative(0.0f, -3.666f, 2.982f, -6.648f, 6.648f, -6.648f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _piano!!
    }

private var _piano: ImageVector? = null
