package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.FlorinSign: ImageVector
    get() {
        if (_florinSign != null) {
            return _florinSign!!
        }
        _florinSign = Builder(name = "FlorinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.38f, 2.59f)
                lineToRelative(-3.37f, 7.41f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.9f)
                lineToRelative(-4.66f, 10.24f)
                curveToRelative(-0.49f, 1.07f, -1.56f, 1.76f, -2.73f, 1.76f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.71f)
                curveToRelative(0.39f, 0.0f, 0.75f, -0.23f, 0.91f, -0.59f)
                lineToRelative(4.28f, -9.41f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.81f)
                lineTo(15.56f, 1.76f)
                curveToRelative(0.49f, -1.07f, 1.56f, -1.76f, 2.73f, -1.76f)
                horizontalLineToRelative(5.71f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-5.71f)
                curveToRelative(-0.39f, 0.0f, -0.75f, 0.23f, -0.91f, 0.59f)
                close()
            }
        }
        .build()
        return _florinSign!!
    }

private var _florinSign: ImageVector? = null
