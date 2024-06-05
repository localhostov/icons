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

public val Icons.Filled.TrashCheck: ImageVector
    get() {
        if (_trashCheck != null) {
            return _trashCheck!!
        }
        _trashCheck = Builder(name = "TrashCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 4.0f)
                horizontalLineToRelative(-4.101f)
                curveToRelative(-0.465f, -2.279f, -2.484f, -4.0f, -4.899f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.414f, 0.0f, -4.434f, 1.721f, -4.899f, 4.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.86f)
                lineToRelative(1.296f, 13.479f)
                curveToRelative(0.248f, 2.578f, 2.388f, 4.521f, 4.977f, 4.521f)
                horizontalLineToRelative(5.728f)
                curveToRelative(2.593f, 0.0f, 4.732f, -1.947f, 4.977f, -4.528f)
                lineToRelative(1.277f, -13.472f)
                horizontalLineToRelative(0.886f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.302f, 0.0f, 2.402f, 0.839f, 2.816f, 2.0f)
                horizontalLineToRelative(-7.631f)
                curveToRelative(0.414f, -1.161f, 1.514f, -2.0f, 2.816f, -2.0f)
                close()
                moveTo(16.739f, 12.726f)
                lineToRelative(-3.552f, 3.373f)
                curveToRelative(-0.571f, 0.563f, -1.329f, 0.846f, -2.088f, 0.846f)
                reflectiveCurveToRelative(-1.521f, -0.282f, -2.101f, -0.849f)
                lineToRelative(-1.612f, -1.465f)
                curveToRelative(-0.409f, -0.372f, -0.438f, -1.005f, -0.067f, -1.413f)
                reflectiveCurveToRelative(1.004f, -0.438f, 1.413f, -0.067f)
                lineToRelative(1.638f, 1.489f)
                curveToRelative(0.414f, 0.403f, 1.042f, 0.401f, 1.427f, 0.021f)
                lineToRelative(3.565f, -3.387f)
                curveToRelative(0.401f, -0.38f, 1.033f, -0.362f, 1.414f, 0.037f)
                curveToRelative(0.38f, 0.4f, 0.363f, 1.033f, -0.037f, 1.414f)
                close()
            }
        }
        .build()
        return _trashCheck!!
    }

private var _trashCheck: ImageVector? = null
