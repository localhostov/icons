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

public val Icons.Filled.License: ImageVector
    get() {
        if (_license != null) {
            return _license!!
        }
        _license = Builder(name = "License", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 5.0f)
                horizontalLineToRelative(-4.41f)
                lineTo(17.0f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(18.0f, 16.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.47f, 0.81f, 2.75f, 2.0f, 3.44f)
                verticalLineToRelative(4.56f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-4.56f)
                curveToRelative(1.19f, -0.69f, 2.0f, -1.97f, 2.0f, -3.44f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-3.54f)
                curveToRelative(-1.22f, -1.1f, -2.0f, -2.69f, -2.0f, -4.46f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                curveToRelative(0.0f, 1.77f, -0.78f, 3.36f, -2.0f, 4.46f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _license!!
    }

private var _license: ImageVector? = null
