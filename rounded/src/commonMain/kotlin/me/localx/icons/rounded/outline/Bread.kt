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

public val Icons.Outline.Bread: ImageVector
    get() {
        if (_bread != null) {
            return _bread!!
        }
        _bread = Builder(name = "Bread", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.028f, 24.0f)
                curveToRelative(-4.979f, -0.021f, -7.075f, -4.188f, -5.535f, -9.179f)
                curveTo(2.343f, 7.43f, 15.015f, -4.362f, 22.359f, 1.641f)
                horizontalLineToRelative(0.0f)
                curveTo(28.834f, 9.569f, 14.584f, 24.3f, 6.028f, 24.0f)
                close()
                moveTo(17.969f, 2.0f)
                curveTo(11.4f, 2.25f, 4.239f, 9.3f, 2.411f, 15.384f)
                curveToRelative(-0.721f, 2.451f, -0.492f, 4.426f, 0.644f, 5.561f)
                curveToRelative(6.8f, 5.332f, 23.222f, -11.089f, 17.89f, -17.89f)
                horizontalLineToRelative(0.0f)
                arcTo(4.072f, 4.072f, 0.0f, false, false, 17.969f, 2.0f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(4.784f, 4.784f, 0.0f, false, false, -5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(2.783f, 2.783f, 0.0f, false, true, 3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 14.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(4.784f, 4.784f, 0.0f, false, false, -5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(2.783f, 2.783f, 0.0f, false, true, 3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 10.0f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(4.784f, 4.784f, 0.0f, false, false, -5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(2.783f, 2.783f, 0.0f, false, true, 3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                close()
            }
        }
        .build()
        return _bread!!
    }

private var _bread: ImageVector? = null
