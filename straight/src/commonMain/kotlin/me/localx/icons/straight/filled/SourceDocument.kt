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

public val Icons.Filled.SourceDocument: ImageVector
    get() {
        if (_sourceDocument != null) {
            return _sourceDocument!!
        }
        _sourceDocument = Builder(name = "SourceDocument", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.225f, 0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(7.781f, 9.375f)
                lineToRelative(-2.239f, -2.798f)
                curveToRelative(0.285f, -0.459f, 0.458f, -0.996f, 0.458f, -1.577f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(0.0f, 3.343f, 0.0f, 5.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.344f, 0.0f, 0.67f, -0.07f, 0.978f, -0.177f)
                lineToRelative(2.241f, 2.802f)
                lineToRelative(1.562f, -1.25f)
                close()
                moveTo(11.0f, 5.816f)
                verticalLineToRelative(4.184f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.184f)
                curveToRelative(1.163f, -0.413f, 2.0f, -1.512f, 2.0f, -2.816f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.304f, 0.837f, 2.403f, 2.0f, 2.816f)
                close()
                moveTo(21.0f, 2.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.581f, 0.172f, 1.118f, 0.458f, 1.577f)
                lineToRelative(-2.239f, 2.798f)
                lineToRelative(1.562f, 1.25f)
                lineToRelative(2.241f, -2.802f)
                curveToRelative(0.308f, 0.107f, 0.633f, 0.177f, 0.978f, 0.177f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _sourceDocument!!
    }

private var _sourceDocument: ImageVector? = null
