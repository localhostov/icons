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

public val Icons.Filled.FaceGrinTongueWink: ImageVector
    get() {
        if (_faceGrinTongueWink != null) {
            return _faceGrinTongueWink!!
        }
        _faceGrinTongueWink = Builder(name = "FaceGrinTongueWink", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.6f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.0f, 0.662f, -0.411f, 1.4f, -1.0f, 1.4f)
                reflectiveCurveToRelative(-1.0f, -0.738f, -1.0f, -1.4f)
                close()
                moveTo(15.5f, 8.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(8.686f, 10.983f)
                lineToRelative(1.406f, -1.422f)
                curveToRelative(-0.792f, -0.784f, -1.913f, -1.265f, -3.073f, -1.265f)
                curveToRelative(-1.044f, 0.0f, -2.12f, 0.39f, -3.019f, 1.297f)
                lineToRelative(1.422f, 1.406f)
                curveToRelative(1.19f, -1.202f, 2.604f, -0.669f, 3.264f, -0.017f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.0f, 1.636f, 1.147f, 3.4f, 3.0f, 3.4f)
                reflectiveCurveToRelative(3.0f, -1.765f, 3.0f, -3.4f)
                verticalLineToRelative(-0.6f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 9.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _faceGrinTongueWink!!
    }

private var _faceGrinTongueWink: ImageVector? = null
