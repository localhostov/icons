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

public val Icons.Bold.FaceEyesXmarks: ImageVector
    get() {
        if (_faceEyesXmarks != null) {
            return _faceEyesXmarks!!
        }
        _faceEyesXmarks = Builder(name = "FaceEyesXmarks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.121f, 10.0f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.439f, 1.439f)
                close()
                moveTo(8.0f, 12.121f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-1.439f, -1.439f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(1.439f, 1.439f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.439f, -1.439f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _faceEyesXmarks!!
    }

private var _faceEyesXmarks: ImageVector? = null
