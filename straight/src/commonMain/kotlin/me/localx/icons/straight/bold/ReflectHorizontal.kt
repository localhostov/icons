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

public val Icons.Bold.ReflectHorizontal: ImageVector
    get() {
        if (_reflectHorizontal != null) {
            return _reflectHorizontal!!
        }
        _reflectHorizontal = Builder(name = "ReflectHorizontal", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.61f)
                lineTo(0.0f, 21.39f)
                lineToRelative(8.13f, -7.44f)
                curveToRelative(0.55f, -0.49f, 0.87f, -1.2f, 0.87f, -1.94f)
                reflectiveCurveToRelative(-0.32f, -1.45f, -0.86f, -1.93f)
                lineTo(0.0f, 2.61f)
                close()
                moveTo(3.01f, 14.57f)
                verticalLineToRelative(-5.15f)
                lineToRelative(2.81f, 2.57f)
                lineToRelative(-2.81f, 2.57f)
                close()
                moveTo(15.87f, 10.05f)
                curveToRelative(-0.55f, 0.5f, -0.87f, 1.2f, -0.87f, 1.94f)
                reflectiveCurveToRelative(0.32f, 1.45f, 0.86f, 1.93f)
                lineToRelative(8.14f, 7.45f)
                lineTo(24.0f, 2.62f)
                lineToRelative(-8.13f, 7.44f)
                close()
                moveTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 0.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontal!!
    }

private var _reflectHorizontal: ImageVector? = null
