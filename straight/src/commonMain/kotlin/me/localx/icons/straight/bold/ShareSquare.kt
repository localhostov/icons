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

public val Icons.Bold.ShareSquare: ImageVector
    get() {
        if (_shareSquare != null) {
            return _shareSquare!!
        }
        _shareSquare = Builder(name = "ShareSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.97f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.51f)
                curveTo(0.0f, 8.58f, 1.57f, 7.01f, 3.5f, 7.01f)
                horizontalLineToRelative(3.76f)
                curveToRelative(-0.69f, 0.83f, -1.13f, 1.87f, -1.24f, 3.0f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.46f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(23.27f, 6.75f)
                lineTo(16.52f, 0.0f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.9f, 4.9f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.46f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.46f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.79f)
                lineToRelative(-4.9f, 4.9f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(6.75f, -6.75f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f)
                close()
            }
        }
        .build()
        return _shareSquare!!
    }

private var _shareSquare: ImageVector? = null
