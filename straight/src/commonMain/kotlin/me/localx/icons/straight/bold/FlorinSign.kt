package me.localx.icons.straight.bold

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

public val Icons.Bold.FlorinSign: ImageVector
    get() {
        if (_florinSign != null) {
            return _florinSign!!
        }
        _florinSign = Builder(name = "FlorinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.61f, 3.29f)
                lineToRelative(-2.82f, 6.21f)
                horizontalLineToRelative(4.22f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.58f)
                lineToRelative(-4.3f, 9.45f)
                curveToRelative(-0.56f, 1.25f, -1.82f, 2.05f, -3.19f, 2.05f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(5.94f)
                curveToRelative(0.2f, 0.0f, 0.37f, -0.12f, 0.45f, -0.29f)
                lineToRelative(3.73f, -8.21f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.49f)
                lineToRelative(3.39f, -7.45f)
                curveToRelative(0.56f, -1.25f, 1.82f, -2.05f, 3.19f, -2.05f)
                horizontalLineToRelative(5.94f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-5.94f)
                curveToRelative(-0.2f, 0.0f, -0.37f, 0.12f, -0.45f, 0.29f)
                close()
            }
        }
        .build()
        return _florinSign!!
    }

private var _florinSign: ImageVector? = null
