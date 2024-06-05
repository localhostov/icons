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

public val Icons.Bold.SourceDocument: ImageVector
    get() {
        if (_sourceDocument != null) {
            return _sourceDocument!!
        }
        _sourceDocument = Builder(name = "SourceDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-0.051f)
                curveToRelative(1.14f, -0.232f, 2.0f, -1.242f, 2.0f, -2.449f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.108f, -0.607f, 2.064f, -1.5f, 2.584f)
                verticalLineToRelative(4.416f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.416f)
                curveToRelative(-0.893f, -0.52f, -1.5f, -1.476f, -1.5f, -2.584f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                curveToRelative(-0.184f, 0.0f, -0.363f, -0.022f, -0.538f, -0.054f)
                lineToRelative(-2.151f, 2.527f)
                lineToRelative(-2.284f, -1.945f)
                lineToRelative(2.155f, -2.532f)
                curveToRelative(-0.111f, -0.313f, -0.182f, -0.645f, -0.182f, -0.996f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(5.689f, 11.473f)
                lineToRelative(-2.151f, -2.527f)
                curveToRelative(-0.175f, 0.032f, -0.353f, 0.054f, -0.538f, 0.054f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.351f, -0.072f, 0.683f, -0.182f, 0.996f)
                lineToRelative(2.155f, 2.532f)
                lineToRelative(-2.284f, 1.945f)
                close()
            }
        }
        .build()
        return _sourceDocument!!
    }

private var _sourceDocument: ImageVector? = null
