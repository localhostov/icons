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

public val Icons.Outline.Gramophone: ImageVector
    get() {
        if (_gramophone != null) {
            return _gramophone!!
        }
        _gramophone = Builder(name = "Gramophone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 20.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-3.318f)
                curveToRelative(-0.845f, -0.172f, -7.818f, -1.693f, -10.685f, -5.592f)
                lineToRelative(-0.3f, -0.408f)
                horizontalLineToRelative(-1.696f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(1.696f)
                lineToRelative(0.3f, -0.408f)
                curveToRelative(2.859f, -3.887f, 9.832f, -5.418f, 10.685f, -5.592f)
                horizontalLineToRelative(3.319f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 17.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 10.673f)
                lineTo(6.0f, 3.327f)
                curveToRelative(2.038f, 1.776f, 4.685f, 2.949f, 6.8f, 3.673f)
                curveToRelative(-2.116f, 0.725f, -4.763f, 1.897f, -6.8f, 3.673f)
                close()
                moveTo(4.0f, 20.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _gramophone!!
    }

private var _gramophone: ImageVector? = null
