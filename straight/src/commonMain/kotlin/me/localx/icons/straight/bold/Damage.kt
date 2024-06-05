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

public val Icons.Bold.Damage: ImageVector
    get() {
        if (_damage != null) {
            return _damage!!
        }
        _damage = Builder(name = "Damage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(2.219f)
                lineToRelative(3.099f, 6.0f)
                horizontalLineToRelative(3.3f)
                lineToRelative(2.071f, 3.729f)
                lineToRelative(2.622f, -1.457f)
                lineToRelative(-1.262f, -2.271f)
                horizontalLineToRelative(2.451f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.355f)
                lineToRelative(-1.549f, -3.0f)
                horizontalLineToRelative(11.405f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(14.766f)
                lineToRelative(-4.031f, -3.411f)
                lineToRelative(-1.938f, 2.29f)
                lineToRelative(4.556f, 3.855f)
                horizontalLineTo(4.316f)
                lineToRelative(7.508f, -3.73f)
                lineToRelative(-1.335f, -2.687f)
                lineToRelative(-2.497f, 1.24f)
                lineToRelative(0.007f, -2.82f)
                lineToRelative(-3.0f, -0.008f)
                lineToRelative(-0.011f, 4.32f)
                lineToRelative(-1.989f, 0.988f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _damage!!
    }

private var _damage: ImageVector? = null
