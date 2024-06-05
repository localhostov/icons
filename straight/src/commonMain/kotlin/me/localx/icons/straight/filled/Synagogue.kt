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

public val Icons.Filled.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 3.782f)
                lineTo(12.0f, 0.032f)
                lineToRelative(-5.0f, 3.75f)
                verticalLineToRelative(20.218f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 3.782f)
                close()
                moveTo(15.0f, 11.731f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-0.9f, 1.5f)
                lineToRelative(-0.9f, -1.5f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(1.05f, -1.75f)
                lineToRelative(-1.05f, -1.75f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -1.5f)
                lineToRelative(0.9f, 1.5f)
                horizontalLineToRelative(2.1f)
                lineToRelative(-1.05f, 1.75f)
                lineToRelative(1.05f, 1.75f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 11.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-12.5f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(2.5f, 2.0f)
                close()
                moveTo(5.0f, 11.5f)
                verticalLineToRelative(12.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-12.5f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(2.5f, 2.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
