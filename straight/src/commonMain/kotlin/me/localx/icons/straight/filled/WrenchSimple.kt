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

public val Icons.Filled.WrenchSimple: ImageVector
    get() {
        if (_wrenchSimple != null) {
            return _wrenchSimple!!
        }
        _wrenchSimple = Builder(name = "WrenchSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.315f, 0.542f)
                lineToRelative(-0.315f, -0.105f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(0.437f)
                lineToRelative(-0.315f, 0.105f)
                curveTo(4.387f, 1.973f, 1.5f, 5.975f, 1.5f, 10.5f)
                curveToRelative(0.0f, 4.28f, 2.584f, 8.093f, 6.5f, 9.703f)
                verticalLineToRelative(3.797f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.797f)
                curveToRelative(3.916f, -1.61f, 6.5f, -5.423f, 6.5f, -9.703f)
                curveToRelative(0.0f, -4.525f, -2.887f, -8.527f, -7.185f, -9.958f)
                close()
            }
        }
        .build()
        return _wrenchSimple!!
    }

private var _wrenchSimple: ImageVector? = null
