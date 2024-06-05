package me.localx.icons.rounded.bold

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

public val Icons.Bold.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 9.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.063f)
                curveToRelative(-1.042f, 0.0f, -2.022f, 0.459f, -2.688f, 1.259f)
                lineToRelative(-1.451f, 1.741f)
                horizontalLineToRelative(-0.297f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.671f)
                curveToRelative(0.0f, 0.935f, 0.364f, 1.814f, 1.025f, 2.475f)
                lineToRelative(1.828f, 1.828f)
                curveToRelative(0.661f, 0.661f, 1.54f, 1.025f, 2.475f, 1.025f)
                horizontalLineToRelative(8.171f)
                curveToRelative(1.208f, 0.0f, 2.217f, -0.86f, 2.45f, -2.0f)
                horizontalLineToRelative(0.55f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-7.671f)
                curveToRelative(-0.134f, 0.0f, -0.259f, -0.052f, -0.354f, -0.146f)
                lineToRelative(-1.828f, -1.828f)
                curveToRelative(-0.094f, -0.095f, -0.146f, -0.22f, -0.146f, -0.354f)
                verticalLineToRelative(-4.671f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.445f, 0.0f, 0.867f, -0.198f, 1.152f, -0.54f)
                lineToRelative(1.9f, -2.281f)
                curveToRelative(0.095f, -0.114f, 0.235f, -0.18f, 0.384f, -0.18f)
                horizontalLineToRelative(6.063f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.829f, 0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
