package me.localx.icons.rounded.outline

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

public val Icons.Outline.Avocado: ImageVector
    get() {
        if (_avocado != null) {
            return _avocado!!
        }
        _avocado = Builder(name = "Avocado", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(-6.14f, 0.017f, -4.438f, -10.17f, 0.0f, -10.0f)
                curveTo(16.44f, 9.831f, 18.139f, 20.018f, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.93f, -0.094f, -3.339f, 6.106f, 0.0f, 6.0f)
                curveTo(15.339f, 18.105f, 13.93f, 11.907f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 24.0f)
                curveTo(6.486f, 24.0f, 2.0f, 19.881f, 2.0f, 14.818f)
                curveTo(1.981f, 2.592f, 13.721f, -5.417f, 17.589f, 4.355f)
                curveToRelative(0.905f, 3.763f, 4.787f, 6.352f, 4.411f, 10.463f)
                curveTo(22.0f, 19.881f, 17.514f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-6.37f, 0.261f, -14.267f, 18.97f, 0.0f, 20.0f)
                curveToRelative(6.356f, 0.142f, 10.443f, -6.863f, 6.445f, -11.68f)
                arcToRelative(16.967f, 16.967f, 0.0f, false, true, -2.772f, -5.39f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _avocado!!
    }

private var _avocado: ImageVector? = null
