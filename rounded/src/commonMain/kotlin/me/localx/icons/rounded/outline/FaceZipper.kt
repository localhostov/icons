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

public val Icons.Outline.FaceZipper: ImageVector
    get() {
        if (_faceZipper != null) {
            return _faceZipper!!
        }
        _faceZipper = Builder(name = "FaceZipper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.921f, 0.0f, 3.756f, -0.44f, 5.455f, -1.309f)
                curveToRelative(0.492f, -0.251f, 0.687f, -0.854f, 0.436f, -1.346f)
                reflectiveCurveToRelative(-0.854f, -0.685f, -1.346f, -0.436f)
                curveToRelative(-1.415f, 0.723f, -2.944f, 1.09f, -4.545f, 1.09f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.611f, -0.056f, 1.223f, -0.165f, 1.819f)
                curveToRelative(-0.1f, 0.543f, 0.26f, 1.064f, 0.803f, 1.164f)
                curveToRelative(0.551f, 0.1f, 1.064f, -0.26f, 1.164f, -0.803f)
                curveToRelative(0.132f, -0.715f, 0.198f, -1.449f, 0.198f, -2.181f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(12.0f, 15.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(19.978f, 16.34f)
                lineToRelative(-0.565f, -0.251f)
                curveToRelative(-0.373f, -0.169f, -0.818f, -0.092f, -1.112f, 0.197f)
                curveToRelative(-0.295f, 0.29f, -0.382f, 0.73f, -0.219f, 1.109f)
                curveToRelative(1.146f, 2.66f, 1.379f, 2.893f, 1.505f, 3.019f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.048f, 0.0f, -2.828f)
                curveToRelative(-0.251f, -0.251f, -0.708f, -0.485f, -2.437f, -1.246f)
                close()
            }
        }
        .build()
        return _faceZipper!!
    }

private var _faceZipper: ImageVector? = null
