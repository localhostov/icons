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

public val Icons.Outline.MillSign: ImageVector
    get() {
        if (_millSign != null) {
            return _millSign!!
        }
        _millSign = Builder(name = "MillSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.74f, 0.0f, -1.43f, 0.22f, -2.03f, 0.57f)
                lineToRelative(-1.97f, 5.43f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-2.73f, 7.5f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(4.86f, -13.35f)
                verticalLineToRelative(-1.65f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4.0f, -1.54f)
                curveToRelative(2.09f, 0.0f, 3.92f, 1.07f, 5.0f, 2.69f)
                curveToRelative(0.36f, -0.54f, 0.81f, -1.02f, 1.32f, -1.42f)
                lineTo(14.87f, 0.0f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.13f, 3.11f)
                curveToRelative(0.37f, -0.07f, 0.74f, -0.11f, 1.13f, -0.11f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _millSign!!
    }

private var _millSign: ImageVector? = null
