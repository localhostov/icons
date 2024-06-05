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

public val Icons.Bold.DumbbellRay: ImageVector
    get() {
        if (_dumbbellRay != null) {
            return _dumbbellRay!!
        }
        _dumbbellRay = Builder(name = "DumbbellRay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                lineTo(1.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.423f, 9.0f)
                horizontalLineToRelative(3.077f)
                lineToRelative(-1.41f, 5.0f)
                horizontalLineToRelative(1.199f)
                lineToRelative(5.058f, -7.594f)
                curveToRelative(0.399f, -0.602f, -0.032f, -1.406f, -0.754f, -1.406f)
                horizontalLineToRelative(-3.057f)
                lineTo(14.5f, 0.0f)
                horizontalLineToRelative(-4.303f)
                lineToRelative(-2.657f, 7.81f)
                curveToRelative(-0.179f, 0.592f, 0.264f, 1.19f, 0.883f, 1.19f)
                close()
            }
        }
        .build()
        return _dumbbellRay!!
    }

private var _dumbbellRay: ImageVector? = null
