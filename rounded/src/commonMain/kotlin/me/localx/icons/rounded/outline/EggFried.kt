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

public val Icons.Outline.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                curveToRelative(-7.268f, 0.231f, -7.267f, 10.77f, 0.0f, 11.0f)
                curveTo(16.768f, 15.769f, 16.767f, 5.23f, 9.5f, 5.0f)
                close()
                moveTo(9.5f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.5f, 14.0f)
                close()
                moveTo(19.524f, 5.322f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -1.212f, -0.866f)
                arcTo(9.943f, 9.943f, 0.0f, false, false, 9.549f, 0.01f)
                arcTo(10.227f, 10.227f, 0.0f, false, false, 0.0f, 11.0f)
                arcTo(13.015f, 13.015f, 0.0f, false, false, 13.0f, 24.0f)
                arcToRelative(8.223f, 8.223f, 0.0f, false, false, 7.829f, -6.121f)
                arcToRelative(2.534f, 2.534f, 0.0f, false, true, 0.829f, -1.389f)
                curveTo(25.561f, 13.437f, 24.287f, 6.715f, 19.524f, 5.322f)
                close()
                moveTo(20.378f, 14.953f)
                arcToRelative(4.547f, 4.547f, 0.0f, false, false, -1.5f, 2.487f)
                arcTo(6.157f, 6.157f, 0.0f, false, true, 13.0f, 22.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, true, 2.0f, 11.0f)
                curveToRelative(-0.339f, -4.727f, 3.367f, -9.047f, 8.0f, -9.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 6.646f, 3.566f)
                arcTo(4.257f, 4.257f, 0.0f, false, false, 18.9f, 7.223f)
                horizontalLineToRelative(0.0f)
                arcTo(4.524f, 4.524f, 0.0f, false, true, 20.378f, 14.953f)
                close()
                moveTo(13.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 19.0f)
                close()
                moveTo(20.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 11.0f)
                close()
                moveTo(16.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 17.0f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
