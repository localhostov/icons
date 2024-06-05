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

public val Icons.Filled.Digging: ImageVector
    get() {
        if (_digging != null) {
            return _digging!!
        }
        _digging = Builder(name = "Digging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.379f, 24.0f)
                lineToRelative(3.091f, -4.415f)
                lineTo(0.936f, 10.325f)
                lineToRelative(1.129f, -1.65f)
                lineToRelative(2.739f, 1.874f)
                lineToRelative(0.919f, -2.561f)
                curveToRelative(0.289f, -0.806f, 0.91f, -1.451f, 1.705f, -1.771f)
                curveToRelative(0.795f, -0.32f, 1.689f, -0.284f, 2.456f, 0.098f)
                lineToRelative(0.47f, 0.177f)
                curveToRelative(1.148f, 0.572f, 2.022f, 1.552f, 2.461f, 2.759f)
                lineToRelative(1.425f, 4.143f)
                lineToRelative(-1.881f, 0.684f)
                lineToRelative(-1.424f, -4.143f)
                curveToRelative(-0.039f, -0.106f, -0.094f, -0.202f, -0.143f, -0.302f)
                lineToRelative(-1.407f, 3.923f)
                lineToRelative(6.232f, 4.393f)
                lineToRelative(3.474f, -4.962f)
                lineToRelative(4.957f, 11.015f)
                horizontalLineToRelative(-12.668f)
                close()
                moveTo(11.5f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(2.154f)
                lineToRelative(2.827f, -7.878f)
                lineToRelative(-1.729f, -1.183f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.443f)
                lineToRelative(-2.0f, -1.368f)
                verticalLineToRelative(5.812f)
                close()
            }
        }
        .build()
        return _digging!!
    }

private var _digging: ImageVector? = null
