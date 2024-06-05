package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.SignInAlt: ImageVector
    get() {
        if (_signInAlt != null) {
            return _signInAlt!!
        }
        _signInAlt = Builder(name = "SignInAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.017f, 13.5f)
                horizontalLineTo(14.455f)
                lineToRelative(-2.689f, 2.689f)
                lineToRelative(2.121f, 2.122f)
                lineToRelative(4.189f, -4.19f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.242f)
                lineToRelative(-4.2f, -4.2f)
                lineTo(11.753f, 7.8f)
                lineToRelative(2.7f, 2.7f)
                horizontalLineTo(3.017f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                horizontalLineTo(3.5f)
                arcTo(3.528f, 3.528f, 0.0f, false, false, 0.0f, 3.552f)
                verticalLineTo(7.9f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.552f)
                arcTo(0.526f, 0.526f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, 0.5f, 0.548f)
                verticalLineToRelative(16.9f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.5f, 0.548f)
                horizontalLineTo(3.5f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, true, -0.5f, -0.548f)
                verticalLineTo(16.1f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(4.352f)
                arcTo(3.528f, 3.528f, 0.0f, false, false, 3.5f, 24.0f)
                horizontalLineToRelative(17.0f)
                arcTo(3.528f, 3.528f, 0.0f, false, false, 24.0f, 20.448f)
                verticalLineTo(3.552f)
                arcTo(3.528f, 3.528f, 0.0f, false, false, 20.5f, 0.0f)
                close()
            }
        }
        .build()
        return _signInAlt!!
    }

private var _signInAlt: ImageVector? = null
