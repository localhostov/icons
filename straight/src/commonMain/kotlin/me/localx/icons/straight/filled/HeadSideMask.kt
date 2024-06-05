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

public val Icons.Filled.HeadSideMask: ImageVector
    get() {
        if (_headSideMask != null) {
            return _headSideMask!!
        }
        _headSideMask = Builder(name = "HeadSideMask", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.35f, 13.0f)
                horizontalLineToRelative(1.41f)
                curveToRelative(2.56f, 0.0f, 5.01f, -0.8f, 7.08f, -2.31f)
                lineToRelative(1.7f, -1.24f)
                curveToRelative(-0.91f, -2.05f, -1.8f, -3.88f, -2.73f, -5.03f)
                curveTo(17.36f, 1.16f, 13.5f, -0.45f, 9.45f, 0.11f)
                curveTo(6.36f, 0.53f, 3.68f, 2.28f, 1.96f, 4.75f)
                lineTo(12.35f, 13.0f)
                close()
                moveTo(3.0f, 24.0f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0.0f, -0.46f, -0.16f, -0.91f, -0.46f, -1.26f)
                curveTo(0.67f, 15.78f, -0.22f, 12.92f, 0.05f, 9.98f)
                curveToRelative(0.11f, -1.22f, 0.43f, -2.39f, 0.92f, -3.47f)
                lineTo(11.15f, 14.6f)
                lineToRelative(3.13f, 9.4f)
                horizontalLineTo(3.0f)
                close()
                moveTo(23.91f, 12.59f)
                lineToRelative(0.09f, 0.19f)
                verticalLineToRelative(6.21f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-2.61f)
                lineToRelative(-3.0f, -9.0f)
                horizontalLineToRelative(0.37f)
                curveToRelative(2.99f, 0.0f, 5.85f, -0.93f, 8.26f, -2.7f)
                lineToRelative(1.34f, -0.98f)
                curveToRelative(0.19f, 0.43f, 0.37f, 0.85f, 0.56f, 1.27f)
                close()
            }
        }
        .build()
        return _headSideMask!!
    }

private var _headSideMask: ImageVector? = null
