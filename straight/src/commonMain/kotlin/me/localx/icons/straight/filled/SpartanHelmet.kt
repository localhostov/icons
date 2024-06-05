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

public val Icons.Filled.SpartanHelmet: ImageVector
    get() {
        if (_spartanHelmet != null) {
            return _spartanHelmet!!
        }
        _spartanHelmet = Builder(name = "SpartanHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.002f, 24.0f)
                verticalLineTo(15.234f)
                curveToRelative(-1.392f, -0.962f, -2.997f, -2.378f, -2.997f, -3.795f)
                curveToRelative(0.0f, -1.5f, 1.0f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.541f, 0.0f, 1.077f, 0.249f, 1.5f, 0.616f)
                lineToRelative(1.0f, 1.124f)
                lineToRelative(1.0f, -1.124f)
                curveToRelative(0.423f, -0.368f, 0.959f, -0.616f, 1.5f, -0.616f)
                curveToRelative(1.5f, 0.0f, 2.5f, 1.0f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.419f, -1.61f, 2.836f, -3.003f, 3.798f)
                verticalLineToRelative(8.762f)
                lineToRelative(8.829f, -2.386f)
                lineToRelative(-1.832f, -4.932f)
                curveToRelative(0.301f, -0.869f, 0.989f, -3.135f, 0.989f, -5.713f)
                curveTo(21.988f, 3.383f, 12.709f, 0.236f, 12.314f, 0.105f)
                lineTo(12.001f, 0.003f)
                lineToRelative(-0.313f, 0.104f)
                curveToRelative(-0.395f, 0.13f, -9.659f, 3.276f, -9.659f, 10.863f)
                curveToRelative(0.0f, 2.577f, 0.688f, 4.841f, 0.989f, 5.712f)
                lineToRelative(-1.85f, 4.932f)
                lineToRelative(8.833f, 2.387f)
                close()
            }
        }
        .build()
        return _spartanHelmet!!
    }

private var _spartanHelmet: ImageVector? = null
