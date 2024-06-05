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

public val Icons.Outline.SquareM: ImageVector
    get() {
        if (_squareM != null) {
            return _squareM!!
        }
        _squareM = Builder(name = "SquareM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(19.0f, 6.812f)
                verticalLineToRelative(12.188f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.557f)
                lineToRelative(-5.0f, 8.026f)
                lineTo(7.0f, 7.56f)
                verticalLineToRelative(11.44f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 6.812f)
                curveToRelative(0.0f, -0.817f, 0.479f, -1.496f, 1.221f, -1.73f)
                curveToRelative(0.751f, -0.238f, 1.569f, 0.048f, 2.032f, 0.709f)
                lineToRelative(3.747f, 6.011f)
                lineToRelative(3.718f, -5.966f)
                curveToRelative(0.493f, -0.707f, 1.309f, -0.989f, 2.061f, -0.754f)
                curveToRelative(0.742f, 0.234f, 1.221f, 0.913f, 1.221f, 1.73f)
                close()
            }
        }
        .build()
        return _squareM!!
    }

private var _squareM: ImageVector? = null
