package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Shelves: ImageVector
    get() {
        if (_shelves != null) {
            return _shelves!!
        }
        _shelves = Builder(name = "Shelves", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(0.0f, 0.447f, 0.0f, 1.0f)
                verticalLineToRelative(22.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(24.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(17.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(2.0f, 15.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.29f, -2.0f, 0.766f)
                curveToRelative(-0.531f, -0.476f, -1.232f, -0.766f, -2.0f, -0.766f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.351f, 0.0f, -0.687f, 0.061f, -1.0f, 0.172f)
                verticalLineToRelative(-3.172f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _shelves!!
    }

private var _shelves: ImageVector? = null
