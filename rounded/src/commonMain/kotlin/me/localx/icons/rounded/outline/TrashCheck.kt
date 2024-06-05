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

public val Icons.Outline.TrashCheck: ImageVector
    get() {
        if (_trashCheck != null) {
            return _trashCheck!!
        }
        _trashCheck = Builder(name = "TrashCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.776f, 11.312f)
                curveToRelative(0.38f, 0.4f, 0.363f, 1.033f, -0.037f, 1.414f)
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
                close()
                moveTo(23.0f, 5.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.886f)
                lineToRelative(-1.277f, 13.472f)
                curveToRelative(-0.244f, 2.581f, -2.384f, 4.528f, -4.977f, 4.528f)
                horizontalLineToRelative(-5.728f)
                curveToRelative(-2.589f, 0.0f, -4.729f, -1.943f, -4.977f, -4.521f)
                lineToRelative(-1.296f, -13.479f)
                horizontalLineToRelative(-0.86f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.465f, -2.279f, 2.485f, -4.0f, 4.899f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, 1.721f, 4.899f, 4.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(8.172f, 4.0f)
                horizontalLineToRelative(7.656f)
                curveToRelative(-0.413f, -1.164f, -1.524f, -2.0f, -2.828f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                close()
                moveTo(19.106f, 6.0f)
                lineTo(4.87f, 6.0f)
                lineToRelative(1.278f, 13.287f)
                curveToRelative(0.148f, 1.547f, 1.432f, 2.713f, 2.986f, 2.713f)
                horizontalLineToRelative(5.728f)
                curveToRelative(1.556f, 0.0f, 2.839f, -1.168f, 2.986f, -2.717f)
                lineToRelative(1.259f, -13.283f)
                close()
            }
        }
        .build()
        return _trashCheck!!
    }

private var _trashCheck: ImageVector? = null
