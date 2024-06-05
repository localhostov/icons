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

public val Icons.Filled.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.929f, 9.891f)
                curveToRelative(-0.59f, -0.56f, -0.929f, -1.351f, -0.929f, -2.17f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.721f)
                curveToRelative(0.0f, 0.819f, -0.339f, 1.61f, -0.929f, 2.169f)
                curveToRelative(-1.281f, 1.214f, -3.052f, 3.066f, -4.35f, 5.11f)
                horizontalLineToRelative(17.279f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(0.653f)
                curveToRelative(-0.406f, 0.956f, -0.653f, 1.922f, -0.653f, 2.857f)
                curveToRelative(0.0f, 0.862f, 0.23f, 1.648f, 0.685f, 2.334f)
                curveToRelative(0.747f, 1.132f, 2.059f, 1.809f, 3.508f, 1.809f)
                horizontalLineToRelative(15.615f)
                curveToRelative(1.449f, 0.0f, 2.761f, -0.676f, 3.507f, -1.808f)
                curveToRelative(0.455f, -0.688f, 0.686f, -1.473f, 0.686f, -2.335f)
                curveToRelative(0.0f, -3.667f, -3.804f, -7.818f, -6.071f, -9.966f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
