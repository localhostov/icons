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

public val Icons.Filled.FaceEyesXmarks: ImageVector
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
                moveTo(5.018f, 11.793f)
                lineToRelative(1.568f, -1.568f)
                lineToRelative(-1.568f, -1.568f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.568f, 1.568f)
                lineToRelative(1.568f, -1.568f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.568f, 1.568f)
                lineToRelative(1.568f, 1.568f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.568f, -1.568f)
                lineToRelative(-1.568f, 1.568f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(18.982f, 11.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.568f, -1.568f)
                lineToRelative(-1.568f, 1.568f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.568f, -1.568f)
                lineToRelative(-1.568f, -1.568f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.568f, 1.568f)
                lineToRelative(1.568f, -1.568f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.568f, 1.568f)
                lineToRelative(1.568f, 1.568f)
                close()
            }
        }
        .build()
        return _faceEyesXmarks!!
    }

private var _faceEyesXmarks: ImageVector? = null
