package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.SignInAlt: ImageVector
    get() {
        if (_signInAlt != null) {
            return _signInAlt!!
        }
        _signInAlt = Builder(name = "SignInAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 0.0f)
                horizontalLineTo(5.1f)
                arcTo(5.055f, 5.055f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 8.0f)
                verticalLineTo(5.0f)
                arcTo(3.054f, 3.054f, 0.0f, false, true, 5.1f, 2.0f)
                horizontalLineTo(18.9f)
                arcTo(3.054f, 3.054f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(3.054f, 3.054f, 0.0f, false, true, -3.1f, 3.0f)
                horizontalLineTo(5.1f)
                arcTo(3.054f, 3.054f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.055f, 5.055f, 0.0f, false, false, 5.1f, 5.0f)
                horizontalLineTo(18.9f)
                arcTo(5.055f, 5.055f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(5.055f, 5.055f, 0.0f, false, false, 18.9f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(4.0f)
                lineToRelative(13.188f, -0.03f)
                lineToRelative(-4.323f, 4.323f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, 1.414f)
                lineToRelative(4.586f, -4.586f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.242f)
                lineTo(14.281f, 5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 1.414f)
                lineToRelative(4.262f, 4.263f)
                lineTo(4.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _signInAlt!!
    }

private var _signInAlt: ImageVector? = null
