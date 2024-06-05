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

public val Icons.Bold.MillSign: ImageVector
    get() {
        if (_millSign != null) {
            return _millSign!!
        }
        _millSign = Builder(name = "MillSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.75f)
                verticalLineToRelative(11.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(9.75f)
                curveToRelative(0.0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                curveToRelative(-0.8f, 0.0f, -1.54f, 0.25f, -2.15f, 0.68f)
                lineToRelative(-1.6f, 4.41f)
                verticalLineToRelative(9.91f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.66f)
                lineToRelative(-1.7f, 4.66f)
                horizontalLineToRelative(-3.19f)
                lineToRelative(4.89f, -13.44f)
                verticalLineToRelative(-0.81f)
                curveToRelative(0.0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                reflectiveCurveToRelative(-3.75f, 1.68f, -3.75f, 3.75f)
                verticalLineToRelative(11.25f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.14f)
                curveToRelative(1.07f, -0.72f, 2.36f, -1.14f, 3.75f, -1.14f)
                curveToRelative(2.12f, 0.0f, 4.01f, 0.98f, 5.25f, 2.51f)
                curveToRelative(0.17f, -0.21f, 0.36f, -0.42f, 0.56f, -0.61f)
                lineTo(14.34f, 0.0f)
                horizontalLineToRelative(3.19f)
                lineToRelative(-1.11f, 3.05f)
                curveToRelative(0.27f, -0.03f, 0.55f, -0.05f, 0.83f, -0.05f)
                curveToRelative(3.72f, 0.0f, 6.75f, 3.03f, 6.75f, 6.75f)
                close()
            }
        }
        .build()
        return _millSign!!
    }

private var _millSign: ImageVector? = null
