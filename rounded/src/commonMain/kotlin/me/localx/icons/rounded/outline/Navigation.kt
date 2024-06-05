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

public val Icons.Outline.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.987f, 6.108f)
                curveToRelative(-0.039f, 0.011f, -7.228f, 2.864f, -7.228f, 2.864f)
                arcToRelative(2.76f, 2.76f, 0.0f, false, false, 0.2f, 5.212f)
                lineToRelative(2.346f, 0.587f)
                lineToRelative(0.773f, 2.524f)
                arcTo(2.739f, 2.739f, 0.0f, false, false, 12.617f, 19.0f)
                horizontalLineToRelative(0.044f)
                arcToRelative(2.738f, 2.738f, 0.0f, false, false, 2.532f, -1.786f)
                reflectiveCurveToRelative(2.693f, -7.165f, 2.7f, -7.2f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -3.908f, -3.907f)
                close()
                moveTo(15.97f, 9.467f)
                lineTo(13.322f, 16.51f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, -0.692f, 0.49f)
                curveToRelative(-0.1f, -0.012f, -0.525f, -0.026f, -0.675f, -0.378f)
                lineToRelative(-0.908f, -2.976f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.713f, -0.679f)
                lineToRelative(-2.818f, -0.7f)
                arcToRelative(0.762f, 0.762f, 0.0f, false, true, -0.027f, -1.433f)
                lineToRelative(7.06f, -2.8f)
                arcToRelative(1.149f, 1.149f, 0.0f, false, true, 1.094f, 0.32f)
                arcTo(1.19f, 1.19f, 0.0f, false, true, 15.97f, 9.467f)
                close()
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
