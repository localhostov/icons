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

public val Icons.Filled.Dinner: ImageVector
    get() {
        if (_dinner != null) {
            return _dinner!!
        }
        _dinner = Builder(name = "Dinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 8.0f)
                curveToRelative(0.0f, -1.283f, 0.423f, -3.438f, 1.327f, -5.421f)
                curveToRelative(-1.042f, -0.368f, -2.159f, -0.579f, -3.327f, -0.579f)
                curveTo(4.477f, 2.0f, 0.0f, 6.477f, 0.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.254f, 0.0f, 4.327f, -0.755f, 6.0f, -2.014f)
                verticalLineToRelative(-5.663f)
                curveToRelative(-2.391f, -1.14f, -4.0f, -3.585f, -4.0f, -6.323f)
                close()
                moveTo(11.0f, 12.0f)
                curveToRelative(0.0f, 0.265f, -0.105f, 0.52f, -0.293f, 0.707f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.707f, -1.707f)
                verticalLineToRelative(-3.586f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 8.0f)
                curveToRelative(0.0f, -2.375f, -1.971f, -8.0f, -5.078f, -8.0f)
                curveToRelative(-3.062f, 0.0f, -4.922f, 5.557f, -4.922f, 8.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.434f, 4.0f, 4.899f)
                verticalLineToRelative(10.101f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-10.101f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.484f, 4.0f, -4.899f)
                close()
            }
        }
        .build()
        return _dinner!!
    }

private var _dinner: ImageVector? = null
