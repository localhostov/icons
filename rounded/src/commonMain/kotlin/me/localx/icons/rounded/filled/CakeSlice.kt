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
                moveToRelative(0.339f, 12.0f)
                curveToRelative(0.277f, -0.787f, 0.718f, -1.514f, 1.306f, -2.134f)
                curveTo(1.645f, 9.866f, 10.129f, 0.923f, 10.192f, 0.881f)
                curveToRelative(0.847f, -0.565f, 1.831f, -0.87f, 2.844f, -0.881f)
                curveToRelative(1.113f, 0.005f, 2.191f, 0.332f, 3.081f, 0.996f)
                curveToRelative(3.401f, 2.542f, 5.564f, 5.535f, 6.78f, 7.597f)
                curveToRelative(0.612f, 1.038f, 0.979f, 2.204f, 1.077f, 3.407f)
                lineTo(0.339f, 12.0f)
                close()
                moveTo(0.0f, 14.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 14.0f)
                close()
                moveTo(0.101f, 20.0f)
                curveToRelative(0.465f, 2.279f, 2.485f, 4.0f, 4.899f, 4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, -1.721f, 4.899f, -4.0f)
                lineTo(0.101f, 20.0f)
                close()
            }
        }
        .build()
        return _cakeSlice!!
    }

private var _cakeSlice: ImageVector? = null
