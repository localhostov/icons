package me.localx.icons.straight.outline

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

public val Icons.Outline.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.809f, 24.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -4.86f, -0.72f)
                arcTo(3.071f, 3.071f, 0.0f, false, true, 0.88f, 23.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.16f, -4.07f)
                curveTo(-0.579f, 15.1f, -0.445f, 8.2f, 3.875f, 3.875f)
                reflectiveCurveTo(15.1f, -0.578f, 19.051f, 0.719f)
                arcToRelative(3.072f, 3.072f, 0.0f, false, true, 4.069f, 0.16f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.16f, 4.07f)
                curveToRelative(1.3f, 3.956f, 1.165f, 10.855f, -3.155f, 15.176f)
                arcTo(14.51f, 14.51f, 0.0f, false, true, 9.809f, 24.0f)
                close()
                moveTo(14.209f, 2.0f)
                arcTo(12.593f, 12.593f, 0.0f, false, false, 5.289f, 5.289f)
                curveTo(1.42f, 9.159f, 1.517f, 15.715f, 2.8f, 18.928f)
                lineToRelative(0.244f, 0.611f)
                lineToRelative(-0.751f, 0.753f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, false, 1.413f, 0.0f)
                lineToRelative(0.754f, -0.752f)
                lineToRelative(0.612f, 0.244f)
                curveToRelative(3.212f, 1.284f, 9.768f, 1.382f, 13.638f, -2.488f)
                reflectiveCurveTo(22.483f, 8.285f, 21.2f, 5.072f)
                lineToRelative(-0.244f, -0.611f)
                lineToRelative(0.752f, -0.754f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.413f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, false, -1.413f, 0.0f)
                lineToRelative(-0.754f, 0.753f)
                lineTo(18.927f, 2.8f)
                arcTo(13.16f, 13.16f, 0.0f, false, false, 14.21f, 2.0f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 12.0f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 9.0f)
                close()
                moveTo(19.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 9.0f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
