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

public val Icons.Filled.CakeSlice: ImageVector
    get() {
        if (_cakeSlice != null) {
            return _cakeSlice!!
        }
        _cakeSlice = Builder(name = "CakeSlice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.993f, 12.0f)
                lineTo(0.0f, 12.0f)
                lineTo(10.192f, 0.881f)
                curveToRelative(0.847f, -0.565f, 1.831f, -0.87f, 2.844f, -0.881f)
                curveToRelative(1.113f, 0.005f, 2.191f, 0.332f, 3.081f, 0.996f)
                curveToRelative(3.906f, 2.919f, 6.171f, 6.448f, 7.174f, 8.292f)
                curveToRelative(0.446f, 0.819f, 0.683f, 1.755f, 0.702f, 2.711f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(0.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 14.0f)
                close()
            }
        }
        .build()
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
