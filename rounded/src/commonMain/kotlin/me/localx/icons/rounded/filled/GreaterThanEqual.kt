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

public val Icons.Filled.GreaterThanEqual: ImageVector
    get() {
        if (_greaterThanEqual != null) {
            return _greaterThanEqual!!
        }
        _greaterThanEqual = Builder(name = "GreaterThanEqual", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(4.395f, 18.919f)
                lineToRelative(14.58f, -6.262f)
                curveToRelative(1.249f, -0.537f, 2.025f, -1.746f, 2.025f, -3.157f)
                reflectiveCurveToRelative(-0.776f, -2.62f, -2.025f, -3.157f)
                lineTo(4.395f, 0.081f)
                curveToRelative(-0.508f, -0.218f, -1.095f, 0.017f, -1.313f, 0.524f)
                curveToRelative(-0.218f, 0.507f, 0.017f, 1.095f, 0.524f, 1.313f)
                lineToRelative(14.58f, 6.262f)
                curveToRelative(0.601f, 0.258f, 0.814f, 0.851f, 0.814f, 1.319f)
                reflectiveCurveToRelative(-0.214f, 1.061f, -0.814f, 1.319f)
                lineToRelative(-14.58f, 6.262f)
                curveToRelative(-0.508f, 0.218f, -0.742f, 0.806f, -0.524f, 1.313f)
                curveToRelative(0.163f, 0.379f, 0.531f, 0.605f, 0.919f, 0.605f)
                curveToRelative(0.132f, 0.0f, 0.266f, -0.026f, 0.395f, -0.081f)
                close()
            }
        }
        .build()
        return _greaterThanEqual!!
    }

private var _greaterThanEqual: ImageVector? = null
