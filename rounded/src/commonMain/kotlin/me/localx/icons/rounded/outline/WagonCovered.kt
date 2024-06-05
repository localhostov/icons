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

public val Icons.Outline.WagonCovered: ImageVector
    get() {
        if (_wagonCovered != null) {
            return _wagonCovered!!
        }
        _wagonCovered = Builder(name = "WagonCovered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.239f, 1.465f)
                arcTo(2.69f, 2.69f, 0.0f, false, false, 20.81f, 0.682f)
                lineTo(20.4f, 0.765f)
                arcTo(12.043f, 12.043f, 0.0f, false, true, 19.0f, 1.0f)
                curveToRelative(-1.0f, 0.0f, -1.991f, -1.0f, -3.0f, -1.0f)
                reflectiveCurveToRelative(-2.5f, 1.0f, -4.0f, 1.0f)
                reflectiveCurveTo(8.988f, 0.0f, 7.994f, 0.0f)
                reflectiveCurveTo(6.0f, 1.0f, 5.0f, 1.0f)
                arcTo(12.043f, 12.043f, 0.0f, false, true, 3.605f, 0.765f)
                lineTo(3.192f, 0.683f)
                arcToRelative(2.683f, 2.683f, 0.0f, false, false, -2.431f, 0.782f)
                arcTo(2.711f, 2.711f, 0.0f, false, false, 0.066f, 3.948f)
                lineTo(2.0f, 13.105f)
                lineTo(2.0f, 20.0f)
                arcToRelative(4.005f, 4.005f, 0.0f, false, false, 7.873f, 1.0f)
                horizontalLineToRelative(4.254f)
                arcTo(4.005f, 4.005f, 0.0f, false, false, 22.0f, 20.0f)
                lineTo(22.0f, 13.105f)
                lineToRelative(1.93f, -9.139f)
                arcTo(2.719f, 2.719f, 0.0f, false, false, 23.239f, 1.465f)
                close()
                moveTo(2.2f, 2.85f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, true, 0.621f, -0.2f)
                lineToRelative(0.377f, 0.076f)
                arcTo(4.77f, 4.77f, 0.0f, false, false, 7.0f, 2.457f)
                lineTo(7.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 9.0f)
                lineTo(9.0f, 2.3f)
                arcTo(8.347f, 8.347f, 0.0f, false, false, 12.0f, 3.0f)
                arcToRelative(8.347f, 8.347f, 0.0f, false, false, 3.0f, -0.7f)
                lineTo(15.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(17.0f, 2.457f)
                arcToRelative(4.766f, 4.766f, 0.0f, false, false, 3.8f, 0.267f)
                lineToRelative(0.379f, -0.077f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, true, 0.619f, 0.2f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, true, 0.181f, 0.684f)
                lineTo(20.189f, 12.0f)
                lineTo(3.811f, 12.0f)
                lineTo(2.02f, 3.517f)
                arcTo(0.72f, 0.72f, 0.0f, false, true, 2.2f, 2.85f)
                close()
                moveTo(14.127f, 19.0f)
                lineTo(9.873f, 19.0f)
                arcTo(4.032f, 4.032f, 0.0f, false, false, 4.0f, 16.537f)
                lineTo(4.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(2.537f)
                arcTo(4.032f, 4.032f, 0.0f, false, false, 14.127f, 19.0f)
                close()
                moveTo(6.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 22.0f)
                close()
                moveTo(18.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _wagonCovered!!
    }

private var _wagonCovered: ImageVector? = null
