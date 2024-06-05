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

public val Icons.Outline.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = Builder(name = "TowerControl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.092f, 7.464f)
                curveToRelative(-0.763f, -0.931f, -1.89f, -1.464f, -3.093f, -1.464f)
                horizontalLineToRelative(-3.999f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.999f)
                curveToRelative(-1.203f, 0.0f, -2.33f, 0.533f, -3.093f, 1.464f)
                reflectiveCurveTo(-0.157f, 9.604f, 0.079f, 10.784f)
                lineToRelative(0.72f, 3.599f)
                curveToRelative(0.419f, 2.096f, 2.274f, 3.617f, 4.412f, 3.617f)
                horizontalLineToRelative(2.789f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.789f)
                curveToRelative(2.138f, 0.0f, 3.993f, -1.521f, 4.412f, -3.617f)
                lineToRelative(0.72f, -3.599f)
                curveToRelative(0.236f, -1.18f, -0.066f, -2.39f, -0.829f, -3.32f)
                close()
                moveTo(21.545f, 8.732f)
                curveToRelative(0.382f, 0.466f, 0.533f, 1.07f, 0.415f, 1.66f)
                lineToRelative(-0.322f, 1.608f)
                horizontalLineToRelative(-5.638f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.999f)
                curveToRelative(0.602f, 0.0f, 1.165f, 0.267f, 1.546f, 0.731f)
                close()
                moveTo(10.0f, 12.001f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(11.0f, 4.001f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.455f, 8.731f)
                curveToRelative(0.381f, -0.465f, 0.944f, -0.731f, 1.546f, -0.731f)
                horizontalLineToRelative(3.999f)
                verticalLineToRelative(4.0f)
                lineTo(2.362f, 12.0f)
                lineToRelative(-0.322f, -1.608f)
                curveToRelative(-0.118f, -0.59f, 0.033f, -1.194f, 0.415f, -1.66f)
                close()
                moveTo(14.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.789f, 16.0f)
                lineTo(5.211f, 16.0f)
                curveToRelative(-1.184f, 0.0f, -2.212f, -0.84f, -2.449f, -2.0f)
                lineTo(21.238f, 14.0f)
                curveToRelative(-0.237f, 1.16f, -1.265f, 2.0f, -2.449f, 2.0f)
                close()
            }
        }
        .build()
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
