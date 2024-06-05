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

public val Icons.Bold.ReflectVertical: ImageVector
    get() {
        if (_reflectVertical != null) {
            return _reflectVertical!!
        }
        _reflectVertical = Builder(name = "ReflectVertical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(0.74f, 0.0f, 1.45f, -0.32f, 1.93f, -0.86f)
                lineTo(21.38f, 0.0f)
                lineTo(2.62f, 0.0f)
                lineToRelative(7.44f, 8.13f)
                curveToRelative(0.5f, 0.55f, 1.2f, 0.87f, 1.94f, 0.87f)
                close()
                moveTo(14.57f, 3.0f)
                lineToRelative(-2.57f, 2.81f)
                lineToRelative(-2.57f, -2.81f)
                horizontalLineToRelative(5.15f)
                close()
                moveTo(10.06f, 15.85f)
                lineTo(2.62f, 24.0f)
                lineTo(21.38f, 24.0f)
                lineToRelative(-7.44f, -8.13f)
                curveToRelative(-0.99f, -1.1f, -2.91f, -1.09f, -3.88f, -0.01f)
                close()
                moveTo(23.99f, 10.5f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 10.5f)
                close()
            }
        }
        .build()
        return _reflectVertical!!
    }

private var _reflectVertical: ImageVector? = null
