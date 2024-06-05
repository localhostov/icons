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

public val Icons.Outline.HouseChimney: ImageVector
    get() {
        if (_houseChimney != null) {
            return _houseChimney!!
        }
        _houseChimney = Builder(name = "HouseChimney", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.724f)
                lineTo(22.0f, 2.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.366f)
                lineTo(14.797f, 0.855f)
                curveToRelative(-1.699f, -1.146f, -3.895f, -1.146f, -5.594f, 0.0f)
                lineTo(2.203f, 5.579f)
                curveToRelative(-1.379f, 0.931f, -2.203f, 2.48f, -2.203f, 4.145f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(9.0f, 15.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 9.724f)
                curveToRelative(0.0f, -1.581f, -0.744f, -3.058f, -2.0f, -4.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 9.724f)
                curveToRelative(0.0f, -0.999f, 0.494f, -1.929f, 1.322f, -2.487f)
                lineTo(10.322f, 2.513f)
                curveToRelative(1.02f, -0.688f, 2.336f, -0.688f, 3.355f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                curveToRelative(0.828f, 0.558f, 1.322f, 1.488f, 1.322f, 2.487f)
                verticalLineToRelative(9.276f)
                close()
            }
        }
        .build()
        return _houseChimney!!
    }

private var _houseChimney: ImageVector? = null
