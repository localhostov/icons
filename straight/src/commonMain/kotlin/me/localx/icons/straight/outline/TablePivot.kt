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

public val Icons.Outline.TablePivot: ImageVector
    get() {
        if (_tablePivot != null) {
            return _tablePivot!!
        }
        _tablePivot = Builder(name = "TablePivot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(6.731f)
                lineToRelative(-2.0f, -1.976f)
                verticalLineToRelative(-0.755f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(4.738f)
                curveToRelative(0.033f, 0.036f, 0.057f, 0.078f, 0.092f, 0.113f)
                lineToRelative(1.887f, 1.887f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(2.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(5.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 9.0f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(12.285f, 16.292f)
                curveToRelative(-0.38f, 0.391f, -0.38f, 1.025f, 0.0f, 1.416f)
                lineToRelative(2.715f, 2.792f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.023f)
                horizontalLineToRelative(2.455f)
                lineToRelative(-2.756f, -2.711f)
                curveToRelative(-0.386f, -0.386f, -1.012f, -0.386f, -1.398f, 0.0f)
                lineToRelative(-2.756f, 2.711f)
                horizontalLineToRelative(2.455f)
                verticalLineToRelative(2.023f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-2.715f, 2.792f)
                close()
            }
        }
        .build()
        return _tablePivot!!
    }

private var _tablePivot: ImageVector? = null
