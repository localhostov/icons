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

public val Icons.Outline.LessThanEqual: ImageVector
    get() {
        if (_lessThanEqual != null) {
            return _lessThanEqual!!
        }
        _lessThanEqual = Builder(name = "LessThanEqual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(20.395f, 17.081f)
                lineToRelative(-14.58f, -6.262f)
                curveToRelative(-0.601f, -0.258f, -0.814f, -0.851f, -0.814f, -1.319f)
                reflectiveCurveToRelative(0.214f, -1.062f, 0.814f, -1.319f)
                lineTo(20.395f, 1.919f)
                curveToRelative(0.507f, -0.218f, 0.742f, -0.806f, 0.524f, -1.313f)
                curveToRelative(-0.218f, -0.508f, -0.808f, -0.74f, -1.313f, -0.524f)
                lineTo(5.024f, 6.343f)
                curveToRelative(-1.249f, 0.537f, -2.024f, 1.747f, -2.024f, 3.157f)
                reflectiveCurveToRelative(0.776f, 2.62f, 2.025f, 3.157f)
                lineToRelative(14.581f, 6.262f)
                curveToRelative(0.128f, 0.055f, 0.262f, 0.081f, 0.394f, 0.081f)
                curveToRelative(0.388f, 0.0f, 0.757f, -0.227f, 0.919f, -0.605f)
                curveToRelative(0.218f, -0.508f, -0.017f, -1.096f, -0.524f, -1.313f)
                close()
            }
        }
        .build()
        return _lessThanEqual!!
    }

private var _lessThanEqual: ImageVector? = null
