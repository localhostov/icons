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

public val Icons.Filled.Hippo: ImageVector
    get() {
        if (_hippo != null) {
            return _hippo!!
        }
        _hippo = Builder(name = "Hippo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(0.262f)
                curveToRelative(0.716f, -0.48f, 1.575f, -0.762f, 2.5f, -0.762f)
                reflectiveCurveToRelative(1.784f, 0.282f, 2.5f, 0.762f)
                verticalLineToRelative(-0.262f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.262f)
                curveToRelative(0.48f, 0.716f, 0.762f, 1.575f, 0.762f, 2.5f)
                verticalLineToRelative(0.757f)
                curveToRelative(0.944f, 0.708f, 1.5f, 1.808f, 1.5f, 2.993f)
                curveToRelative(0.0f, 1.433f, -0.816f, 2.665f, -2.0f, 3.296f)
                verticalLineToRelative(-1.046f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.046f)
                curveToRelative(-1.184f, -0.631f, -2.0f, -1.864f, -2.0f, -3.296f)
                curveToRelative(0.0f, -1.185f, 0.556f, -2.284f, 1.5f, -2.993f)
                verticalLineToRelative(-0.757f)
                curveToRelative(0.0f, -0.925f, 0.282f, -1.784f, 0.762f, -2.5f)
                horizontalLineToRelative(-0.262f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 15.0f)
                curveToRelative(-3.038f, 0.0f, -5.5f, -2.462f, -5.5f, -5.5f)
                curveToRelative(0.0f, -1.862f, 0.928f, -3.505f, 2.344f, -4.5f)
                horizontalLineToRelative(-3.344f)
                curveTo(4.589f, 5.0f, 1.0f, 8.589f, 1.0f, 13.0f)
                curveToRelative(0.0f, 0.87f, 0.148f, 1.721f, 0.418f, 2.526f)
                lineTo(0.0f, 18.034f)
                lineToRelative(1.741f, 0.983f)
                lineToRelative(0.771f, -1.364f)
                curveToRelative(0.421f, 0.587f, 0.913f, 1.126f, 1.487f, 1.586f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.08f)
                curveToRelative(1.782f, -1.034f, 3.08f, -2.722f, 3.659f, -4.661f)
                lineToRelative(0.302f, -0.845f)
                curveToRelative(-0.741f, 0.372f, -1.575f, 0.587f, -2.461f, 0.587f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _hippo!!
    }

private var _hippo: ImageVector? = null
