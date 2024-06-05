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

public val Icons.Bold.ReflectHorizontalAlt: ImageVector
    get() {
        if (_reflectHorizontalAlt != null) {
            return _reflectHorizontalAlt!!
        }
        _reflectHorizontalAlt = Builder(name = "ReflectHorizontalAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.811f, 5.698f)
                curveToRelative(-0.64f, -0.644f, -1.594f, -0.836f, -2.432f, -0.489f)
                curveToRelative(-0.838f, 0.345f, -1.379f, 1.154f, -1.379f, 2.061f)
                verticalLineToRelative(9.458f)
                curveToRelative(0.0f, 0.907f, 0.542f, 1.717f, 1.381f, 2.062f)
                curveToRelative(0.276f, 0.113f, 0.565f, 0.169f, 0.851f, 0.169f)
                curveToRelative(0.583f, 0.0f, 1.153f, -0.229f, 1.581f, -0.662f)
                lineToRelative(4.32f, -4.36f)
                curveToRelative(0.551f, -0.492f, 0.868f, -1.198f, 0.868f, -1.938f)
                reflectiveCurveToRelative(-0.315f, -1.45f, -0.803f, -1.885f)
                lineTo(3.811f, 5.698f)
                close()
                moveTo(3.0f, 14.856f)
                verticalLineToRelative(-5.719f)
                lineToRelative(2.838f, 2.855f)
                lineToRelative(-2.838f, 2.863f)
                close()
                moveTo(22.621f, 5.209f)
                curveToRelative(-0.838f, -0.346f, -1.792f, -0.153f, -2.432f, 0.49f)
                lineToRelative(-4.325f, 4.356f)
                curveToRelative(-0.549f, 0.493f, -0.864f, 1.202f, -0.864f, 1.943f)
                reflectiveCurveToRelative(0.316f, 1.445f, 0.802f, 1.875f)
                lineToRelative(4.384f, 4.423f)
                curveToRelative(0.429f, 0.433f, 0.999f, 0.662f, 1.582f, 0.662f)
                curveToRelative(0.286f, 0.0f, 0.575f, -0.056f, 0.851f, -0.169f)
                curveToRelative(0.839f, -0.346f, 1.381f, -1.155f, 1.381f, -2.062f)
                lineTo(24.0f, 7.27f)
                curveToRelative(0.0f, -0.906f, -0.542f, -1.716f, -1.379f, -2.061f)
                close()
                moveTo(21.0f, 14.857f)
                lineToRelative(-2.839f, -2.86f)
                lineToRelative(2.839f, -2.858f)
                verticalLineToRelative(5.719f)
                close()
                moveTo(13.5f, 1.5f)
                lineTo(13.5f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(10.5f, 1.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _reflectHorizontalAlt!!
    }

private var _reflectHorizontalAlt: ImageVector? = null
