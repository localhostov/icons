package me.localx.icons.rounded.filled

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

public val Icons.Filled.CodeCommit: ImageVector
    get() {
        if (_codeCommit != null) {
            return _codeCommit!!
        }
        _codeCommit = Builder(name = "CodeCommit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineToRelative(-4.072f)
                curveToRelative(-0.487f, -3.388f, -3.408f, -6.0f, -6.928f, -6.0f)
                reflectiveCurveToRelative(-6.442f, 2.612f, -6.928f, 6.0f)
                horizontalLineTo(1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(5.072f)
                curveToRelative(0.487f, 3.388f, 3.408f, 6.0f, 6.928f, 6.0f)
                reflectiveCurveToRelative(6.441f, -2.612f, 6.928f, -6.0f)
                horizontalLineToRelative(4.072f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _codeCommit!!
    }

private var _codeCommit: ImageVector? = null
