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

public val Icons.Outline.PlateUtensils: ImageVector
    get() {
        if (_plateUtensils != null) {
            return _plateUtensils!!
        }
        _plateUtensils = Builder(name = "PlateUtensils", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.414f, -1.721f, 4.434f, -4.0f, 4.899f)
                verticalLineToRelative(11.101f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-11.101f)
                curveToRelative(-2.279f, -0.465f, -4.0f, -2.484f, -4.0f, -4.899f)
                lineTo(14.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.302f, 0.839f, 2.402f, 2.0f, 2.816f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.816f)
                curveToRelative(1.161f, -0.414f, 2.0f, -1.514f, 2.0f, -2.816f)
                lineTo(22.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(14.728f, 21.624f)
                curveToRelative(-0.884f, 0.25f, -1.801f, 0.376f, -2.728f, 0.376f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                curveTo(2.0f, 6.79f, 5.908f, 2.508f, 11.09f, 2.041f)
                curveToRelative(0.55f, -0.05f, 0.956f, -0.536f, 0.906f, -1.086f)
                curveToRelative(-0.049f, -0.55f, -0.518f, -0.946f, -1.086f, -0.906f)
                curveTo(4.69f, 0.61f, 0.0f, 5.748f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.11f, 0.0f, 2.211f, -0.152f, 3.272f, -0.452f)
                curveToRelative(0.531f, -0.15f, 0.84f, -0.703f, 0.69f, -1.234f)
                curveToRelative(-0.15f, -0.531f, -0.7f, -0.837f, -1.234f, -0.69f)
                close()
                moveTo(14.571f, 17.423f)
                curveToRelative(-0.806f, 0.383f, -1.67f, 0.577f, -2.571f, 0.577f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.967f, 2.21f, -5.52f, 5.142f, -5.939f)
                curveToRelative(0.547f, -0.078f, 0.927f, -0.584f, 0.848f, -1.131f)
                curveToRelative(-0.078f, -0.547f, -0.587f, -0.923f, -1.131f, -0.848f)
                curveToRelative(-3.91f, 0.559f, -6.858f, 3.964f, -6.858f, 7.919f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.2f, 0.0f, 2.354f, -0.259f, 3.429f, -0.771f)
                curveToRelative(0.499f, -0.237f, 0.711f, -0.834f, 0.474f, -1.333f)
                curveToRelative(-0.237f, -0.499f, -0.834f, -0.711f, -1.333f, -0.474f)
                close()
            }
        }
        .build()
        return _plateUtensils!!
    }

private var _plateUtensils: ImageVector? = null
