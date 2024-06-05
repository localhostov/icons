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

public val Icons.Bold.Jug: ImageVector
    get() {
        if (_jug != null) {
            return _jug!!
        }
        _jug = Builder(name = "Jug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 11.06f)
                curveToRelative(0.67f, -0.76f, 1.06f, -1.75f, 1.06f, -2.81f)
                curveToRelative(0.0f, -2.34f, -1.91f, -4.25f, -4.25f, -4.25f)
                curveToRelative(-0.62f, 0.0f, -1.22f, 0.14f, -1.75f, 0.38f)
                verticalLineToRelative(-1.38f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 7.7f)
                lineToRelative(-4.44f, 2.96f)
                curveToRelative(-0.98f, 0.65f, -1.56f, 1.74f, -1.56f, 2.91f)
                verticalLineToRelative(10.43f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 13.57f)
                curveToRelative(0.0f, -0.96f, -0.39f, -1.86f, -1.06f, -2.51f)
                close()
                moveTo(17.75f, 7.0f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                curveToRelative(0.0f, 0.44f, -0.23f, 0.83f, -0.58f, 1.06f)
                lineToRelative(-1.9f, -1.27f)
                curveToRelative(0.1f, -0.59f, 0.61f, -1.04f, 1.23f, -1.04f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(-0.43f)
                curveToRelative(0.0f, -0.17f, 0.08f, -0.32f, 0.22f, -0.42f)
                lineToRelative(5.78f, -3.85f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.3f)
                lineToRelative(5.78f, 3.85f)
                curveToRelative(0.14f, 0.09f, 0.22f, 0.25f, 0.22f, 0.42f)
                verticalLineToRelative(7.43f)
                close()
            }
        }
        .build()
        return _jug!!
    }

private var _jug: ImageVector? = null
