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

public val Icons.Filled.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.913f)
                lineToRelative(1.8f, -3.547f)
                lineToRelative(-1.784f, -0.906f)
                lineToRelative(-2.261f, 4.453f)
                horizontalLineToRelative(-2.842f)
                verticalLineToRelative(-2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-2.685f)
                arcToRelative(6.955f, 6.955f, 0.0f, false, true, 0.685f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(6.955f, 6.955f, 0.0f, false, true, 0.685f, -3.0f)
                horizontalLineToRelative(-2.685f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
